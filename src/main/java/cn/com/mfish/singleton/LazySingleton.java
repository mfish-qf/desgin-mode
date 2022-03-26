package cn.com.mfish.singleton;

/**
 * @author ：qiufeng
 * @description：懒汉方式(加锁影响效率)
 * @date ：2022/3/26 17:42
 */
public class LazySingleton {
    private volatile static LazySingleton singleton;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
