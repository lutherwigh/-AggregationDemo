package outlook.luxi96.module_login;

// 登录相关工具类

public class LoginManager {

    private static LoginManager manager;

    private boolean isLogin;

    public static void init(){
        manager = new LoginManager();
    }

    private long token;

    // todo 需要在sp中存储登录信息
    // uid
    // token
    // duration gmt + week_seconds

    public static LoginManager getInstance(){

        if(manager == null){
            manager = new LoginManager();
        }
        return manager;
    }

    public boolean isLogin(){

        if(validation()){
            login();
        }else{

        }
        return isLogin;
    }

    public void login(){
        isLogin = true;
    }

    /**
     * 获取登录token
     */
    public void getToken(){

    }

    /**
     * 验证token是否在有效期内
     * @return
     */
    public boolean validation(){
        getToken();
        // 如果token不存在
        return true;
    }

}
