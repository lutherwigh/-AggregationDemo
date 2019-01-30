package outlook.luxi96.module_home.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
public class HomeFragment extends BaseFragment<HomeFragmentBinding,HomeViewModel> {

    private final static String TAG = "HomeFragment";

    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    break;
            }
            return false;
        }
    });

    @Override
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.home_fragment;
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public int initVariableId() {
        return BR.home_model;
    }

    @Override
    public void initData() {

        // 使用 TabLayout 和 ViewPager 相关联,并设置tab文字
        binding.homeTabs.setupWithViewPager(binding.homePager);
        // 滑动关联TabLayout
        binding.homePager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.homeTabs));
    }

    @Override
    public void initViewObservable() {
        viewModel.initPages();
    }

}
