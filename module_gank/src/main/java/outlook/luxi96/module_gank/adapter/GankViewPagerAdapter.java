package outlook.luxi96.module_gank.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import outlook.luxi96.module_gank.fragment.GankContentFragment;

public class GankViewPagerAdapter extends FragmentPagerAdapter {

    private final static String TAG = "GankViewPagerAdapter";

    List<GankContentFragment> fragmentList;

    public GankViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void setFragmentList(List<GankContentFragment> fragmentList) {
        this.fragmentList = fragmentList;
    }
}
