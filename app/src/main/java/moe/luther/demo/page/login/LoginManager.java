package moe.luther.demo.page.login;

// 登录相关工具类

public class LoginManager {

    private static LoginManager manager;

    private boolean isLogin;

    public static void init(){
        manager = new LoginManager();
    }

    public static LoginManager getInstance(){

        if(manager == null){
            manager = new LoginManager();
        }
        return manager;
    }

    public boolean isLogin(){
        return isLogin;
    }

    public void login(){
        isLogin = true;
    }

}
