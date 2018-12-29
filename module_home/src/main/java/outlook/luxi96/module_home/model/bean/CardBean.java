package outlook.luxi96.module_home.model.bean;

public class CardBean {

    private String source;

    private String title;

    // 暂定为时间
    private String text;

    private String picUrl;
    // 随机生成
    private String like;

    private String dislike;

    private String htmlUrl;

    // 将json获取数据转为CardBean
    public CardBean(NewsBean.ResultBean.DataBean bean) {
        this.source = bean.getAuthor_name();
        this.title = bean.getTitle();
        this.text = bean.getDate();
        this.picUrl = bean.getThumbnail_pic_s();
        this.htmlUrl = bean.getUrl();
        this.like = String.valueOf((int)(Math.random() * 100));
        this.dislike = String.valueOf((int)(Math.random() * 100));
    }

    public String getSource() {
        return source;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public String getLike() {
        return like;
    }

    public String getDislike() {
        return dislike;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}
