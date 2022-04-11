package cn.com.mfish.factory.method;

import cn.com.mfish.factory.simple.MiPhone;

/**
 * @author ：qiufeng
 * @description：北京小米
 * @date ：2022/4/11 22:36
 */
public class BJMiPhone extends MiPhone {
    @Override
    public void assembled() {
        System.out.println("小米安装北京牌屏幕");
        super.assembled();
    }
}
