package outlook.luxi96.module_home.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import me.goldze.mvvmhabit.base.BaseFragment;
import moe.luther.library.base.base.adapter.BaseRecyclerViewAapter;
import moe.luther.library.base.base.adapter.RecyclerViewModel;
import moe.luther.library.base.router.RouterFragmentPath;
import outlook.luxi96.module_home.BR;
import outlook.luxi96.module_home.R;
import outlook.luxi96.module_home.adapter.ItemCardAdapter;
import outlook.luxi96.module_home.databinding.HomeFragmentBinding;
import outlook.luxi96.module_home.model.bean.CardBean;
import outlook.luxi96.module_home.model.bean.HeaderBean;
import outlook.luxi96.module_home.model.bean.NewsBean;
import outlook.luxi96.module_home.model.retrofitance.JuheRetrofitance;
import outlook.luxi96.module_home.viewmodel.HomeViewModel;

@Route(path = RouterFragmentPath.Home.PAGER_HOME)
public class HomeFragment extends BaseFragment<HomeFragmentBinding,HomeViewModel> {

    private final static String TAG = "HomeFragment";

    private ItemCardAdapter mItemCardAdapter;
    private List<CardBean> mList;

    private boolean isFirseLoad;

    private boolean isLoadMore;

    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    Log.d(TAG,"handleMessage onNext " + mList.size());
                    // adapter.notifyDataSetChanged();
                    // adapter.setNewData(list);
                    break;
            }
            return false;
        }
    });

    @Override
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.home_fragment;
    }

    @Override
    public void onResume(){
        super.onResume();
        if(!isFirseLoad){
            // loadData();
        }
    }

    @Override
    public int initVariableId() {
        return BR.homeModel;
    }

    @Override
    public void initData() {

        // 使用 TabLayout 和 ViewPager 相关联,并设置tab文字
        binding.homeTabs.setupWithViewPager(binding.homePager);
        // 滑动关联TabLayout
        binding.homePager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.homeTabs));
        // initRecycler();
        // loadData();
    }

    void initRecycler(){
        mList = new ArrayList<>();
        RecyclerViewModel<HeaderBean> headerViewModel = new RecyclerViewModel<HeaderBean>(R.layout.home_recycler_item_header,BR.header,new HeaderBean("recycer header"));
        mItemCardAdapter.addHeadView(headerViewModel);
    }

    void loadData(){

        final Observer<NewsBean> observer = new Observer<NewsBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(NewsBean newsBean) {
                List<NewsBean.ResultBean.DataBean> list = new ArrayList<>();
                if(newsBean != null){
                    if(newsBean.getResult() != null){
                        if(isLoadMore){
                            list.addAll(newsBean.getResult().getData());
                            handler.sendEmptyMessage(1);
                            isLoadMore = false;
                        }else {
                            if(newsBean.getResult().getData() != null){
                                list = newsBean.getResult().getData();
                                handler.sendEmptyMessage(1);
                            }
                        }
                    }else{
                        Log.d("","response error code: " + newsBean.getError_code());
                        // LogUtil.d("response error code: " + newsBean.getError_code());
                    }
                }
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                Toast.makeText(getContext(),"主页信息获取失败",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onComplete() {

            }
        };
        JuheRetrofitance.getInstance().getNews(observer);
    }

    @Override
    public void initViewObservable() {
        viewModel.initPages();
    }

}
