package moe.luther.demo.page.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;



import java.util.ArrayList;

import io.reactivex.disposables.Disposable;
import moe.luther.demo.R;

import moe.luther.demo.page.adapter.JuheHomeRecyclerAdapter;
import moe.luther.demo.page.main.activity.DetailActivity;
import moe.luther.demo.view.base.BaseFragment;

public class HomeFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return 0;
    }
//
//    private final String TAG = getClass().getSimpleName();
//
//    @BindView(R.id.home_refresh)
//    SmartRefreshLayout refreshLayout;
//    @BindView(R.id.home_recycler)
//    RecyclerView recyclerView;
//
//    JuheHomeRecyclerAdapter adapter;
//
//    List<NewsBean.ResultBean.DataBean> list;
//
//    private boolean isLoadMore = false;
//
//    private boolean isPause = false;
//
//    private int page = 1;
//
//    Handler handler = new Handler(new Handler.Callback() {
//        @Override
//        public boolean handleMessage(Message msg) {
//            switch (msg.what){
//                case 1:
//                    Log.d(TAG,"handleMessage onNext " + list.size());
//                    // adapter.notifyDataSetChanged();
//                    adapter.setNewData(list);
//                    break;
//            }
//            return false;
//        }
//    });
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle bundle){
//
//        super.onCreateView(inflater,parent,bundle);
//
//        initRecycler();
//        ClassicsHeader header = new ClassicsHeader(this.getContext());
//        header.setPrimaryColorId(R.color.home_refresh_header_gray);
//        refreshLayout.setRefreshHeader(header);
//        refreshLayout.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
//            @Override
//            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
//                // todo 修改page
//                // 不只是修改page 需要重新增加list
//                isLoadMore = true;
//                getNews();
//                refreshLayout.finishLoadMore(2000);
//            }
//
//            @Override
//            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
//                getNews();
//                refreshLayout.finishRefresh(2000);
//            }
//        });
//
//        return rootView;
//    }
//
//    @Override
//    protected int getLayoutId() {
//        return R.layout.home_fragment;
//    }
//
//    @Override
//    public void onResume(){
//        super.onResume();
//        if(!isPause){
//            getNews();
//        }
//        isPause = false;
//    }
//
//    @Override
//    public void onPause(){
//        super.onPause();
//        isPause = true;
//    }
//
//    void initRecycler(){
//        // todo card item
//        list = new ArrayList<>();
//        adapter = new JuheHomeRecyclerAdapter(R.layout.home_recycler_item_card_view,list,getContext());
//        adapter.setOnItemClickListener((adapter, view, position) -> {
//            switch (view.getId()){
//
//                default:
//                    Log.d(TAG,"item click " + position + " to " + list.get(position).getUrl());
//                    Intent intent = new Intent(this.getActivity(),DetailActivity.class);
//                    intent.putExtra("url",list.get(position).getUrl());
//                    startActivity(intent);
//                    break;
//            }
//        });
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setAdapter(adapter);
//    }
//
//    void getNews(){
//        final Observer<NewsBean> observer = new Observer<NewsBean>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(NewsBean newsBean) {
//                if(newsBean != null){
//                    if(newsBean.getResult() != null){
//                        if(isLoadMore){
//                            list.addAll(newsBean.getResult().getData());
//                            handler.sendEmptyMessage(1);
//                            isLoadMore = false;
//                        }else {
//                            if(newsBean.getResult().getData() != null){
//                                list = newsBean.getResult().getData();
//                                handler.sendEmptyMessage(1);
//                            }
//                        }
//                    }else{
//                        LogUtil.d("response error code: " + newsBean.getError_code());
//                    }
//                }
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                e.printStackTrace();
//                Toast.makeText(getContext(),"主页信息获取失败",Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        };
//        JuheRetrofitance.getInstance().getNews(observer);
//    }

}
