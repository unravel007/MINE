package main.cn.itcast.gjp.view;

import main.cn.itcast.gjp.service.ZhangWuService;

import java.sql.SQLException;
import java.util.Scanner;

public class MainView {
    /**

     * 运行方法

     */

    public void run() throws SQLException {
        /*

         * 1. 打印菜单 2. 获取用户输入 3. 调用对应方法

         */

        boolean flag =true;

        Scanner in = new Scanner(System.in);

        while (flag) {
            System.out.println("---------------管家婆家庭记账软件---------------");

            System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");

            System.out.println("请输入要操作的功能序号[1-5]:");

            int op =in.nextInt();

            switch (op) {
                case 1:

                    addZhangWu();

                    break;

                case 2:

                    editdZhangWu();

                    break;

                case 3:

                    deleteZhangWu();

                    break;

                case 4:

                    selectZhangWu();

                    break;

                case 5:

                    System.out.println("再见！");

                    flag = false;

                    break;

                default:

                    System.out.println("输入错误！");

            }

        }

    }

    private void selectZhangWu() throws SQLException {
        ZhangWuService zws = new ZhangWuService();
        zws.selectAll();
    }

    private void deleteZhangWu() {
    }

    private void editdZhangWu() {
    }

    private void addZhangWu() {
    }

}
