package cn.com.mfish.observer.blog;

/**
 * @author ：qiufeng
 * @description：小博主
 * @date ：2022/4/4 19:36
 */
public class XiaoBlogger extends AbBlogger {
    public XiaoBlogger() {
        super();
        System.out.println("我是" + getName());
    }

    @Override
    public String getName() {
        return "小博主";
    }
}
