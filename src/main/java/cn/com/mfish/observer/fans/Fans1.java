package cn.com.mfish.observer.fans;


/**
 * @author ：qiufeng
 * @description：粉丝一
 * @date ：2022/4/4 19:09
 */
public class Fans1 extends AbObserver {

    @Override
    public void update(String name) {
        System.out.println("粉丝1收到[" + name + "]更新");
    }

}
