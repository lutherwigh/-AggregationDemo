package moe.luther.demo.page.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import moe.luther.demo.R;
import moe.luther.demo.data.bean.NewsBean;

public class JuheHomeRecyclerAdapter extends BaseQuickAdapter<NewsBean.ResultBean.DataBean,BaseViewHolder> {

    Context mContext;

    public JuheHomeRecyclerAdapter(int layoutResId, @Nullable List<NewsBean.ResultBean.DataBean> data, Context context) {
        super(layoutResId, data);
        mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsBean.ResultBean.DataBean item) {
        helper.setText(R.id.card_home_source_tv,item.getAuthor_name())
        .setText(R.id.card_home_title_tv,item.getTitle())
        .setText(R.id.card_home_content_tv,item.getDate());
        ImageView background = (ImageView) helper.getView(R.id.card_home_bg);
        Glide.with(mContext)
                .load(item.getThumbnail_pic_s())
                .placeholder(R.color.item_card_placeholder_gray)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .crossFade()
                .into(background);
    }

}
