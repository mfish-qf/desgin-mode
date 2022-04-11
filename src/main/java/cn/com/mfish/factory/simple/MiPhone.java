package cn.com.mfish.factory.simple;

import cn.com.mfish.factory.Phone;

/**
 * @author ：qiufeng
 * @description：小米手机
 * @date ：2022/4/11 21:10
 */
public class MiPhone implements Phone {
    @Override
    public void assembled() {
        System.out.println("小米组装");
    }

    @Override
    public void test() {
        System.out.println("小米测试");
    }

    @Override
    public void pack() {
        System.out.println("小米包装");
    }
}
