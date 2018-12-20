package moe.luther.demo.data.bean;

import java.util.List;

public class GankTodayBean {


    /**
     * category : ["App","瞎推荐","拓展资源","Android","iOS","休息视频","福利"]
     * error : false
     * results : {"App":[{"createdAt":"2018-11-28T03:55:08.74Z","images":
     * ["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e2nv6mj307i0dcjsy","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e3cw5ej307i0dcq3t","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e479l3j307i0dcgmg","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e55zp5j307i0dcq49","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e5zs9xj307i0dcq3y"],
     * "publishedAt":"2018-12-13T00:00:00.0Z","_id":"5bfe119c9d2122309624cbab",
     * "source":"chrome","used":true,"type":"App","url":"https://github.com/hanks-zyh/hydrogenApp",
     * "desc":"一个可插拔的Android应用程序，使用Lua脚本开发。","who":"lijinshanmx"},
     * {"createdAt":"2018-11-28T04:01:33.998Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e8lehkj315o0u04dd"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5bfe131d9d212230a505d140","source":"chrome","used":true,"type":"App","url":"https://github.com/arbelkilani/Beauty-Compass","desc":"Beauty-Compass是在Android设备上运行的指南针的简单演示应用程序。 ","who":"lijinshanmx"},{"createdAt":"2018-12-06T09:31:30.685Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eb9nqgj30u01qcq5e","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ebxrn1j30u01qc776","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ece4u8j30u01qcdi6","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ed4q6xj30u01qc41k"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c08ec729d212230a505d14f","source":"web","used":true,"type":"App","url":"https://github.com/boyan01/quiet-flutter","desc":"基于flutter的仿网易云音乐播放器","who":"YangBin"}],
     * "休息视频":[{"createdAt":"2018-12-13T09:06:52.785Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12212c9d21223f57f13479","source":"web","used":true,"type":"休息视频","url":"https://v.douyin.com/8AQBdu/","desc":"#看看寒冷的哈尔滨，刚洗完不到半个小时的衣服.","who":"lijinshanmx"}],
     * "福利":[{"createdAt":"2018-12-13T09:07:57.2Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12216d9d21223f5a2baea2","source":"web","used":true,"type":"福利","url":"https://ws1.sinaimg.cn/large/0065oQSqgy1fy58bi1wlgj30sg10hguu.jpg","desc":"2018-12-13","who":"lijinshanmx"}],
     * "拓展资源":[{"createdAt":"2018-12-13T08:05:44.786Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c0ceab09d21223f5a2bae94","source":"web","used":true,"type":"拓展资源","url":"http://quinnchen.me/2018/09/13/2018-09-13-asm-transform/","desc":"一个快速的字节码编译插件，让你轻松修改Android项目中的任何字节码","who":"Quinn"}],
     * "瞎推荐":[{"createdAt":"2018-11-29T09:32:20.813Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e90049j30ik0bgt8k","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ea0s57j31gy0mcabe","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eap9a4j31h40qt76s"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5bffb2249d2122309624cbbd","source":"web","used":true,"type":"瞎推荐","url":"https://github.com/bruceye777/cronmon","desc":"定时任务执行状态监控","who":"bruceye777"}],
     * "iOS":[{"createdAt":"2018-12-13T08:50:18.658Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121d4a9d21223f60727cc8","source":"chrome","used":true,"type":"iOS","url":"https://github.com/LinusU/Marionette","desc":"一个提供高级API来控制WKWebView的Swift库。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:53:47.716Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58galdavj30n01dsmzs"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121e1b9d21223f60727cca","source":"chrome","used":true,"type":"iOS","url":"https://github.com/ahmedAlmasri/SNCollectionViewLayout","desc":"集合视图布局是一组用于iOS的自定义流布局，它模仿移动应用程序的通用数据网格方法。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:55:36.985Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58k2wu7tg30dc0s97wm"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121e889d21223f60727ccb","source":"chrome","used":true,"type":"iOS","url":"https://github.com/jVirus/drawer-view","desc":"一个仿Apple的Apple Music播放器和Shortcuts组件视图的自定义UI组件.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:58:20.378Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121f2c9d21223f60727ccc","source":"chrome","used":true,"type":"iOS","url":"https://github.com/Tencent/MMKV","desc":"由微信开发的高效，小型移动键值存储框架。 适用于iOS，macOS和Android。","who":"lijinshanmx"}],
     * "Android":[{"createdAt":"2018-12-13T08:22:02.158Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eds38pj30rr0s0751"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1216aa9d21223f60727cbf","source":"chrome","used":true,"type":"Android","url":"https://github.com/Qihoo360/ArgusAPM","desc":"360开源的移动端可视化性能监控平台，为移动端APP提供性能监控与管理，可以迅速发现和定位各类APP性能和使用问题，帮助APP不断的提升用户体验。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:23:22.185Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1216fa9d21223f60727cc0","source":"chrome","used":true,"type":"Android","url":"https://github.com/Dovar66/DToast","desc":"同学，你的系统Toast可能需要修复一下！Fix Your Android Toast!","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:25:50.978Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eg162og309c0gikjl","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ei4rvsg309c0giqv5","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ejvz9hg309c0gie81"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12178e9d21223f5c4439c9","source":"chrome","used":true,"type":"Android","url":"https://github.com/wajahatkarim3/EasyFlipViewPager","desc":"用于在Android中的ViewPager中创建书籍和卡片翻转动画的库.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:28:54.298Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58epwnwyg30a00k0e84"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1218469d21223f5a2bae98","source":"chrome","used":true,"type":"Android","url":"https://github.com/imtuann/FloatingActionButtonExpandable","desc":"一个安卓浮动操作按钮的安卓库.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:29:31.354Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ev5w2wj31hc0u0n5s"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12186b9d21223f57f13472","source":"chrome","used":true,"type":"Android","url":"https://github.com/rosuH/AndroidFilePicker","desc":"FilePicker 是一个小巧快速的文件选择器框架，以快速集成、高自定义化和可配置化为目标不断前进~","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:30:55.766Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58f6v38xg30b40mub2e"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1218bf9d21223f5c4439cb","source":"chrome","used":true,"type":"Android","url":"https://github.com/amyu/StackCardLayoutManager","desc":"一个卡片式层叠效果的LayoutManager。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:31:52.593Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fqo8tyg30b40go1k4"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1218f89d21223f57f13473","source":"chrome","used":true,"type":"Android","url":"https://github.com/bitvale/Switcher","desc":"Android实现了Oleg Frolov的切换动画.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:33:21.695Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58frd0qug306b0dcwnz"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1219519d21223f5a2bae99","source":"chrome","used":true,"type":"Android","url":"https://github.com/thefuntasty/hauler","desc":"一个滑动手势来关闭Activity的库.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:34:59.776Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fspd8qj30u01o0q4h","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ft07gwj30u01o0409","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fthfd3j30u01o0q4p","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ftrzlxj30u01o0tag"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1219b39d21223f5a2bae9a","source":"chrome","used":true,"type":"Android","url":"https://github.com/RatelHub/rflutter_alert","desc":"RFlutter Alert是Flutter实现的可定制且易于使用的警报/弹出对话库。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:35:41.654Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fy9rmog307i0dckjn"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1219dd9d21223f57f13475","source":"chrome","used":true,"type":"Android","url":"https://github.com/hariprasanths/FloatingToast","desc":"Android库可以创建可自定义的浮动动画Toast。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:36:44.189Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g43gcbg309k0eokjp"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121a1c9d21223f5a2bae9c","source":"chrome","used":true,"type":"Android","url":"https://github.com/gungoren/ProgressableImageView","desc":"带进度条的imageview.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:38:22.42Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121a7e9d21223f5a2bae9d","source":"chrome","used":true,"type":"Android","url":"https://github.com/Muddz/Regret","desc":"Regret是一个Android库，适用于想要实现撤消/重做功能的应用.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:38:52.941Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g5vv2cg308c0eunpd"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121a9c9d21223f5c4439ce","source":"chrome","used":true,"type":"Android","url":"https://github.com/Victory-Over/SuperChartView","desc":"Android ChartView 可滑动的自动回滚图表控件、自定义View属性、折线曲线图表，仿Keep运动数据图表，可设置线条和阴影渐变色.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:39:21.295Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g6igjqj30k0140qfd","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g7mn5oj30k0140ds2"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121ab99d21223f5c4439d0","source":"chrome","used":true,"type":"Android","url":"https://github.com/Shashank02051997/LoginUI-Android","desc":"在Android中登录用户界面，具有创新，美观和创意背景.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:40:38.786Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g8yce9g30a00hs4qp"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121b069d21223f5c4439d1","source":"chrome","used":true,"type":"Android","url":"https://github.com/wangfeng19930909/DragFloatingActionButton","desc":"一个可以随处拖曳FloatingActionButton，边缘自动吸附，可设置按钮悬浮透明度。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:41:17.73Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58gabpjvg30b40n5hdt"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121b2d9d21223f60727cc7","source":"chrome","used":true,"type":"Android","url":"https://github.com/DarkionAvey/SwipeSpinnerWidget","desc":"一个使用回收视图的微调器，可以实现更快的滚动.","who":"lijinshanmx"}]}
     */
    private List<String> category;
    private boolean error;
    private ResultsEntity results;

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(ResultsEntity results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public boolean isError() {
        return error;
    }

    public ResultsEntity getResults() {
        return results;
    }

    public class ResultsEntity {
        /**
         * App : [{"createdAt":"2018-11-28T03:55:08.74Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e2nv6mj307i0dcjsy","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e3cw5ej307i0dcq3t","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e479l3j307i0dcgmg","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e55zp5j307i0dcq49","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e5zs9xj307i0dcq3y"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5bfe119c9d2122309624cbab","source":"chrome","used":true,"type":"App","url":"https://github.com/hanks-zyh/hydrogenApp","desc":"一个可插拔的Android应用程序，使用Lua脚本开发。","who":"lijinshanmx"},{"createdAt":"2018-11-28T04:01:33.998Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e8lehkj315o0u04dd"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5bfe131d9d212230a505d140","source":"chrome","used":true,"type":"App","url":"https://github.com/arbelkilani/Beauty-Compass","desc":"Beauty-Compass是在Android设备上运行的指南针的简单演示应用程序。 ","who":"lijinshanmx"},{"createdAt":"2018-12-06T09:31:30.685Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eb9nqgj30u01qcq5e","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ebxrn1j30u01qc776","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ece4u8j30u01qcdi6","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ed4q6xj30u01qc41k"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c08ec729d212230a505d14f","source":"web","used":true,"type":"App","url":"https://github.com/boyan01/quiet-flutter","desc":"基于flutter的仿网易云音乐播放器","who":"YangBin"}]
         * 休息视频 : [{"createdAt":"2018-12-13T09:06:52.785Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12212c9d21223f57f13479","source":"web","used":true,"type":"休息视频","url":"https://v.douyin.com/8AQBdu/","desc":"#看看寒冷的哈尔滨，刚洗完不到半个小时的衣服.","who":"lijinshanmx"}]
         * 福利 : [{"createdAt":"2018-12-13T09:07:57.2Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12216d9d21223f5a2baea2","source":"web","used":true,"type":"福利","url":"https://ws1.sinaimg.cn/large/0065oQSqgy1fy58bi1wlgj30sg10hguu.jpg","desc":"2018-12-13","who":"lijinshanmx"}]
         * 拓展资源 : [{"createdAt":"2018-12-13T08:05:44.786Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c0ceab09d21223f5a2bae94","source":"web","used":true,"type":"拓展资源","url":"http://quinnchen.me/2018/09/13/2018-09-13-asm-transform/","desc":"一个快速的字节码编译插件，让你轻松修改Android项目中的任何字节码","who":"Quinn"}]
         * 瞎推荐 : [{"createdAt":"2018-11-29T09:32:20.813Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e90049j30ik0bgt8k","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ea0s57j31gy0mcabe","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eap9a4j31h40qt76s"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5bffb2249d2122309624cbbd","source":"web","used":true,"type":"瞎推荐","url":"https://github.com/bruceye777/cronmon","desc":"定时任务执行状态监控","who":"bruceye777"}]
         * iOS : [{"createdAt":"2018-12-13T08:50:18.658Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121d4a9d21223f60727cc8","source":"chrome","used":true,"type":"iOS","url":"https://github.com/LinusU/Marionette","desc":"一个提供高级API来控制WKWebView的Swift库。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:53:47.716Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58galdavj30n01dsmzs"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121e1b9d21223f60727cca","source":"chrome","used":true,"type":"iOS","url":"https://github.com/ahmedAlmasri/SNCollectionViewLayout","desc":"集合视图布局是一组用于iOS的自定义流布局，它模仿移动应用程序的通用数据网格方法。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:55:36.985Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58k2wu7tg30dc0s97wm"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121e889d21223f60727ccb","source":"chrome","used":true,"type":"iOS","url":"https://github.com/jVirus/drawer-view","desc":"一个仿Apple的Apple Music播放器和Shortcuts组件视图的自定义UI组件.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:58:20.378Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121f2c9d21223f60727ccc","source":"chrome","used":true,"type":"iOS","url":"https://github.com/Tencent/MMKV","desc":"由微信开发的高效，小型移动键值存储框架。 适用于iOS，macOS和Android。","who":"lijinshanmx"}]
         * Android : [{"createdAt":"2018-12-13T08:22:02.158Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eds38pj30rr0s0751"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1216aa9d21223f60727cbf","source":"chrome","used":true,"type":"Android","url":"https://github.com/Qihoo360/ArgusAPM","desc":"360开源的移动端可视化性能监控平台，为移动端APP提供性能监控与管理，可以迅速发现和定位各类APP性能和使用问题，帮助APP不断的提升用户体验。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:23:22.185Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1216fa9d21223f60727cc0","source":"chrome","used":true,"type":"Android","url":"https://github.com/Dovar66/DToast","desc":"同学，你的系统Toast可能需要修复一下！Fix Your Android Toast!","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:25:50.978Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eg162og309c0gikjl","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ei4rvsg309c0giqv5","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ejvz9hg309c0gie81"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12178e9d21223f5c4439c9","source":"chrome","used":true,"type":"Android","url":"https://github.com/wajahatkarim3/EasyFlipViewPager","desc":"用于在Android中的ViewPager中创建书籍和卡片翻转动画的库.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:28:54.298Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58epwnwyg30a00k0e84"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1218469d21223f5a2bae98","source":"chrome","used":true,"type":"Android","url":"https://github.com/imtuann/FloatingActionButtonExpandable","desc":"一个安卓浮动操作按钮的安卓库.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:29:31.354Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ev5w2wj31hc0u0n5s"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c12186b9d21223f57f13472","source":"chrome","used":true,"type":"Android","url":"https://github.com/rosuH/AndroidFilePicker","desc":"FilePicker 是一个小巧快速的文件选择器框架，以快速集成、高自定义化和可配置化为目标不断前进~","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:30:55.766Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58f6v38xg30b40mub2e"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1218bf9d21223f5c4439cb","source":"chrome","used":true,"type":"Android","url":"https://github.com/amyu/StackCardLayoutManager","desc":"一个卡片式层叠效果的LayoutManager。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:31:52.593Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fqo8tyg30b40go1k4"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1218f89d21223f57f13473","source":"chrome","used":true,"type":"Android","url":"https://github.com/bitvale/Switcher","desc":"Android实现了Oleg Frolov的切换动画.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:33:21.695Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58frd0qug306b0dcwnz"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1219519d21223f5a2bae99","source":"chrome","used":true,"type":"Android","url":"https://github.com/thefuntasty/hauler","desc":"一个滑动手势来关闭Activity的库.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:34:59.776Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fspd8qj30u01o0q4h","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ft07gwj30u01o0409","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fthfd3j30u01o0q4p","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ftrzlxj30u01o0tag"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1219b39d21223f5a2bae9a","source":"chrome","used":true,"type":"Android","url":"https://github.com/RatelHub/rflutter_alert","desc":"RFlutter Alert是Flutter实现的可定制且易于使用的警报/弹出对话库。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:35:41.654Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58fy9rmog307i0dckjn"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c1219dd9d21223f57f13475","source":"chrome","used":true,"type":"Android","url":"https://github.com/hariprasanths/FloatingToast","desc":"Android库可以创建可自定义的浮动动画Toast。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:36:44.189Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g43gcbg309k0eokjp"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121a1c9d21223f5a2bae9c","source":"chrome","used":true,"type":"Android","url":"https://github.com/gungoren/ProgressableImageView","desc":"带进度条的imageview.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:38:22.42Z","publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121a7e9d21223f5a2bae9d","source":"chrome","used":true,"type":"Android","url":"https://github.com/Muddz/Regret","desc":"Regret是一个Android库，适用于想要实现撤消/重做功能的应用.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:38:52.941Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g5vv2cg308c0eunpd"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121a9c9d21223f5c4439ce","source":"chrome","used":true,"type":"Android","url":"https://github.com/Victory-Over/SuperChartView","desc":"Android ChartView 可滑动的自动回滚图表控件、自定义View属性、折线曲线图表，仿Keep运动数据图表，可设置线条和阴影渐变色.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:39:21.295Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g6igjqj30k0140qfd","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g7mn5oj30k0140ds2"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121ab99d21223f5c4439d0","source":"chrome","used":true,"type":"Android","url":"https://github.com/Shashank02051997/LoginUI-Android","desc":"在Android中登录用户界面，具有创新，美观和创意背景.","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:40:38.786Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58g8yce9g30a00hs4qp"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121b069d21223f5c4439d1","source":"chrome","used":true,"type":"Android","url":"https://github.com/wangfeng19930909/DragFloatingActionButton","desc":"一个可以随处拖曳FloatingActionButton，边缘自动吸附，可设置按钮悬浮透明度。","who":"lijinshanmx"},{"createdAt":"2018-12-13T08:41:17.73Z","images":["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58gabpjvg30b40n5hdt"],"publishedAt":"2018-12-13T00:00:00.0Z","_id":"5c121b2d9d21223f60727cc7","source":"chrome","used":true,"type":"Android","url":"https://github.com/DarkionAvey/SwipeSpinnerWidget","desc":"一个使用回收视图的微调器，可以实现更快的滚动.","who":"lijinshanmx"}]
         */
        private List<AppEntity> App;
        private List<休息视频Entity> 休息视频;
        private List<福利Entity> 福利;
        private List<拓展资源Entity> 拓展资源;
        private List<瞎推荐Entity> 瞎推荐;
        private List<IOSEntity> iOS;
        private List<AndroidEntity> Android;

        public void setApp(List<AppEntity> App) {
            this.App = App;
        }

        public void set休息视频(List<休息视频Entity> 休息视频) {
            this.休息视频 = 休息视频;
        }

        public void set福利(List<福利Entity> 福利) {
            this.福利 = 福利;
        }

        public void set拓展资源(List<拓展资源Entity> 拓展资源) {
            this.拓展资源 = 拓展资源;
        }

        public void set瞎推荐(List<瞎推荐Entity> 瞎推荐) {
            this.瞎推荐 = 瞎推荐;
        }

        public void setIOS(List<IOSEntity> iOS) {
            this.iOS = iOS;
        }

        public void setAndroid(List<AndroidEntity> Android) {
            this.Android = Android;
        }

        public List<AppEntity> getApp() {
            return App;
        }

        public List<休息视频Entity> get休息视频() {
            return 休息视频;
        }

        public List<福利Entity> get福利() {
            return 福利;
        }

        public List<拓展资源Entity> get拓展资源() {
            return 拓展资源;
        }

        public List<瞎推荐Entity> get瞎推荐() {
            return 瞎推荐;
        }

        public List<IOSEntity> getIOS() {
            return iOS;
        }

        public List<AndroidEntity> getAndroid() {
            return Android;
        }

        public class AppEntity {
            /**
             * createdAt : 2018-11-28T03:55:08.74Z
             * images : ["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e2nv6mj307i0dcjsy","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e3cw5ej307i0dcq3t","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e479l3j307i0dcgmg","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e55zp5j307i0dcq49","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e5zs9xj307i0dcq3y"]
             * publishedAt : 2018-12-13T00:00:00.0Z
             * _id : 5bfe119c9d2122309624cbab
             * source : chrome
             * used : true
             * type : App
             * url : https://github.com/hanks-zyh/hydrogenApp
             * desc : 一个可插拔的Android应用程序，使用Lua脚本开发。
             * who : lijinshanmx
             */
            private String createdAt;
            private List<String> images;
            private String publishedAt;
            private String _id;
            private String source;
            private boolean used;
            private String type;
            private String url;
            private String desc;
            private String who;

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setUsed(boolean used) {
                this.used = used;
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

            public String getCreatedAt() {
                return createdAt;
            }

            public List<String> getImages() {
                return images;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String get_id() {
                return _id;
            }

            public String getSource() {
                return source;
            }

            public boolean isUsed() {
                return used;
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

        public class 休息视频Entity {
            /**
             * createdAt : 2018-12-13T09:06:52.785Z
             * publishedAt : 2018-12-13T00:00:00.0Z
             * _id : 5c12212c9d21223f57f13479
             * source : web
             * used : true
             * type : 休息视频
             * url : https://v.douyin.com/8AQBdu/
             * desc : #看看寒冷的哈尔滨，刚洗完不到半个小时的衣服.
             * who : lijinshanmx
             */
            private String createdAt;
            private String publishedAt;
            private String _id;
            private String source;
            private boolean used;
            private String type;
            private String url;
            private String desc;
            private String who;

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setUsed(boolean used) {
                this.used = used;
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

            public String getCreatedAt() {
                return createdAt;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String get_id() {
                return _id;
            }

            public String getSource() {
                return source;
            }

            public boolean isUsed() {
                return used;
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

        public class 福利Entity {
            /**
             * createdAt : 2018-12-13T09:07:57.2Z
             * publishedAt : 2018-12-13T00:00:00.0Z
             * _id : 5c12216d9d21223f5a2baea2
             * source : web
             * used : true
             * type : 福利
             * url : https://ws1.sinaimg.cn/large/0065oQSqgy1fy58bi1wlgj30sg10hguu.jpg
             * desc : 2018-12-13
             * who : lijinshanmx
             */
            private String createdAt;
            private String publishedAt;
            private String _id;
            private String source;
            private boolean used;
            private String type;
            private String url;
            private String desc;
            private String who;

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setUsed(boolean used) {
                this.used = used;
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

            public String getCreatedAt() {
                return createdAt;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String get_id() {
                return _id;
            }

            public String getSource() {
                return source;
            }

            public boolean isUsed() {
                return used;
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

        public class 拓展资源Entity {
            /**
             * createdAt : 2018-12-13T08:05:44.786Z
             * publishedAt : 2018-12-13T00:00:00.0Z
             * _id : 5c0ceab09d21223f5a2bae94
             * source : web
             * used : true
             * type : 拓展资源
             * url : http://quinnchen.me/2018/09/13/2018-09-13-asm-transform/
             * desc : 一个快速的字节码编译插件，让你轻松修改Android项目中的任何字节码
             * who : Quinn
             */
            private String createdAt;
            private String publishedAt;
            private String _id;
            private String source;
            private boolean used;
            private String type;
            private String url;
            private String desc;
            private String who;

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setUsed(boolean used) {
                this.used = used;
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

            public String getCreatedAt() {
                return createdAt;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String get_id() {
                return _id;
            }

            public String getSource() {
                return source;
            }

            public boolean isUsed() {
                return used;
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

        public class 瞎推荐Entity {
            /**
             * createdAt : 2018-11-29T09:32:20.813Z
             * images : ["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58e90049j30ik0bgt8k","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58ea0s57j31gy0mcabe","https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eap9a4j31h40qt76s"]
             * publishedAt : 2018-12-13T00:00:00.0Z
             * _id : 5bffb2249d2122309624cbbd
             * source : web
             * used : true
             * type : 瞎推荐
             * url : https://github.com/bruceye777/cronmon
             * desc : 定时任务执行状态监控
             * who : bruceye777
             */
            private String createdAt;
            private List<String> images;
            private String publishedAt;
            private String _id;
            private String source;
            private boolean used;
            private String type;
            private String url;
            private String desc;
            private String who;

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setUsed(boolean used) {
                this.used = used;
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

            public String getCreatedAt() {
                return createdAt;
            }

            public List<String> getImages() {
                return images;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String get_id() {
                return _id;
            }

            public String getSource() {
                return source;
            }

            public boolean isUsed() {
                return used;
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

        public class IOSEntity {
            /**
             * createdAt : 2018-12-13T08:50:18.658Z
             * publishedAt : 2018-12-13T00:00:00.0Z
             * _id : 5c121d4a9d21223f60727cc8
             * source : chrome
             * used : true
             * type : iOS
             * url : https://github.com/LinusU/Marionette
             * desc : 一个提供高级API来控制WKWebView的Swift库。
             * who : lijinshanmx
             */
            private String createdAt;
            private String publishedAt;
            private String _id;
            private String source;
            private boolean used;
            private String type;
            private String url;
            private String desc;
            private String who;

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setUsed(boolean used) {
                this.used = used;
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

            public String getCreatedAt() {
                return createdAt;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String get_id() {
                return _id;
            }

            public String getSource() {
                return source;
            }

            public boolean isUsed() {
                return used;
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

        public class AndroidEntity {
            /**
             * createdAt : 2018-12-13T08:22:02.158Z
             * images : ["https://ww1.sinaimg.cn/large/0073sXn7gy1fy58eds38pj30rr0s0751"]
             * publishedAt : 2018-12-13T00:00:00.0Z
             * _id : 5c1216aa9d21223f60727cbf
             * source : chrome
             * used : true
             * type : Android
             * url : https://github.com/Qihoo360/ArgusAPM
             * desc : 360开源的移动端可视化性能监控平台，为移动端APP提供性能监控与管理，可以迅速发现和定位各类APP性能和使用问题，帮助APP不断的提升用户体验。
             * who : lijinshanmx
             */
            private String createdAt;
            private List<String> images;
            private String publishedAt;
            private String _id;
            private String source;
            private boolean used;
            private String type;
            private String url;
            private String desc;
            private String who;

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setUsed(boolean used) {
                this.used = used;
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

            public String getCreatedAt() {
                return createdAt;
            }

            public List<String> getImages() {
                return images;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public String get_id() {
                return _id;
            }

            public String getSource() {
                return source;
            }

            public boolean isUsed() {
                return used;
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
}
