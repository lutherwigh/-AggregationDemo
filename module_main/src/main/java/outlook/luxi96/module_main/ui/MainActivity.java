package outlook.luxi96.module_main.ui;

import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.ArrayList;
import java.util.List;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.goldze.mvvmhabit.base.BaseActivity;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;
import moe.luther.library.base.router.RouterActivityPath;
import moe.luther.library.base.router.RouterFragmentPath;
import outlook.luxi96.module_main.BR;
import outlook.luxi96.module_main.R;
import outlook.luxi96.module_main.databinding.MainActivityBinding;
import outlook.luxi96.module_main.viewmodel.MainViewModel;

@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends BaseActivity<MainActivityBinding,MainViewModel> {

    private List<Fragment> mFragments;

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.main_activity;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData(){
        initToolbar();
        initFragments();
        initBottom();
    }

    private void initFragments(){
        // Fragment homeFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation();
        Fragment gankFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Gank.PAGER_GANK).navigation();
        Fragment myFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.User.PAGE_MY).navigation();

        mFragments = new ArrayList<>();
//        mFragments.add(homeFragment);
        mFragments.add(gankFragment);
        mFragments.add(myFragment);
        mFragments.add(myFragment);

        changeFragment(gankFragment);
    }

    private void initBottom(){
        final NavigationController controller = binding.mainBottomTab.material()
                .addItem(R.drawable.ic_home_black_24dp,"首页")
                .addItem(R.drawable.ic_assistant_black_24dp,"Gank")
                // .addItem(R.drawable.,"add")
                .addItem(R.drawable.ic_adb_black_24dp,"我的")
                .setDefaultColor(ContextCompat.getColor(this, R.color.main_bottom_tab_bg_gray))
                .build();
        controller.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {

                // changeFragment(mFragments.get(index));
                ARouter.getInstance().build(RouterFragmentPath.User.PAGE_MY).navigation();
                binding.toolbar.setTitle(controller.getItemTitle(index));
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

    void initToolbar(){
        // transparent();
        setSupportActionBar(binding.toolbar);
        // getSupportActionBar().setTitle("首页");
        binding.toolbar.setTitle("首页");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    void transparent(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//Android 5.0及以上
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
    }

}
