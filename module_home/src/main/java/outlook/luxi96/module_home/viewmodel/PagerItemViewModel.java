package outlook.luxi96.module_home.viewmodel;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.databinding.ViewDataBinding;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ItemViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;
import me.tatarka.bindingcollectionadapter2.ItemBinding;
import moe.luther.library.base.base.adapter.BaseRecyclerViewAapter;
import moe.luther.library.base.base.adapter.RecyclerViewModel;
import outlook.luxi96.module_home.BR;
import outlook.luxi96.module_home.R;
import outlook.luxi96.module_home.adapter.ItemCardAdapter;
import outlook.luxi96.module_home.model.bean.CardBean;
import outlook.luxi96.module_home.model.bean.HeaderBean;
import outlook.luxi96.module_home.model.bean.NewsBean;
import outlook.luxi96.module_home.model.retrofitance.JuheRetrofitance;

import static me.goldze.mvvmhabit.utils.Utils.getContext;

public class PagerItemViewModel extends ItemViewModel {

    private final static String TAG = "PagerItemViewModel";

    private ItemCardAdapter mItemCardAdapter;
    private ObservableList<CardBean> mList;

    private boolean isLoadMore = false;

    public String type;
    public SingleLiveEvent<String> clickEvent = new SingleLiveEvent();

    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    Log.d(TAG,"handleMessage onNext " + mList.size());
                    mItemCardAdapter.notifyDataSetChanged();
                    break;
            }
            return false;
        }
    });

    public PagerItemViewModel(@NonNull BaseViewModel viewModel, String type) {
        super(viewModel);
        this.type = type;

        // itemBinding.bind()
    }

    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            // 将点击事件交给eventBus处理
            // clickEvent.setValue(type);
            loadData();
        }
    });

    public BindingCommand onRefresh = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            // 下拉刷新
            loadData();
        }
    });

    void initRecycler(){

        mList = new ObservableArrayList<>();
        mItemCardAdapter = new ItemCardAdapter(mList);

        mItemCardAdapter.setMyItemClickListener(new BaseRecyclerViewAapter.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                switch (view.getId()){
                    default:
                        // 点击跳转
                        break;
                }
            }
        });

        // header
        RecyclerViewModel<HeaderBean> headerViewModel = new RecyclerViewModel<HeaderBean>(R.layout.home_recycler_item_header,BR.header,new HeaderBean("recycer header"));
        mItemCardAdapter.addHeadView(headerViewModel);
        mItemCardAdapter.setHeaderClickListener(new BaseRecyclerViewAapter.OnHeaderClickListener() {
            @Override
            public void headerClick(View view, int position) {
                // 跳转
            }
        });

        // binding.homeRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        // binding.homeRecycler.setAdapter(mItemCardAdapter);

        // footer

        // add listener
        // 如何向上传递点击事件
        // mItemCardAdapter.setHeaderClickListener(this);
    }

    void testData(){

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
                            // handler.sendEmptyMessage(1);
                            // isLoadMore = false;
                        }else {
                            if(newsBean.getResult().getData() != null){
                                list = newsBean.getResult().getData();
                                mList.clear();
                                for(NewsBean.ResultBean.DataBean bean : list){
                                    mList.add(new CardBean(bean));
                                }
                                handler.sendEmptyMessage(1);
                            }
                        }
                    }else{
                        Log.d("","response error code: " + newsBean.getError_code());
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

}

