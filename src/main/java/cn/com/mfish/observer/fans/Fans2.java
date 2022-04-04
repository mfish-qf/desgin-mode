package cn.com.mfish.observer.fans;


/**
 * @author ：qiufeng
 * @description：粉丝2
 * @date ：2022/4/4 19:10
 */
public class Fans2 extends AbObserver{

    @Override
    public void receiveNotify(String name) {
        System.out.println("粉丝2收到["+name+"]更新");
    }
}
