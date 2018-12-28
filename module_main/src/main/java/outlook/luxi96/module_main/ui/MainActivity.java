package outlook.luxi96.module_main.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.ArrayList;
import java.util.List;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;
import moe.luther.library.base.router.RouterActivityPath;
import moe.luther.library.base.router.RouterFragmentPath;
import outlook.luxi96.module_main.R;
import outlook.luxi96.module_main.databinding.MainActivityBinding;

@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends BaseActivity<MainActivityBinding,BaseViewModel> {

    private List<Fragment> mFragments;

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.main_activity;
    }

    @Override
    public int initVariableId() {
        return 1;
    }


    @Override
    public void initData(){
        initFragments();
        initBottom();
    }

    private void initFragments(){
        Fragment homeFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation();

        mFragments = new ArrayList<>();
        mFragments.add(homeFragment);
        changeFragment(homeFragment);
    }

    private void initBottom(){
        NavigationController controller = binding.mainBottomTab.material()
                .addItem(R.drawable.ic_home_black_24dp,"首页")
                .addItem(R.drawable.ic_assistant_black_24dp,"Gank")
                // .addItem(R.drawable.,"add")
                .addItem(R.drawable.ic_adb_black_24dp,"我的")
                .setDefaultColor(ContextCompat.getColor(this, R.color.main_bottom_tab_bg_gray))
                .build();
        controller.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                changeFragment(mFragments.get(0));
            }

            @Override
            public void onRepeat(int index) {
                // 刷新数据
            }
        });
    }

    void changeFragment(Fragment fragment){
        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.main_fragment_container, fragment);
            transaction.commitAllowingStateLoss();
        }
    }

}
