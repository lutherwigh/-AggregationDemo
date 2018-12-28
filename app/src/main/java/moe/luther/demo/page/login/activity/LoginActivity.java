package moe.luther.demo.page.login.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

import moe.luther.demo.R;
import moe.luther.demo.view.base.BaseActivity;
import moe.luther.demo.page.main.activity.MainActivity;
import moe.luther.demo.page.login.LoginManager;

public class LoginActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void init(Bundle bundle) {
        // Objects.requireNonNull(getActionBar()).hide();
        // checkLogin(false);
        // todo 需要验证是否登录 以及转入登录
        // fullScreen();
        // transparent();
    }

}
