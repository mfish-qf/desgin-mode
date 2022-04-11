package cn.com.mfish.factory.abstraction;

import cn.com.mfish.factory.Phone;
import cn.com.mfish.factory.Router;
import cn.com.mfish.factory.simple.PhoneFactory;

/**
 * @author ：qiufeng
 * @description：小米工厂
 * @date ：2022/4/11 23:08
 */
public class MiFactory implements ProductFactory {
    @Override
    public Phone createPhone() {
        return PhoneFactory.createPhone("小米");
    }

    @Override
    public Router createRouter() {
        return PhoneFactory.createRouter("小米");
    }
}
