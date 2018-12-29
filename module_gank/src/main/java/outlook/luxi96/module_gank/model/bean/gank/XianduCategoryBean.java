package outlook.luxi96.module_gank.model.bean.gank;

import java.util.List;

public class XianduCategoryBean {


    /**
     * error : false
     * results : [{"name":"科技资讯","en_name":"wow","rank":1,"_id":"57c83777421aa97cbd81c74d"},{"name":"趣味软件/游戏","en_name":"apps","rank":5,"_id":"57c83577421aa97cb162d8b1"},{"name":"装备党","en_name":"imrich","rank":50,"_id":"57c83627421aa97cbd81c74b"},{"name":"草根新闻","en_name":"funny","rank":100,"_id":"57c836b4421aa97cbd81c74c"},{"name":"Android","en_name":"android","rank":300,"_id":"5827dc81421aa911e32d87cc"},{"name":"创业新闻","en_name":"diediedie","rank":340,"_id":"582c5346421aa95002741a8e"},{"name":"独立思想","en_name":"thinking","rank":400,"_id":"5829c2bc421aa911e32d87e7"},{"name":"iOS","en_name":"iOS","rank":500,"_id":"5827dd7b421aa911d3bb7eca"},{"name":"团队博客","en_name":"teamblog","rank":600,"_id":"5829b881421aa911dbc9156b"}]
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
         * name : 科技资讯
         * en_name : wow
         * rank : 1
         * _id : 57c83777421aa97cbd81c74d
         */
        private String name;
        private String en_name;
        private int rank;
        private String _id;

        public void setName(String name) {
            this.name = name;
        }

        public void setEn_name(String en_name) {
            this.en_name = en_name;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getName() {
            return name;
        }

        public String getEn_name() {
            return en_name;
        }

        public int getRank() {
            return rank;
        }

        public String get_id() {
            return _id;
        }
    }
}
