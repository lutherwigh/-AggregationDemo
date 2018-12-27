package moe.luther.main.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.List;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.goldze.mvvmhabit.BR;
import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;
import moe.luther.library.base.router.RouterActivityPath;
import outlook.luxi96.module_main.R;
import outlook.luxi96.module_main.databinding.ActivityMainBinding;

@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends BaseActivity<ActivityMainBinding, BaseViewModel> {

    private List<Fragment> mFragments;

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData(){



    }

    private void initFragments(){

    }

    private void initBottom(){
        NavigationController controller = binding.mainBottomTab.material()
                .addItem(R.drawable.ic_home_black_24dp,"首页")
                .addItem(R.drawable.ic_assistant_black_24dp,"Gank")
                // .addItem(R.drawable.,"add")
                .addItem(R.drawable.ic_adb_black_24dp,"我的")
                .setDefaultColor(ContextCompat.getColor(this, R.color.main_bottom_tab_bg_gray))
                .build();
    }

}
