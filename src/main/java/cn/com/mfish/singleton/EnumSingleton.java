package cn.com.mfish.singleton;

/**
 * @author ：qiufeng
 * @description：枚举单例(可以防止反射重复创建对象，创建时不能传递参数)
 * @date ：2022/3/27 13:35
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomeThing() {
        //实现业务逻辑
    }
}

