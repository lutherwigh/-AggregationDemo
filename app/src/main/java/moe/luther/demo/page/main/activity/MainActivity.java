package moe.luther.demo.page.main.activity;

import android.database.DataSetObserver;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import moe.luther.demo.R;
import moe.luther.demo.view.base.BaseActivity;
import moe.luther.demo.page.main.adapter.MainPagerAdapter;
import moe.luther.demo.page.main.fragment.*;

public class MainActivity extends BaseActivity {

    List<String> titles;
    List<Fragment> fragments;
    HomeFragment homeFragment;
    MyFragment myFragment;
    SubscribeFragment subscribeFragment;

    MainPagerAdapter pagerAdapter;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_title)
    TextView toolbar_title;
    @BindView(R.id.main_vp)
    ViewPager pager;
    @BindView(R.id.main_tableLayout)
    TabLayout tabLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init(Bundle bundle) {
        initToolbar();

        titles = new ArrayList<>();
        fragments = new ArrayList<>();

        titles.add("首页");
        titles.add("订阅");
        titles.add("我的");

        // 初始化fragment
        homeFragment = new HomeFragment();
        subscribeFragment = new SubscribeFragment();
        myFragment = new MyFragment();

        fragments.add(homeFragment);
        fragments.add(subscribeFragment);
        fragments.add(myFragment);

        pagerAdapter = new MainPagerAdapter(getSupportFragmentManager(),MainActivity.this, fragments,titles);

        pagerAdapter.registerDataSetObserver(new DataSetObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                getSupportActionBar().setTitle(pager.getCurrentItem());
                toolbar.setTitle(titles.get(pager.getCurrentItem()));
            }
        });
        pager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(pager);
    }

    void initToolbar(){
        transparent();
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("toolbar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    // todo 获取当前tab name
    public String getTabName(){
        return "";
    }

}
