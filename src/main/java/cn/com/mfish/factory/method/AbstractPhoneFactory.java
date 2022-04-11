package cn.com.mfish.factory.method;

import cn.com.mfish.factory.Phone;

/**
 * @author ：qiufeng
 * @description：工厂方法
 * @date ：2022/4/11 21:34
 */
public abstract class AbstractPhoneFactory {
    public Phone create(String type) {
        Phone phone = createPhone(type);
        phone.assembled();
        phone.test();
        phone.pack();
        return phone;
    }

    protected abstract Phone createPhone(String type);
}
