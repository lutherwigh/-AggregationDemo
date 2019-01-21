package outlook.luxi96.module_gank.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.alibaba.android.arouter.facade.annotation.Route;


import java.util.ArrayList;
import java.util.List;

import moe.luther.library.base.router.RouterFragmentPath;

import outlook.luxi96.module_gank.R;
import outlook.luxi96.module_gank.adapter.GankViewPagerAdapter;


@Route(path = RouterFragmentPath.Gank.PAGER_GANK)
public class GankFragment extends Fragment {

    private final static String TAG = "GankFragment";

    private String[] titles = {"Android","iOS","前端","拓展"};

    private boolean isFirseLoad;

    private boolean isLoadMore;

    GankViewPagerAdapter mPagerAdatper;

    TabLayout tabLayout;
    ViewPager pager;

    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    // Log.d(TAG,"handleMessage onNext " + mList.size());
                    // adapter.notifyDataSetChanged();
                    // adapter.setNewData(list);
                    break;
            }
            return false;
        }
    });

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle bundle){
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.gank_fragment,parent,false);
        tabLayout = rootView.findViewById(R.id.gank_tabs);
        pager = rootView.findViewById(R.id.gank_pager);

        tabLayout.setupWithViewPager(pager);

        // init ViewPagers
        mPagerAdatper = new GankViewPagerAdapter(getChildFragmentManager());
        List<GankContentFragment> fragmentList = new ArrayList<>();

        for(int i = 0;i < titles.length;i++){
            GankContentFragment fragment = new GankContentFragment();
            fragment.setType(titles[i]);
            fragmentList.add(fragment);
        }
        mPagerAdatper.setFragmentList(fragmentList);
        pager.setAdapter(mPagerAdatper);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        return rootView;
    }



//    @Override
//    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
//        return R.layout.gank_fragment;
//    }
//
//    @Override
//    public int initVariableId() {
//        return BR.gankModel;
//    }
//
//    @Override
//    public void initData() {
//        // 使用 TabLayout 和 ViewPager 相关联,并设置tab文字
//        binding.gankTabs.setupWithViewPager(binding.gankPager);
//        // init pagers
//        mPagerAdatper = new GankViewPagerAdapter(getChildFragmentManager());
//        List<GankContentFragment> fragmentList = new ArrayList<>();
//
//        for(int i = 0;i < titles.length;i++){
//            GankContentFragment fragment = new GankContentFragment();
//            fragment.setType(titles[i]);
//            fragmentList.add(fragment);
//        }
//        mPagerAdatper.setFragmentList(fragmentList);
//        binding.gankPager.setAdapter(mPagerAdatper);
//        binding.gankPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.gankTabs));
//    }
//
//    @Override
//    public void initViewObservable() {
//        // viewModel.initPages(titles);
//    }

}
