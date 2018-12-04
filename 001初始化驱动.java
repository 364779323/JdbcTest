import java.sql.*;

class Main{
    public static void main(String[] args) {
        //初始化驱动
        try{
            //驱动类com.mysql.jdbc.Driver
            //如果忘记导包 就会抛出ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
