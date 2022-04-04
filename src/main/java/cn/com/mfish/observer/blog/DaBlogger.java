package cn.com.mfish.observer.blog;

/**
 * @author ：qiufeng
 * @description：大佬博主
 * @date ：2022/4/4 19:35
 */
public class DaBlogger extends AbBlogger {
    public DaBlogger() {
        super();
        System.out.println("我是" + getName());
    }

    @Override
    public String getName() {
        return "大佬博主";
    }
}
