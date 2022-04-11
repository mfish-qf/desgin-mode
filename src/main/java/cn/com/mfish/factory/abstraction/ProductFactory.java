package cn.com.mfish.factory.abstraction;

import cn.com.mfish.factory.Phone;
import cn.com.mfish.factory.Router;

/**
 * @author ：qiufeng
 * @description：产品工厂
 * @date ：2022/4/11 23:03
 */
public interface ProductFactory {
    //创建手机
    Phone createPhone();

    //创建路由器
    Router createRouter();
}
