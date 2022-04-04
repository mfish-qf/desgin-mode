package cn.com.mfish.observer.fans;

import cn.com.mfish.observer.blog.Blogger;


/**
 * @author ：qiufeng
 * @description：观察者抽象类
 * @date ：2022/4/4 19:40
 */
public abstract class AbObserver implements Observer {

    public abstract void update(String name);

    /**
     * 订阅某个博主
     *
     * @param blogger
     */
    public void subscribe(Blogger blogger) {
        blogger.subscribe(this);
    }
}
