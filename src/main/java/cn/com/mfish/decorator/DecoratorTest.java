package cn.com.mfish.decorator;

import cn.com.mfish.decorator.coffee.Coffee;
import cn.com.mfish.decorator.coffee.Latte;
import cn.com.mfish.decorator.condiment.Caramel;
import cn.com.mfish.decorator.condiment.Meteorite;
import cn.com.mfish.decorator.condiment.Milk;

/**
 * @author ：qiufeng
 * @description：装饰测试方法
 * @date ：2022/4/5 21:39
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        System.out.println(latte.getDescription() + "价格：" + latte.price() + "元");
        Coffee milkLatte = new Milk(latte);
        System.out.println(milkLatte.getDescription() + "价格：" + milkLatte.price() + "元");
        Coffee meteoriteMilkLatte = new Meteorite(milkLatte);
        System.out.println(meteoriteMilkLatte.getDescription() + "价格：" + meteoriteMilkLatte.price() + "元");
        Coffee CaramelMilkLatte = new Caramel(milkLatte);
        System.out.println(CaramelMilkLatte.getDescription() + "价格：" + CaramelMilkLatte.price() + "元");

    }
}
