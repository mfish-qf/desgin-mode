package cn.com.mfish.decorator.condiment;

import cn.com.mfish.decorator.coffee.Coffee;

/**
 * @author ：qiufeng
 * @description：咖啡装饰器
 * @date ：2022/4/5 21:19
 */
public abstract class CoffeeDecorator extends Coffee {
    public abstract String getDescription();
}
