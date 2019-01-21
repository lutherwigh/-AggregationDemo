package moe.luther.demo.page.login.activity;

import android.os.Bundle;

import moe.luther.demo.R;
import moe.luther.demo.view.base.BaseActivity;

public class LoginActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.app_activity_login;
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
