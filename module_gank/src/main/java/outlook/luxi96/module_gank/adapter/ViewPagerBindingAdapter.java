package outlook.luxi96.module_gank.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;
import me.goldze.mvvmhabit.utils.ToastUtils;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import outlook.luxi96.module_gank.databinding.GankViewpagerItemBinding;
import outlook.luxi96.module_gank.model.bean.CardBean;
import outlook.luxi96.module_gank.model.bean.NewsBean;
import outlook.luxi96.module_gank.model.retrofitance.JuheRetrofitance;
import outlook.luxi96.module_gank.viewmodel.PagerItemViewModel;


/**
 * Created by goldze on 2018/6/21.
 */

public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<PagerItemViewModel> {

    private final static String TAG = "ViewPagerBindingAdapter";

    private Context mContext;

    private ObservableList<CardBean> mList;

    private ItemCardAdapter mItemCardAdapter;

    public ViewPagerBindingAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public void onBindBinding(final ViewDataBinding binding, int variableId, int layoutRes, int position, PagerItemViewModel item) {

        super.onBindBinding(binding, variableId, layoutRes, position, item);

        // 这里可以强转成ViewPagerItemViewModel对应的ViewDataBinding，
        GankViewpagerItemBinding _binding = (GankViewpagerItemBinding) binding;

        mList = new ObservableArrayList<>();
        mItemCardAdapter = new ItemCardAdapter(mList);

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        mContext = null;
    }

}
