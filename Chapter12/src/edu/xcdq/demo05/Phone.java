package edu.xcdq.demo05;

/**
 * @author 王艺博
 * @date 2021/4/1 11:08
 */
public class Phone {
    public String xiaZai() {// 下载音乐
        return "好汉歌";
    }

    public void boFang() { // 播放音乐
        System.out.println("播放" + xiaZai());
    }
    public void chongDian() { // 给手机充电
        Cell cell = new Cell();
        cell.pinPai = "ddd";
        cell.xuDian();
    }
}
