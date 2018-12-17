package moe.luther.demo.page.login.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;
import moe.luther.demo.R;
import moe.luther.demo.base.BaseActivity;
import moe.luther.demo.page.main.activity.MainActivity;
import moe.luther.demo.page.login.LoginManager;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.login_login_btn)
    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        checkLogin(false);
        // todo 需要验证是否登录 以及转入登录
        fullScreen();
        transparent();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.login_login_btn)
    public void onClick(View v){
        switch (v.getId()){
            case R.id.login_login_btn:
                LoginManager.getInstance().login();
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                break;
        }
    }
}
