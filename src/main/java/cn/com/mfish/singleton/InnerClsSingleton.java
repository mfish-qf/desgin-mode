package cn.com.mfish.singleton;

/**
 * @author ：qiufeng
 * @description：内部类方式创建(内部类不方便参数传递)
 * @date ：2022/3/26 17:48
 */
public class InnerClsSingleton {
    public static class Singleton {
        private static final InnerClsSingleton singleton = new InnerClsSingleton();
    }

    private InnerClsSingleton() {

    }

    public static final InnerClsSingleton getInstance() {
        return Singleton.singleton;
    }
}
