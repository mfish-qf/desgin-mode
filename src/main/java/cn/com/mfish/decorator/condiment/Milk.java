package cn.com.mfish.decorator.condiment;

import cn.com.mfish.decorator.coffee.Coffee;

import java.math.BigDecimal;

/**
 * @author ：qiufeng
 * @description：厚乳
 * @date ：2022/4/5 22:04
 */
public class Milk extends CoffeeDecorator {
    private Coffee coffee;

    /**
     * 实现一个厚乳装饰器
     * @param coffee
     */
    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return "厚乳" + coffee.getDescription();
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(2).add(coffee.price());
    }
}
