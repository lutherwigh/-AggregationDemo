package moe.luther.demo.page.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import moe.luther.demo.R;
import moe.luther.demo.page.main.activity.MainActivity;
import moe.luther.demo.page.login.LoginManager;
import moe.luther.demo.page.login.activity.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if(LoginManager.getInstance().isLogin()){
            startActivity(new Intent(this,MainActivity.class));
        }else{
            startActivity(new Intent(this,LoginActivity.class));
        }
    }
}
