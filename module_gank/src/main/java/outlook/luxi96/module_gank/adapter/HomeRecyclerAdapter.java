package outlook.luxi96.module_gank.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import outlook.luxi96.module_gank.R;
import outlook.luxi96.module_gank.model.bean.CardBean;
import outlook.luxi96.module_gank.model.bean.NewsBean;


public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder> {

    List<CardBean> mList;
//
//    public HomeRecyclerAdapter(List<NewsBean.ResultBean.DataBean> mList) {
//        this.mList = mList;
//    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.gank_recycler_item_card_view,viewGroup,false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        CardBean bean = mList.get(i);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind( NewsBean.ResultBean.DataBean bean){

        }
    }

}
