package main.cn.itcast.gjp.app;

import main.cn.itcast.gjp.view.MainView;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        new MainView().run();
    }
}
