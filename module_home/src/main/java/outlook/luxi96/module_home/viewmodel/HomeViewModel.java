package outlook.luxi96.module_home.viewmodel;

import android.app.Application;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.binding.command.BindingConsumer;
import me.goldze.mvvmhabit.utils.ToastUtils;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

import outlook.luxi96.module_home.R;
import outlook.luxi96.module_home.adapter.ViewPagerBindingAdapter;
import outlook.luxi96.module_home.BR;

public class HomeViewModel extends BaseViewModel {

    public ObservableList<PagerItemViewModel> items = new ObservableArrayList<>();

    public ItemBinding<PagerItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.item_viewpager);

    public final BindingViewPagerAdapter.PageTitles<PagerItemViewModel> pageTitles = new BindingViewPagerAdapter.PageTitles<PagerItemViewModel>() {
        @Override
        public CharSequence getPageTitle(int position, PagerItemViewModel item) {
            return position + "";
        }
    };

    public BindingCommand<Integer> onPagerSelectCommand = new BindingCommand<Integer>(new BindingConsumer<Integer>() {
        @Override
        public void call(Integer index) {
            ToastUtils.showShort("pager 切换" + index );
        }
    });

    public final ViewPagerBindingAdapter adapter = new ViewPagerBindingAdapter();

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    /**
     * 设置 home pages
     */
    public void setPages(){
        items.clear();
        //模拟3个ViewPager页面
        for (int i = 1; i <= 3; i++) {
            PagerItemViewModel itemViewModel = new PagerItemViewModel(this, "第" + i + "个页面");
            items.add(itemViewModel);
        }
    }

}
