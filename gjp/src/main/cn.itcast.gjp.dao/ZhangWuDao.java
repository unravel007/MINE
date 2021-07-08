package main.cn.itcast.gjp.dao;

import main.cn.itcast.gjp.tools.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZhangWuDao {
    public ZhangWuDao() throws SQLException {
    }
    public void selectAll() throws SQLException {
        Connection con = JDBCUtils.getConnection();
        String sql = "select * from zhangwu";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("zwid") + " " + rs.getString("flname")
                    + " " + rs.getDouble("money") + " " + rs.getString("zhangHu") + " " + rs.getDate("createtime")
                    + " " + rs.getString("description"));
        }
        JDBCUtils.close(rs, ps);
    }
    public void addOneDtae(){

    }
}
