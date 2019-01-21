package moe.luther.demo.page.main.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import moe.luther.demo.App;
import moe.luther.demo.R;
import moe.luther.demo.view.base.BaseActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends BaseActivity {

    // @BindView(R.id.detail_content_tv)
    TextView content_tv;

    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what){
                case 1:
//                    RichText.fromHtml(msg.getData()
//                            .getString("body"))
//                            .into(content_tv);
                    break;
            }
            return false;
        }
    });

    @Override
    protected int getLayoutId() {
        return R.layout.app_activity_detail;
    }

    @Override
    public void init(Bundle bundle) {
        String url = getIntent().getStringExtra("url");
        // LogUtil.d("detail " + url);
        getPageContent(url);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        // RichText.recycle();
    }

    void getPageContent(String url){

        final Callback<String> observer = new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                // LogUtil.d(response.toString());
                String body = response.body();
                Message msg = new Message();
                Bundle data = new Bundle();
                data.putString("body",body);
                // LogUtil.d(body);
                msg.setData(data);
                msg.what = 1;
                handler.sendMessage(msg);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                // LogUtil.d("callback error" + t.getMessage());
            }
        };

        // JuheRetrofitance.getInstance().getHtml(observer,url);
    }

    @Override
    public void onBackPressed() {
        App.getInstance().removeActivity(this);
    }

}
