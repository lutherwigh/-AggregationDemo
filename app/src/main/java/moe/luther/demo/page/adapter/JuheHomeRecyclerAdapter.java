package moe.luther.demo.page.adapter;

import android.support.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import moe.luther.demo.R;
import moe.luther.demo.data.bean.NewsBean;

public class JuheHomeRecyclerAdapter extends BaseQuickAdapter<NewsBean.ResultBean.DataBean,BaseViewHolder> {

    public JuheHomeRecyclerAdapter(int layoutResId, @Nullable List<NewsBean.ResultBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsBean.ResultBean.DataBean item) {
        helper.setText(R.id.card_home_source_tv,item.getAuthor_name())
        .setText(R.id.card_home_title_tv,item.getTitle())
        .setText(R.id.card_home_content_tv,item.getDate());
        // source_tv.setText(bean.getAuthor_name());
        // title_tv.setText(bean.getTitle());
        // String content = bean.getType() + "  " + bean.getDate();
        // content_tv.setText(content);
        // getPic(bean.getThumbnail_pic_s());
    }


    //    void getPic(String url){
//
//        Glide.with(this)
//                .load(url)
//                .placeholder(R.color.cardview_dark_background)
//                .diskCacheStrategy(DiskCacheStrategy.NONE)
//                .crossFade()
//                .into(cardBackground_iv);
//    }

}
