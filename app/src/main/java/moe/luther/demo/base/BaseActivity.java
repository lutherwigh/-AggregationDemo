package moe.luther.demo.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * 项目基类
 * 1.butterknife初始化
 * 2.登录检测
 * 3.全屏显示
 * 4.状态栏沉浸
 */
public class BaseActivity extends AppCompatActivity {

    private final static String TAG = "";

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);

    }


    @Override
    protected void onResume(){
        super.onResume();
    }

}
