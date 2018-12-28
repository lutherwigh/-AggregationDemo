package outlook.luxi96.module_home.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;

import me.goldze.mvvmhabit.base.BaseFragment;
import moe.luther.library.base.router.RouterFragmentPath;
import outlook.luxi96.module_home.BR;
import outlook.luxi96.module_home.R;
import outlook.luxi96.module_home.databinding.HomeFragmentBinding;
import outlook.luxi96.module_home.viewmodel.HomeViewModel;

@Route(path = RouterFragmentPath.Home.PAGER_HOME)
public class HomeFragment extends BaseFragment<HomeFragmentBinding,HomeViewModel>{

    @Override
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.home_fragment;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        // 使用 TabLayout 和 ViewPager 相关联
        binding.homeTabs.setupWithViewPager(binding.homePager);
        binding.homePager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.homeTabs));

    }

    @Override
    public void initViewObservable() {
        viewModel.setPages();
    }

}
