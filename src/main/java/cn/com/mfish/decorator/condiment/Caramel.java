package cn.com.mfish.decorator.condiment;

import cn.com.mfish.decorator.coffee.Coffee;

import java.math.BigDecimal;

/**
 * @author ：qiufeng
 * @description：焦糖
 * @date ：2022/4/5 21:31
 */
public class Caramel extends CoffeeDecorator {
    private Coffee coffee;

    public Caramel(Coffee latte) {
        this.coffee = latte;
    }

    @Override
    public String getDescription() {
        return "焦糖" + coffee.getDescription();
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(1).add(coffee.price());
    }
}
