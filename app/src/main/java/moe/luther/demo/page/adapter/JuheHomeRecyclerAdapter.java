package moe.luther.demo.page.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import moe.luther.demo.R;
import moe.luther.demo.data.bean.NewsBean;

public class JuheHomeRecyclerAdapter extends BaseQuickAdapter<NewsBean.ResultBean.DataBean,BaseViewHolder> {

    Context mContext;

//    onItemClickListener listener;

    public JuheHomeRecyclerAdapter(int layoutResId, @Nullable List<NewsBean.ResultBean.DataBean> data, Context context) {
        super(layoutResId, data);
        mContext = context;
    }

    // todo 日期转换为 h前 m前 一天前新闻显示日期

    // todo 标题过长 需要动态向上移动

    @Override
    protected void convert(BaseViewHolder helper, NewsBean.ResultBean.DataBean item) {
        helper.setText(R.id.card_home_source_tv,item.getAuthor_name())
        .setText(R.id.card_home_title_tv,item.getTitle())
        .setText(R.id.card_home_content_tv,item.getDate());

        ImageView background = (ImageView) helper.getView(R.id.card_home_bg);

        RequestOptions options = new RequestOptions()
                .placeholder(R.color.item_card_placeholder_gray)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.NONE);

        Glide.with(mContext)
                .load(item.getThumbnail_pic_s())
                .apply(options)
                .into(background);
    }

}
