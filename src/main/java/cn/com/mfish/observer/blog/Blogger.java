package cn.com.mfish.observer.blog;

import cn.com.mfish.observer.fans.Observer;

/**
 * @author ：qiufeng
 * @description：博主接口
 * @date ：2022/4/4 17:14
 */
public interface Blogger {
    //订阅
    void subscribe(Observer observer);

    //取消订阅
    void unSubscribe(Observer observer);

    //通知观察者
    void notifyObserver();

    //发布博文
    void publishBlog(String blog);
}
