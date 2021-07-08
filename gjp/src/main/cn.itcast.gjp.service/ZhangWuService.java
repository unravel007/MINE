package main.cn.itcast.gjp.service;

import main.cn.itcast.gjp.dao.ZhangWuDao;

import java.sql.SQLException;

public class ZhangWuService {
    ZhangWuDao awd=new ZhangWuDao();

    public ZhangWuService() throws SQLException {
    }

    public void selectAll() throws SQLException {
        awd.selectAll();
    }
    public void addOneDate(){

    }
}
