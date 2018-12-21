package moe.luther.demo.page.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Objects;

import moe.luther.demo.R;
import moe.luther.demo.page.main.activity.MainActivity;
import moe.luther.demo.page.login.LoginManager;
import moe.luther.demo.page.login.activity.LoginActivity;
import moe.luther.demo.view.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void init(Bundle bundle) {
        checkLogin(false);
        if(LoginManager.getInstance().isLogin()){
            startActivity(new Intent(this,MainActivity.class));
        }else{
            startActivity(new Intent(this,LoginActivity.class));
        }
    }
}
