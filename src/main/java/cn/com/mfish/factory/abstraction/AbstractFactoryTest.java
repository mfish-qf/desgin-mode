package cn.com.mfish.factory.abstraction;

/**
 * @author ：qiufeng
 * @description：抽象工厂测试
 * @date ：2022/4/11 23:26
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ProductFactory miFactory = FactoryProducer.getFactory("小米");
        miFactory.createPhone();
        miFactory.createRouter();
        ProductFactory huaFactory = FactoryProducer.getFactory("华为");
        huaFactory.createPhone();
        huaFactory.createRouter();
    }
}
