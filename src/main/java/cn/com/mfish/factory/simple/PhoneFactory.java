package cn.com.mfish.factory.simple;

import cn.com.mfish.factory.Phone;
import cn.com.mfish.factory.Router;

/**
 * @author ：qiufeng
 * @description：手机工厂
 * @date ：2022/4/11 21:10
 */
public class PhoneFactory {
    public static Phone createPhone(String type) {
        Phone phone = null;
        if ("小米".equals(type)) {
            phone = new MiPhone();
        } else if ("华为".equals(type)) {
            phone = new HuaPhone();
        }
        phone.assembled();
        phone.test();
        phone.pack();
        return phone;
    }
    public static Router createRouter(String type) {
        Router router = null;
        if ("小米".equals(type)) {
            router = new MiRouter();
        } else if ("华为".equals(type)) {
            router = new HuaRouter();
        }
        router.assembled();
        router.test();
        router.pack();
        return router;
    }
}
