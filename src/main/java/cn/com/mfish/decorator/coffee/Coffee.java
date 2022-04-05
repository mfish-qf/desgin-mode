package cn.com.mfish.decorator.coffee;

import java.math.BigDecimal;

/**
 * @author ：qiufeng
 * @description：咖啡
 * @date ：2022/4/5 21:00
 */
public abstract class Coffee {
    String description = "未知咖啡";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal price();
}
