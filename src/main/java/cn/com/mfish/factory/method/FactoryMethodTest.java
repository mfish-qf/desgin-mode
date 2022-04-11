package cn.com.mfish.factory.method;

/**
 * @author ：qiufeng
 * @description：工厂方法测试
 * @date ：2022/4/11 22:43
 */
public class FactoryMethodTest {
    public static void main(String[] args){
        AbstractPhoneFactory factory = new  BJPhoneFactory();
        factory.create("小米");
        factory.create("华为");
        AbstractPhoneFactory njFactory = new NJPhoneFactory();
        njFactory.create("小米");
        njFactory.create("华为");
    }
}
