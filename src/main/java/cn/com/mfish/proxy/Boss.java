package cn.com.mfish.proxy;

/**
 * @author ：qiufeng
 * @description：老板
 * @date ：2022/4/7 21:58
 */
public class Boss implements Action {
    @Override
    public void phone(String name) {
        System.out.println("您好，我是老板");
    }
}
