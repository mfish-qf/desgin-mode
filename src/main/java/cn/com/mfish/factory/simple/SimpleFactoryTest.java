package cn.com.mfish.factory.simple;

/**
 * @author ：qiufeng
 * @description：简单工厂测试
 * @date ：2022/4/11 21:18
 */
public class SimpleFactoryTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.createPhone("cn.com.mfish.factory.simple.MiPhone");
        System.out.println("小米手机生产完成");
        phoneFactory.createPhone("cn.com.mfish.factory.simple.HuaPhone");
        System.out.println("华为手机生产完成");
    }
}
