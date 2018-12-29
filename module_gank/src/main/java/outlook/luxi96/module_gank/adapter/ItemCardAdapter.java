package outlook.luxi96.module_gank.adapter;

import android.widget.ImageView;

import java.util.List;

import moe.luther.library.base.base.adapter.BaseRecyclerViewAapter;
import moe.luther.library.base.base.adapter.BaseRecyclerViewHolder;
import outlook.luxi96.module_gank.model.bean.CardBean;

public class ItemCardAdapter extends BaseRecyclerViewAapter<CardBean> {

    public ItemCardAdapter(List<CardBean> mData) {
        super(mData);
    }

    @Override
    public int getItemLayoutId(int viewType) {
        switch (viewType){
            case 1:
                // return R.layout.home_recycler_item_card_view;
            default:
                return R.layout.home_recycler_item_card_view;
        }
    }

    @Override
    public int getVariableId(int viewType) {
        return BR.bean;
    }

    @Override
    public int getItemTypePosition(int position) {
        return 1;
    }

    @Override
    public void bindCustomData(BaseRecyclerViewHolder holder, int position, CardBean item) {

        ImageView imageView = holder.itemView.findViewById(R.id.card_home_bg);

    }

    @Override
    public int getStartMode() {
        return 0;
    }
}
