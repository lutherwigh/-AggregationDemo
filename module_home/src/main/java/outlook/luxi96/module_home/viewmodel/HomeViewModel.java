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

    private final String[] titles = {"头条", "社会", "国内", "国际", "娱乐", "体育", "军事", "科技", "财经", "时尚"};

    public ObservableList<PagerItemViewModel> items = new ObservableArrayList<>();

    public ItemBinding<PagerItemViewModel> itemBinding = ItemBinding.of(BR.page, R.layout.item_viewpager);

    public final BindingViewPagerAdapter.PageTitles<PagerItemViewModel> pageTitles = new BindingViewPagerAdapter.PageTitles<PagerItemViewModel>() {
        @Override
        public CharSequence getPageTitle(int position, PagerItemViewModel item) {
            return titles[position];
        }
    };

    public BindingCommand<Integer> onPagerSelectCommand = new BindingCommand<Integer>(new BindingConsumer<Integer>() {
        @Override
        public void call(Integer index) {
            setPage(index);
            ToastUtils.showShort("pager 切换到" + titles[index] );
        }
    });

    public final ViewPagerBindingAdapter adapter = new ViewPagerBindingAdapter(getApplication());

    public HomeViewModel(@NonNull Application application) { super(application);}

    /**
     * 设置 home pages
     */
    public void initPages(){

        items.clear();
        for (int i = 0; i < titles.length; i++) {
            PagerItemViewModel itemViewModel = new PagerItemViewModel(this, titles[i]);
            items.add(itemViewModel);
        }
        // setPage(0);
    }

    public void setPage(int position){
        if(position >=0 && position <= titles.length){// 防止越界

        }
    }

}
