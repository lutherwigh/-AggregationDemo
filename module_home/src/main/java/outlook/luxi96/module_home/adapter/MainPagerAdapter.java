package outlook.luxi96.module_home.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MainPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private List<Fragment> fragments;
    private List<String> tabTitleList;

    public MainPagerAdapter(FragmentManager fm,Context context,List<Fragment> fragments,List<String> titles) {
        super(fm);
        this.mContext = context;
        this.fragments = fragments;
        this.tabTitleList = titles;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitleList.get(position);
    }
}
