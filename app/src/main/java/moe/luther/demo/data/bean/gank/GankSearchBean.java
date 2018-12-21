package moe.luther.demo.data.bean.gank;

import java.util.List;

public class GankSearchBean {


    /**
     * count : 10
     * error : false
     * results : [{"readability":"","publishedAt":"2016-05-12T12:04:43.857000","ganhuo_id":"57334c9d67765903fb61c418","type":"Android","url":"http://www.jianshu.com/p/a92955be0a3e","desc":"还在用ListView？","who":"陈宇明"},{"readability":"","publishedAt":"2015-07-21T04:10:11.904000","ganhuo_id":"56cc6d23421aa95caa707ac9","type":"Android","url":"https://github.com/evant/binding-collection-adapter","desc":"Android Data Binding Adapter for ListView and RecyclerView.","who":"mthli"},{"readability":"","publishedAt":"2015-07-17T03:43:22.395000","ganhuo_id":"56cc6d1d421aa95caa7076fa","type":"Android","url":"https://github.com/dodola/ListItemFold","desc":"listview的折叠效果","who":"Jason"},{"readability":"","publishedAt":"2016-05-19T12:09:29.617000","ganhuo_id":"573d2a896776591c9fd0cd77","type":"Android","url":"https://github.com/traex/CalendarListview","desc":"在ListView中实现日历视图","who":"大熊"},{"readability":"","publishedAt":"2015-07-02T03:50:48.024000","ganhuo_id":"56cc6d23421aa95caa707ab2","type":"Android","url":"https://github.com/lawloretienne/QuickReturn","desc":"给scrollview、listview、recycleview添加header与footer","who":"Jason"},{"readability":"","publishedAt":"2015-12-10T04:13:03.804000","ganhuo_id":"56cc6d26421aa95caa707fa2","type":"Android","url":"https://github.com/EverythingMe/overscroll-decor","desc":"一个滋瓷 Android RecyclerView, ListView, GridView, ScrollView ...的scroll","who":"有时放纵"},{"readability":"","publishedAt":"2015-08-10T04:09:39.936000","ganhuo_id":"56cc6d23421aa95caa707be6","type":"Android","url":"https://github.com/pchauhan/FilterSelectorListView","desc":"过滤出多重选择的ListView","who":"Jason"},{"readability":"","publishedAt":"2016-02-29T12:19:00.015000","ganhuo_id":"56cc6d29421aa95caa70827e","type":"Android","url":"https://github.com/yll2wcf/YLListView","desc":"YLListView仿IOS弹簧效果的ListView","who":"Jason"},{"readability":"","publishedAt":"2015-09-25T03:35:19.842000","ganhuo_id":"56cc6d26421aa95caa707d66","type":"Android","url":"https://github.com/xuechinahb/AnimatorMenu","desc":"滑动listview的顶部菜单动画效果","who":"Jason"},{"readability":"","publishedAt":"2015-12-03T03:55:57.073000","ganhuo_id":"56cc6d26421aa95caa707f4c","type":"Android","url":"https://github.com/dodola/OverscrollScale","desc":"ListView 滑动到边缘的缩放效果","who":"mthli"}]
     */
    private int count;
    private boolean error;
    private List<ResultsEntity> results;

    public void setCount(int count) {
        this.count = count;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public boolean isError() {
        return error;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public class ResultsEntity {
        /**
         * readability :
         * publishedAt : 2016-05-12T12:04:43.857000
         * ganhuo_id : 57334c9d67765903fb61c418
         * type : Android
         * url : http://www.jianshu.com/p/a92955be0a3e
         * desc : 还在用ListView？
         * who : 陈宇明
         */
        private String readability;
        private String publishedAt;
        private String ganhuo_id;
        private String type;
        private String url;
        private String desc;
        private String who;

        public void setReadability(String readability) {
            this.readability = readability;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setGanhuo_id(String ganhuo_id) {
            this.ganhuo_id = ganhuo_id;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getReadability() {
            return readability;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getGanhuo_id() {
            return ganhuo_id;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getDesc() {
            return desc;
        }

        public String getWho() {
            return who;
        }
    }
}
