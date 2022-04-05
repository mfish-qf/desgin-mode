package cn.com.mfish.decorator.condiment;

import cn.com.mfish.decorator.coffee.Coffee;

import java.math.BigDecimal;

/**
 * @author ：qiufeng
 * @description：陨石
 * @date ：2022/4/5 22:08
 */
public class Meteorite extends CoffeeDecorator {
    private Coffee coffee;

    /**
     * 实现陨石装饰器
     * @param coffee
     */
    public Meteorite(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return "陨石" + coffee.getDescription();
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(2).add(coffee.price());
    }
}
