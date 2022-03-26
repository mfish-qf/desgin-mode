package cn.com.mfish.singleton;

/**
 * @author ：qiufeng
 * @description：饿汉方式（类加载时初始化内存浪费）
 * @date ：2022/3/26 17:38
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
