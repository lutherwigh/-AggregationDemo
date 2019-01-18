package outlook.luxi96.module_gank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import me.goldze.mvvmhabit.base.BaseFragment;
import outlook.luxi96.module_gank.R;
import outlook.luxi96.module_gank.databinding.GankContentFragmentBinding;
import outlook.luxi96.module_gank.viewmodel.GankContentFragmentViewModel;

public class GankContentFragment extends BaseFragment<GankContentFragmentBinding,GankContentFragmentViewModel> {

    @Override
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.gank_content_fragment;
    }

    @Override
    public int initVariableId() {
        return BR.content_model;
    }
}
