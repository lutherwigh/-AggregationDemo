package outlook.luxi96.module_gank.model.bean;

import android.util.Log;

import com.google.gson.Gson;

public class BingBean {

    /**
     * data : {"enddate":"20180614","thumbnail_pic":null,"original_pic":null,"bmiddle_pic":null,"url":"http://www.bing.com/az/hprichbg/rb/DandelionXray_EN-CA8764727533_1920x1080.jpg"}
     * status : {"code":200,"message":""}
     */

    private DataEntity data;
    private StatusEntity status;

    public static BingBean objectFromData(String s){
        Log.d("BingBean","json " + s);
        return new Gson().fromJson(s,BingBean.class);
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public DataEntity getData() {
        return data;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public class DataEntity {
        /**
         * enddate : 20180614
         * thumbnail_pic : null
         * original_pic : null
         * bmiddle_pic : null
         * url : http://www.bing.com/az/hprichbg/rb/DandelionXray_EN-CA8764727533_1920x1080.jpg
         */
        private String enddate;
        private String thumbnail_pic;
        private String original_pic;
        private String bmiddle_pic;
        private String url;

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public void setThumbnail_pic(String thumbnail_pic) {
            this.thumbnail_pic = thumbnail_pic;
        }

        public void setOriginal_pic(String original_pic) {
            this.original_pic = original_pic;
        }

        public void setBmiddle_pic(String bmiddle_pic) {
            this.bmiddle_pic = bmiddle_pic;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getEnddate() {
            return enddate;
        }

        public String getThumbnail_pic() {
            return thumbnail_pic;
        }

        public String getOriginal_pic() {
            return original_pic;
        }

        public String getBmiddle_pic() {
            return bmiddle_pic;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public String toString() {
            return "DataEntity{" +
                    "enddate='" + enddate + '\'' +
                    ", thumbnail_pic='" + thumbnail_pic + '\'' +
                    ", original_pic='" + original_pic + '\'' +
                    ", bmiddle_pic='" + bmiddle_pic + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    public class StatusEntity {
        /**
         * code : 200
         * message :
         */
        private int code;
        private String message;

        public void setCode(int code) {
            this.code = code;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}
