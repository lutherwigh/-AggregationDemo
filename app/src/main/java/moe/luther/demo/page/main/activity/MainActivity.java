package moe.luther.demo.page.main.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import moe.luther.demo.R;
import moe.luther.demo.page.main.adapter.MainPagerAdapter;
import moe.luther.demo.page.main.fragment.*;

public class MainActivity extends AppCompatActivity {

    List<String> titles;
    List<Fragment> fragments;
    // todo 分页显示 底部三页 首页 订阅 我的

    @BindView(R.id.main_vp)
    ViewPager pager;
    @BindView(R.id.main_tableLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
    }


    void init(){

        titles = new ArrayList<>();
        fragments = new ArrayList<>();

        titles.add("首页");
        titles.add("订阅");
        titles.add("我的");

        fragments.add(new HomeFragment());
        fragments.add(new SubscribeFragment());
        fragments.add(new MyFragment());

        pager.setAdapter(new MainPagerAdapter(getSupportFragmentManager(),MainActivity.this,fragments,titles));
        tabLayout.setupWithViewPager(pager);
    }
}
