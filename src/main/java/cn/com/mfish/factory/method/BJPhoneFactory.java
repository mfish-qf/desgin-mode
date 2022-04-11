package cn.com.mfish.factory.method;

import cn.com.mfish.factory.Phone;
import cn.com.mfish.factory.simple.HuaPhone;

/**
 * @author ：qiufeng
 * @description：北京工厂
 * @date ：2022/4/11 22:28
 */
public class BJPhoneFactory extends AbstractPhoneFactory {
    @Override
    protected Phone createPhone(String type) {
        System.out.println("北京工厂开始创建...");
        if ("小米".equals(type)) {
            return new BJMiPhone();
        } else if ("华为".equals(type)) {
            return new HuaPhone();
        }
        return null;
    }
}
