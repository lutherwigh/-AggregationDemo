package outlook.luxi96.module_gank.viewmodel;

import android.app.Application;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.binding.command.BindingConsumer;
import me.goldze.mvvmhabit.utils.ToastUtils;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import outlook.luxi96.module_gank.adapter.GankPagerAdapter;
import outlook.luxi96.module_gank.fragment.GankContentFragment;

public class GankViewModel extends BaseViewModel {

    private String[] titles = {"Android","iOS","前端","拓展"};

    public ObservableList<GankContentFragment> fragments = new ObservableArrayList<>();

    public GankPagerAdapter adapter;

    public GankViewModel(@NonNull Application application) {
        super(application);
    }

    public final BindingViewPagerAdapter.PageTitles<PagerItemViewModel> pageTitles = new BindingViewPagerAdapter.PageTitles<PagerItemViewModel>() {
        @Override
        public CharSequence getPageTitle(int position, PagerItemViewModel item) {
            return titles[position];
        }
    };

    public BindingCommand<Integer> onPagerSelectCommand = new BindingCommand<Integer>(new BindingConsumer<Integer>() {
        @Override
        public void call(Integer index) {
            // setPage(index);
            // 切换 fragment

            ToastUtils.showShort("pager 切换到" + titles[index] );
        }
    });

    public void initPages(String[] titles){

        for (int i = 0; i < titles.length; i++) {

            PagerItemViewModel itemViewModel = new PagerItemViewModel(this, titles[i]);
            fragments.add(itemViewModel.getContentFragment());
        }

    }

    // 显示当前index的fragment
    void setDisplayFragment(int index){
        if(index < fragments.size()){

        }
    }

}
