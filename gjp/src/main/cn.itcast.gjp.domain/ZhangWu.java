package main.cn.itcast.gjp.domain;

public class ZhangWu {
    private int zwid;// id

    private String flname;// 分类名称

    private String zhangHu;// 账户名称

    private double money;//金额

    private String createtime;// 创建时间

    private String description;// 说明



    public String getFlname() {
        return flname;

    }

    public void setFlname(String flname) {
        this.flname =flname;

    }

    public String getZhangHu() {
        return zhangHu;

    }

    public void setZhangHu(String hangHu) {
        this.zhangHu =zhangHu;

    }

    public int getZwid() {
        return zwid;

    }

    public void setZwid(int zwid) {
        this.zwid =zwid;

    }

    public double getMoney() {
        return money;

    }

    public void setMoney(double money) {
        this.money =money;

    }

    public String getCreatetime() {
        return createtime;

    }

    public void setCreatetime(String createtime) {
        this.createtime =createtime;

    }

    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        this.description =description;

    }
}
