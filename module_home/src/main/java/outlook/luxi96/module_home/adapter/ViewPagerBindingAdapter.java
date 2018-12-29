package outlook.luxi96.module_home.adapter;

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
import moe.luther.library.base.base.adapter.RecyclerViewModel;
import outlook.luxi96.module_home.R;
import outlook.luxi96.module_home.databinding.ItemViewpagerBinding;
import outlook.luxi96.module_home.model.bean.CardBean;
import outlook.luxi96.module_home.model.bean.HeaderBean;
import outlook.luxi96.module_home.model.bean.NewsBean;
import outlook.luxi96.module_home.model.retrofitance.JuheRetrofitance;
import outlook.luxi96.module_home.viewmodel.PagerItemViewModel;

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

        ItemViewpagerBinding _binding = (ItemViewpagerBinding) binding;

        ((ItemViewpagerBinding) binding).homeRecycler.setLayoutManager(new LinearLayoutManager(mContext));

        // RecyclerViewModel<HeaderBean> headerViewModel = new RecyclerViewModel<HeaderBean>(R.layout.home_recycler_item_header,BR.header,new HeaderBean("recycer header"));

        mList = new ObservableArrayList<>();
        mItemCardAdapter = new ItemCardAdapter(mList);

        // mItemCardAdapter.addHeadView(headerViewModel);

        ((ItemViewpagerBinding) binding).homeRecycler.setAdapter(mItemCardAdapter);

        item.clickEvent.observe((LifecycleOwner) _binding.getRoot().getContext(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                ToastUtils.showShort(s);
            }
        });

        loadData();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        mContext = null;
    }

    private void loadData(){

        final io.reactivex.Observer<NewsBean> observer = new io.reactivex.Observer<NewsBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(NewsBean newsBean) {
                mList.clear();
                List<NewsBean.ResultBean.DataBean> list = new ArrayList<>();
                if(newsBean != null){
                    if(newsBean.getResult() != null){

                        {
                            if(newsBean.getResult().getData() != null){
                                list = newsBean.getResult().getData();
                                for(NewsBean.ResultBean.DataBean bean : list){
                                    mList.add(new CardBean(bean));

                                }
                            }
                        }

                    }else{
                        Log.d(TAG,"response error code: " + newsBean.getError_code());
                    }
                }
                Log.d(TAG,"list size" + mList.size());
                mItemCardAdapter.notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                Toast.makeText(mContext,"主页信息获取失败",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onComplete() {

            }
        };
        JuheRetrofitance.getInstance().getNews(observer);
    }

}
