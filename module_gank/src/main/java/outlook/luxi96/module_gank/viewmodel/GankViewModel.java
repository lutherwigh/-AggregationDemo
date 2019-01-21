package outlook.luxi96.module_gank.viewmodel;

import android.app.Application;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.binding.command.BindingConsumer;
import me.goldze.mvvmhabit.utils.ToastUtils;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import me.tatarka.bindingcollectionadapter2.ItemBinding;
import outlook.luxi96.module_gank.BR;
import outlook.luxi96.module_gank.R;
import outlook.luxi96.module_gank.adapter.ViewPagerBindingAdapter;
import outlook.luxi96.module_gank.fragment.GankContentFragment;

public class GankViewModel extends BaseViewModel {

    private String[] titles = {"Android","iOS","前端","拓展"};

    public ObservableList<PagerItemViewModel> items = new ObservableArrayList<>();

    public ItemBinding<PagerItemViewModel> itemBinding = ItemBinding.of(BR.page, R.layout.gank_viewpager_item);

    public final ViewPagerBindingAdapter adapter = new ViewPagerBindingAdapter(getApplication());

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
            // 切换 fragment
            setPage(index);

            ToastUtils.showShort("pager 切换到" + titles[index] );
        }
    });

    public void initPages(String[] titles){
        items.clear();
        List<GankContentFragment> fragmentList = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            PagerItemViewModel itemViewModel = new PagerItemViewModel(this, titles[i]);
            items.add(itemViewModel);
            GankContentFragment fragment = new GankContentFragment();
            fragment.setType(titles[i]);
            fragmentList.add(fragment);
        }
    }

    // 显示当前index的fragment
    void setPage(int index){
        if(index <= items.size()){

            // adapter.
        }
    }

}
