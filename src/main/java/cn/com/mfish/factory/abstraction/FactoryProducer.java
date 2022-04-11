package cn.com.mfish.factory.abstraction;

/**
 * @author ：qiufeng
 * @description：工厂制作者
 * @date ：2022/4/11 23:24
 */
public class FactoryProducer {
    public static ProductFactory getFactory(String type) {
        if ("小米".equals(type)) {
            return new MiFactory();
        } else if ("华为".equals(type)) {
            return new HuaFactory();
        }
        return null;
    }
}
