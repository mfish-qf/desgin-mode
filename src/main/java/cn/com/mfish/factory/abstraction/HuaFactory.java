package cn.com.mfish.factory.abstraction;

import cn.com.mfish.factory.Phone;
import cn.com.mfish.factory.Router;
import cn.com.mfish.factory.simple.PhoneFactory;

/**
 * @author ：qiufeng
 * @description：华为工厂
 * @date ：2022/4/11 23:07
 */
public class HuaFactory implements ProductFactory {
    @Override
    public Phone createPhone() {
        return PhoneFactory.createPhone("华为");
    }

    @Override
    public Router createRouter() {
        return PhoneFactory.createRouter("华为");
    }
}
