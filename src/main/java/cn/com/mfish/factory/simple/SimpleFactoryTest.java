package cn.com.mfish.factory.simple;

/**
 * @author ：qiufeng
 * @description：简单工厂测试
 * @date ：2022/4/11 21:18
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        PhoneFactory.createPhone("小米");
        System.out.println("小米手机生产完成");
        PhoneFactory.createPhone("华为");
        System.out.println("华为手机生产完成");
    }
}
