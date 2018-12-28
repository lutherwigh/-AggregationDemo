package outlook.luxi96.module_home.model.bean.gank;

import java.util.List;

public class XianduSubCategoryBean {


    /**
     * error : false
     * results : [{"icon":"http://ww3.sinaimg.cn/large/0066P23Wjw1f7efqelrh4j30300300si.jpg","created_at":"2016-09-01T22:05:11.5Z","_id":"57c83597421aa97cb162d8b3","id":"appinn","title":"小众软件"},{"icon":"http://ww1.sinaimg.cn/large/0066P23Wjw1f7efr4hykoj30300303yc.jpg","created_at":"2016-09-01T22:05:52.420Z","_id":"57c835c0421aa97cbd81c74a","id":"iplaysoft","title":"异次元软件世界"},{"icon":"http://ww1.sinaimg.cn/large/0066P23Wjw1f7efrjl9h0j3074074glz.jpg","created_at":"2016-09-01T22:06:16.436Z","_id":"57c835d8421aa97cada9b798","id":"waerfa","title":"Mac玩儿法"},{"icon":"http://ww1.sinaimg.cn/large/0066P23Wjw1f9ryse8kvcj302s02smx3.jpg","created_at":"2016-11-14T21:37:28.905Z","_id":"5829be18421aa911cf2e156b","id":"appsolution","title":"AppSolution"},{"icon":"http://ww1.sinaimg.cn/large/610dc034gw1f9tqr0z86hj205k05zjrt.jpg","created_at":"2016-11-16T10:27:49.112Z","_id":"582bc425421aa93a61577f32","id":"wandoujia","title":"豌豆荚设计奖"},{"icon":"http://ww4.sinaimg.cn/large/0066P23Wjw1f9tqsq49s7j3030030t8i.jpg","created_at":"2016-11-16T10:32:08.326Z","_id":"582bc528421aa93a518777ae","id":"apprcn","title":"反斗软件"}]
     */
    private boolean error;
    private List<ResultsEntity> results;

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public boolean isError() {
        return error;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public class ResultsEntity {
        /**
         * icon : http://ww3.sinaimg.cn/large/0066P23Wjw1f7efqelrh4j30300300si.jpg
         * created_at : 2016-09-01T22:05:11.5Z
         * _id : 57c83597421aa97cb162d8b3
         * id : appinn
         * title : 小众软件
         */
        private String icon;
        private String created_at;
        private String _id;
        private String id;
        private String title;

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIcon() {
            return icon;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String get_id() {
            return _id;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
    }
}
