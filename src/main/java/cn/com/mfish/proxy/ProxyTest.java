package cn.com.mfish.proxy;

/**
 * @author ：qiufeng
 * @description：代理测试
 * @date ：2022/4/7 23:26
 */
public class ProxyTest {
    public static void main(String[] args){
        Secretary secretary = new Secretary(new Boss());
        secretary.phone("张三");
        secretary.phone("李四");
    }
}
