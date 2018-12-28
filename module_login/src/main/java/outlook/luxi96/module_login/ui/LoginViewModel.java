package outlook.luxi96.module_login.ui;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.bus.RxBus;
import moe.luther.library.base.contract._Login;

public class LoginViewModel extends BaseViewModel {

    public ObservableField<String> username = new ObservableField<>("");

    public ObservableField<String> password = new ObservableField<>("");



    public LoginViewModel(@NonNull Application application) {
        super(application);
    }


    private void login(){
        _Login _login = new _Login();
        RxBus.getDefault().post(_login);
        finish();
    }

}
