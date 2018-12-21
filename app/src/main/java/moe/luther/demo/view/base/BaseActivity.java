package moe.luther.demo.view.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import moe.luther.demo.App;
import moe.luther.demo.page.login.LoginManager;
import moe.luther.demo.page.login.activity.LoginActivity;
import moe.luther.demo.util.ToastUtil;

/**
 * activity基类
 * 公共方法
 * 1.butterknife初始化
 * 2.登录检测 checkLogin
 * 3.全屏显示 fullScreen
 * 4.状态栏透明 transparent
 * 5.软键盘隐藏 hideInputWindow
 * 6.重复点击检测 isFastDoubleClick
 */
public abstract class BaseActivity extends AppCompatActivity {

    private boolean isCheckLogin;

    private Unbinder unbinder;

    private static long lastClickTime;

    private long lastBack = 0;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);

        try{
            setContentView(getLayoutId());
        }catch (Exception e){
            e.printStackTrace();
        }

        App.getInstance().addActivity(this);
        unbinder = ButterKnife.bind(this);
        init(bundle);
    }


    @Override
    protected void onResume(){
        super.onResume();
       if(isCheckLogin){
           if(!LoginManager.getInstance().isLogin()){
               startActivity(new Intent(this,LoginActivity.class));
           }
       }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        unbinder.unbind();
        App.getInstance().removeActivity(this);
    }

    /**
     * @return 当前fragment名称
     */
    public String getCurrentFragment(){
        return "";
    }

    /**
     * 状态栏透明
     */
    public void transparent(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//Android 5.0及以上
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
    }

    /**
     * 全屏隐藏状态栏
     */
    public void fullScreen(){
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    /**
     * 检查是否登录
     */
    public void checkLogin(boolean bool){
        isCheckLogin = bool;
    }


    /**
     * 公共方法：toast short
     * @param msg
     */
    public void toast(String msg){
        ToastUtil.showShort(this,msg);
    }

    /**
     * 隐藏软键盘
     */
    public void hideInputWindow(){
        View v = getWindow().peekDecorView();
        if(v != null && v.getWindowToken() != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(),0);
        }
    }

    /**
     * 重复点击检测
     * @return
     */
    public static boolean isFastDoubleClick() {
        long cur = System.currentTimeMillis();
        if( cur - lastClickTime < 500){
            return true;
        }
        lastClickTime = cur;
        return false;
    }

    /**
     * 公共方法：关闭所有的activity
     */
    public void removeAllActivity(){
        App.getInstance().removeALLActivity();
    }

    @Override
    public void onBackPressed() {
        if (lastBack == 0 || System.currentTimeMillis() - lastBack > 2000) {
            toast("再按一次返回退出程序");
            lastBack = System.currentTimeMillis();
            return;
        }
        App.getInstance().removeALLActivity();
        super.onBackPressed();
    }

    protected abstract int  getLayoutId();

    public abstract void init(Bundle bundle);

}
