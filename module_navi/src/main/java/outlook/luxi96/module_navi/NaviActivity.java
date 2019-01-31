package outlook.luxi96.module_navi;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zzhoujay.richtext.RichText;

import butterknife.BindView;
import me.goldze.mvvmhabit.utils.MaterialDialogUtils;
import moe.luther.library.base.base.BaseActivity;
import moe.luther.library.base.router.RouterActivityPath;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


@Route(path = RouterActivityPath.Navi.PAGER_DETAIL)
public class NaviActivity extends BaseActivity {

    @BindView(R2.id.navi_toolbar)
    Toolbar toolbar;
    @BindView(R2.id.text_container)
    TextView textContainer;

    // 或者直接传一个实体类进来
    String url;

    String title;

    Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    RichText.fromHtml(msg.getData().getString("body"))
                            .into(textContainer);
                    break;
            }
            return false;
        }
    });

    @Override
    public int getResId() {
        return R.layout.activity_navi;
    }

    @Override
    public void init(Bundle savedInstanceState) {
        url = "https://www.ithome.com/0/407/910.htm";
        // url = getIntent().getStringExtra("url");
        // LogUtil.d("detail " + url);
        getPageContent(url);
        findViewById(R.id.navi_toolbar);
    }

    void initToolbar(){
        setSupportActionBar(toolbar);
        toolbar.setTitle("");
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
                 MaterialDialogUtils.showBasicDialog(NaviActivity.this,"callback error" + t.getMessage());
            }
        };

        // JuheRetrofitance.getInstance().getHtml(observer,url);
    }

}
