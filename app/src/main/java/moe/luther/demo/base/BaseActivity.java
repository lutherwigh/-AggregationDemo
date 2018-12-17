package moe.luther.demo.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import moe.luther.demo.page.login.LoginManager;
import moe.luther.demo.page.login.activity.LoginActivity;

/**
 * 项目基类
 * 1.butterknife初始化
 * 2.登录检测
 * 3.全屏显示
 * 4.状态栏沉浸
 */
public abstract class BaseActivity extends AppCompatActivity {

    private final static String TAG = "";

    private boolean isCheckLogin;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(getLayoutId());
        unbinder = ButterKnife.bind(this);
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
    }

    /**
     * @return 当前fragment名称
     */
    public String getCurrentFragment(){
        return "";
    }

    /**
     * 设置状态栏透明
     */
    public void transparent(){
        getWindow().setStatusBarColor(ContextCompat.getColor(this,android.R.color.transparent));
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

    protected abstract int  getLayoutId();

}
