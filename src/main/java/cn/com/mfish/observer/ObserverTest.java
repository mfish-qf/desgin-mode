package cn.com.mfish.observer;

import cn.com.mfish.observer.blog.Blogger;
import cn.com.mfish.observer.blog.DaBlogger;
import cn.com.mfish.observer.blog.XiaoBlogger;
import cn.com.mfish.observer.fans.AbObserver;
import cn.com.mfish.observer.fans.Fans1;
import cn.com.mfish.observer.fans.Fans2;

/**
 * @author ：qiufeng
 * @description：观察者测试
 * @date ：2022/4/4 17:19
 */
public class ObserverTest {
    public static void main(String[] args) {
        Blogger daBlogger = new DaBlogger();
        Blogger xiaoBlogger = new XiaoBlogger();
        AbObserver fans1 = new Fans1();
        fans1.subscribe(daBlogger);
        fans1.subscribe(xiaoBlogger);

        AbObserver fans2 = new Fans2();
        fans2.subscribe(daBlogger);

        daBlogger.publishBlog("大佬发了一篇牛逼的博文");
        xiaoBlogger.publishBlog("小博主发了一篇小博文");
    }
}
