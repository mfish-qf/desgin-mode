package cn.com.mfish.observer.blog;

import cn.com.mfish.observer.fans.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：qiufeng
 * @description：博主抽象类
 * @date ：2022/4/4 17:23
 */
public abstract class AbBlogger implements Blogger {
    private List<Observer> observers;

    public AbBlogger() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(getName());
        }
    }

    public abstract String getName();

    /**
     * 发布文章
     *
     * @param blog
     */
    public void publishBlog(String blog) {
        System.out.println(blog);
        notifyObserver();
    }
}
