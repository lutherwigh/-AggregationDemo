package outlook.luxi96.module_gank.adapter;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import outlook.luxi96.module_gank.databinding.GankViewpagerItemBinding;
import outlook.luxi96.module_gank.fragment.GankContentFragment;
import outlook.luxi96.module_gank.viewmodel.PagerItemViewModel;

/**
 * Created by goldze on 2018/6/21.
 */

public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<PagerItemViewModel> {

    private final static String TAG = "ViewPagerBindingAdapter";

    private Context mContext;

    private final FragmentManager mFragmentManager;

    private List<GankContentFragment> fragmentList;

    private FragmentTransaction mCurTransaction = null;

    private Fragment mCurrentPrimaryItem = null;

    public ViewPagerBindingAdapter(Context context,FragmentManager fm) {
        this.mContext = context;
        this.mFragmentManager = fm;
    }

    @Override
    public void onBindBinding(final ViewDataBinding binding, int variableId, int layoutRes, int position, PagerItemViewModel item) {

        super.onBindBinding(binding, variableId, layoutRes, position, item);

        // 这里可以强转成ViewPagerItemViewModel对应的ViewDataBinding，

        GankViewpagerItemBinding _binding = (GankViewpagerItemBinding) binding;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }

        this.mCurTransaction.detach((Fragment)object);
    }

    public void setFragmentList(List<GankContentFragment> fragmentList) {
        this.fragmentList = fragmentList;
    }

    public Fragment getItem(int position){
        return fragmentList.get(position);
    }

    public void startUpdate(@NonNull ViewGroup container) {
        if (container.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }

        long itemId = this.getItemId(position);
        String name = makeFragmentName(container.getId(), itemId);
        Fragment fragment = this.mFragmentManager.findFragmentByTag(name);
        if (fragment != null) {
            this.mCurTransaction.attach(fragment);
        } else {
            fragment = this.getItem(position);
            this.mCurTransaction.add(container.getId(), fragment, makeFragmentName(container.getId(), itemId));
        }

        if (fragment != this.mCurrentPrimaryItem) {
            fragment.setMenuVisibility(false);
            fragment.setUserVisibleHint(false);
        }

        return fragment;
    }

    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        Fragment fragment = (Fragment)object;
        if (fragment != this.mCurrentPrimaryItem) {
            if (this.mCurrentPrimaryItem != null) {
                this.mCurrentPrimaryItem.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }

            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.mCurrentPrimaryItem = fragment;
        }

    }

    public void finishUpdate(@NonNull ViewGroup container) {
        if (this.mCurTransaction != null) {
            this.mCurTransaction.commitNowAllowingStateLoss();
            this.mCurTransaction = null;
        }

    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return ((Fragment)object).getView() == view;
    }

    public Parcelable saveState() {
        return null;
    }

    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    public long getItemId(int position) {
        return (long)position;
    }

    private static String makeFragmentName(int viewId, long id) {
        return "android:switcher:" + viewId + ":" + id;
    }

}
