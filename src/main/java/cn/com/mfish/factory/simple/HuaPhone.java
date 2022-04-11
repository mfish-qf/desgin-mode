package cn.com.mfish.factory.simple;

import cn.com.mfish.factory.Phone;

/**
 * @author ：qiufeng
 * @description：华为手机
 * @date ：2022/4/11 21:11
 */
public class HuaPhone implements Phone {
    @Override
    public void assembled() {
        System.out.println("华为手机组装");
    }

    @Override
    public void test() {
        System.out.println("华为手机测试");
    }

    @Override
    public void pack() {
        System.out.println("华为手机包装");
    }
}
