package outlook.luxi96.module_home.model.bean;

public class CardBean {

    private String source;

    private String title;

    // 暂定为时间
    private String text;

    private String picUrl;
    // 随机生成
    private int like;

    private int dislike;

    private String htmlUrl;

    // 将json获取数据转为CardBean
    public CardBean(NewsBean.ResultBean.DataBean bean) {



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

    public int getLike() {
        return like;
    }

    public int getDislike() {
        return dislike;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}
