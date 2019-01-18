package outlook.luxi96.module_login.ui;

import android.os.Bundle;

import me.goldze.mvvmhabit.base.BaseActivity;
import outlook.luxi96.module_login.R;
import outlook.luxi96.module_login.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity<ActivityLoginBinding,LoginViewModel> {

    // todo 微信授权登录 自研账户登录

//    @BindView(R.id.login_login_btn)
//    Button btn_login;
//
//    @Override
//    protected int getLayoutId() {
//        return R.layout.activity_login;
//    }
//
//    @Override
//    public void init(Bundle bundle) {
//        // Objects.requireNonNull(getActionBar()).hide();
//        checkLogin(false);
//        fullScreen();
//        // transparent();
//    }
//
//    @OnClick(R.id.login_login_btn)
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.login_login_btn:
//                LoginManager.getInstance().login();
//                startActivity(new Intent(LoginActivity.this,MainActivity.class));
//                break;
//        }
//    }

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return 0;
        // return BR.viewModel;
    }
}
