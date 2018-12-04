import java.sql.*;
//建立与数据库的Connection连接
//        这里需要提供：
//        数据库所处于的ip:127.0.0.1 (本机)
//        数据库的端口号： 3306 （mysql专用端口号）
//        数据库名称 how2java
//        编码方式 UTF-8
//        账号 root
//        密码 admin
//        url中如果不加useSSL=false会提示不建议使用没有服务器身份验证的SSL连接 解决方法：1.url中添加useSSL=false 2.添加useSSL=true,并提供服务器的验证证书
class Main{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testmysql?characterEncoding=UTF-8&useSSL=false",
                    "root","lh367960");
            System.out.println("连接成功,获取链接对象: "+c);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
