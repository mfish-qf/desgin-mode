package cn.com.mfish.factory.simple;

import cn.com.mfish.factory.Router;

/**
 * @author ：qiufeng
 * @description：华为路由器
 * @date ：2022/4/11 21:11
 */
public class HuaRouter implements Router {
    @Override
    public void assembled() {
        System.out.println("华为路由器组装");
    }

    @Override
    public void test() {
        System.out.println("华为路由器测试");
    }

    @Override
    public void pack() {
        System.out.println("华为路由器包装");
    }
}
