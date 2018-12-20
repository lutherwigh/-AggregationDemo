package moe.luther.demo.page.main.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import moe.luther.demo.R;
import moe.luther.demo.data.api.NewsAPI;
import moe.luther.demo.data.bean.NewsBean;
import moe.luther.demo.data.retrofitance.JuheRetrofitance;
import moe.luther.demo.page.adapter.JuheHomeRecyclerAdapter;
import moe.luther.demo.page.main.adapter.HomeRecyclerAdapter;
import moe.luther.demo.view.base.BaseFragment;

public class HomeFragment extends BaseFragment {

    private final String TAG = getClass().getSimpleName();

    @BindView(R.id.home_refresh)
    SmartRefreshLayout refreshLayout;
    @BindView(R.id.home_recycler)
    RecyclerView recyclerView;

    Unbinder unbinder;

    JuheHomeRecyclerAdapter adapter;

    List<NewsBean.ResultBean.DataBean> list;

    private int page = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle bundle){
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home,null,false);
        unbinder = ButterKnife.bind(this,root);
        initRecycler();
        refreshLayout.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                // todo 修改page
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                getNews();
            }
        });
        return root;
    }

    @Override
    public void onResume(){
        super.onResume();
        getNews();
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        unbinder.unbind();
    }

    void initRecycler(){
        // todo card item
        list = new ArrayList<>();
        adapter = new JuheHomeRecyclerAdapter(R.layout.item_home_card_view,list);
        adapter.setOnItemClickListener((adapter, view, position) -> {

        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    void getNews(){
        final Observer<NewsBean> observer = new Observer<NewsBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(NewsBean newsBean) {
                list = newsBean.getResult().getData();

            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                Toast.makeText(getContext(),"文字获取失败",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onComplete() {

            }
        };
        JuheRetrofitance.getInstance().getNews(observer);
    }

}
