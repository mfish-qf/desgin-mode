package cn.com.mfish.factory.method;

import cn.com.mfish.factory.simple.MiPhone;

/**
 * @author ：qiufeng
 * @description：南京小米手机
 * @date ：2022/4/11 22:35
 */
public class NJMiPhone extends MiPhone {
    @Override
    public void assembled() {
        System.out.println("小米安装南京牌屏幕");
        super.assembled();
    }

}
