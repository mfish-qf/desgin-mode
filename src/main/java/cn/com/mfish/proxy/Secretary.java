package cn.com.mfish.proxy;

/**
 * @author ：qiufeng
 * @description：秘书
 * @date ：2022/4/7 23:21
 */
public class Secretary implements Action {
    Action boss;

    public Secretary(Action boss) {
        this.boss = boss;
    }

    @Override
    public void phone(String name) {
        System.out.println("您好，我是老板秘书！您是哪位？");
        System.out.println("我是" + name + "!");
        if ("张三".equals(name)) {
            System.out.println("老板现正在开会，不方便接您电话！");
            return;
        }
        System.out.println("好的，您稍等！");
        boss.phone(name);
    }
}
