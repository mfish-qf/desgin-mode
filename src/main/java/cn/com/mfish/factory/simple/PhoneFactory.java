package cn.com.mfish.factory.simple;

import cn.com.mfish.factory.Phone;

/**
 * @author ：qiufeng
 * @description：手机工厂
 * @date ：2022/4/11 21:10
 */
public class PhoneFactory {
    public Phone createPhone(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> cls = Class.forName(type);
        Phone phone = (Phone) cls.newInstance();
        phone.assembled();
        phone.test();
        phone.pack();
        return phone;
    }
}
