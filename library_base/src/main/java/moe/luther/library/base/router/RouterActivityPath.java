package moe.luther.library.base.router;

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * Created by goldze on 2018/6/21
 */

public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN +"/Main";

    }

    public static class Home{

        private  static final String HOME = "/home";

        public static final String PAGER_TEST = HOME + "/test";

    }

    public static class Navi{
        private static final String NAVI = "/navi";

        public static final String PAGER_DETAIL = NAVI + "/Detail";
    }

    /**
     * 身份验证组件
     */
    public static class Login {
        private static final String SIGN = "/login";
        /*登录界面*/
        public static final String PAGER_LOGIN = SIGN + "/Login";
    }

    /**
     * 用户组件
     */
    public static class User {
        private static final String USER = "/user";
        /*用户详情*/
        public static final String PAGER_USERDETAIL = USER + "/UserDetail";
    }
}
