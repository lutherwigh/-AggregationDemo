package outlook.luxi96.module_my.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;

import me.goldze.mvvmhabit.base.BaseFragment;
import moe.luther.library.base.router.RouterFragmentPath;
import outlook.luxi96.module_my.BR;
import outlook.luxi96.module_my.R;
import outlook.luxi96.module_my.databinding.MyFragmentBinding;
import outlook.luxi96.module_my.viewmodel.MyViewModel;

@Route(path = RouterFragmentPath.User.PAGE_MY)
public class MyFragment extends BaseFragment<MyFragmentBinding,MyViewModel> {

    private final static String TAG = "MyFragment";

    @Override
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.my_fragment;
    }

    @Override
    public int initVariableId() {
        return BR.myModel;
    }
}
