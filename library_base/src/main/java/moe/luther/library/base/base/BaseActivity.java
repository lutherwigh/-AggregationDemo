package moe.luther.library.base.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import moe.luther.library.base.util.ToastUtil;

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder mUnbinder;

    private static long lastClickTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        doBeforeRes();
        try{
            setContentView(getResId());
        }catch (Exception e){
            e.printStackTrace();
        }

        // App.getInstance().addActivity(this);
        mUnbinder = ButterKnife.bind(this);
        init(savedInstanceState);

    }
    public abstract int getResId();

    public abstract void init(Bundle savedInstanceState);

    /**
     * 公共方法：在setContentView()之前执行
     */
    public void doBeforeRes(){
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 公共方法：跳转
     * @param clz
     */
    public void startTo(Class<?> clz){
        Intent intent = new Intent();
        intent.setClass(this, clz);
        startActivity(intent);
    }

    /**
     * 公共方法：跳转，携带参数返回
     * @param clz
     * @param value
     */
    public void startToResult(Class<?> clz,int value){
        Intent intent = new Intent();
        intent.setClass(this, clz);
        startActivityForResult(intent,value);
//        overridePendingTransition(R.anim.slide_window_in,R.anim.slide_window_out);
    }

    /**
     * 公共方法：跳转，携带参数返回
     * @param clz
     * @param value
     */
    public void startToResult(Class<?> clz,int value,Intent intent){
        intent.setClass(this, clz);
        startActivityForResult(intent,value);
//        overridePendingTransition(R.anim.slide_window_in,R.anim.slide_window_out);
    }

    /**
     * 公共方法：跳转，携带参数返回
     * @param clz
     */
    public void startTo(Class<?> clz,Intent intent){
        intent.setClass(this, clz);
        startActivity(intent);
    }

    /**
     * 公共方法：toast short
     * @param msg
     */
    public void toast(String msg){
        ToastUtil.showShort(this,msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
        // App.getInstance().removeActivity(this);
    }

    public int getStatusBarHeight(){
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
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
     * 隐藏软键盘
     */
    public void hideInputWindow(){
        View v = getWindow().peekDecorView();
        if(v != null && v.getWindowToken() != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(),0);
        }
    }

    public static boolean isFastDoubleClick() {
        long cur = System.currentTimeMillis();
        if( cur - lastClickTime < 500){
            return true;
        }
        lastClickTime = cur;
        return false;
    }

}
