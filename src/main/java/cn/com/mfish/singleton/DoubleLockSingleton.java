package cn.com.mfish.singleton;

/**
 * @author ：qiufeng
 * @description：双检锁方式 （jdk1.5以上安全可用，个人比较喜欢这种方式适用面广，性能好）
 * @date ：2022/3/26 17:35
 */
public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton singleton;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
