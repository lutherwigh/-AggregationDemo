package outlook.luxi96.module_main.viewmodel;

import android.app.Application;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;

public class MainViewModel extends BaseViewModel {

    public ObservableField<String> toolbarTitle = new ObservableField<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public void setToolbarTitle(String title){
        toolbarTitle.set(title);
    }

}
