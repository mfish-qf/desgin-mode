package cn.com.mfish.decorator.condiment;

import cn.com.mfish.decorator.coffee.Coffee;

/**
 * @author ：qiufeng
 * @description：咖啡装饰器
 * @date ：2022/4/5 21:19
 */
public abstract class CoffeeDecorator extends Coffee {
    /**
     * 由于调料也必须要显示描述信息
     * 所以此处将描述再次转为抽象方法
     * 强制各种调料实现描述
     * @return 描述
     */
    public abstract String getDescription();
}
