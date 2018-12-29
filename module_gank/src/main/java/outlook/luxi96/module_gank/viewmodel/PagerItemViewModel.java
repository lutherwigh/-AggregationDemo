package outlook.luxi96.module_gank.viewmodel;


import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ItemViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;
import outlook.luxi96.module_gank.fragment.GankContentFragment;

public class PagerItemViewModel extends ItemViewModel {

    // 用fragment 填充
    GankContentFragment contentFragment;

    private final static String TAG = "PagerItemViewModel";

    private boolean isLoadMore = false;

    public String type;
    public SingleLiveEvent<String> clickEvent = new SingleLiveEvent();

    public PagerItemViewModel(@NonNull BaseViewModel viewModel, String type) {
        super(viewModel);
        this.type = type;

        contentFragment = new GankContentFragment();
    }

    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            // 将点击事件交给eventBus处理
        }
    });

    public BindingCommand onRefresh = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            // 下拉刷新
        }
    });

}

