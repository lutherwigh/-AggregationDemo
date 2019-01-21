package outlook.luxi96.module_gank.fragment;

import android.arch.lifecycle.ViewModel;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;

import me.goldze.mvvmhabit.base.BaseFragment;
import moe.luther.library.base.router.RouterFragmentPath;
import outlook.luxi96.module_gank.BR;
import outlook.luxi96.module_gank.R;
import outlook.luxi96.module_gank.databinding.GankFragmentBinding;
import outlook.luxi96.module_gank.viewmodel.GankViewModel;


@Route(path = RouterFragmentPath.Gank.PAGER_GANK)
public class GankFragment extends BaseFragment<GankFragmentBinding,GankViewModel> {

    private final static String TAG = "GankFragment";

    private String[] titles = {"Android","iOS","前端","拓展"};

    private boolean isFirseLoad;

    private boolean isLoadMore;

    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    // Log.d(TAG,"handleMessage onNext " + mList.size());
                    // adapter.notifyDataSetChanged();
                    // adapter.setNewData(list);
                    break;
            }
            return false;
        }
    });

    @Override
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.gank_fragment;
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public int initVariableId() {
        return BR.gankModel;
    }

    @Override
    public GankViewModel initViewModel(){
        return new GankViewModel(getActivity().getApplication(),getChildFragmentManager());
    }

    @Override
    public void initData() {
        // 使用 TabLayout 和 ViewPager 相关联,并设置tab文字
        binding.gankTabs.setupWithViewPager(binding.gankPager);
        // 从gank开始
        binding.gankPager.setCurrentItem(1);
        // 滑动关联TabLayout
        binding.gankPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.gankTabs));
    }

    @Override
    public void initViewObservable() {
        viewModel.initPages(titles);
    }

}
