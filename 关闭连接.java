import java.sql.*;
class Main{
    public static void main(String[] args) {
        Connection c=null;
        Statement s=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testmysql?characterEncoding=UTF-8&useSSL=false",
                    "root","lh367960");
            s=c.createStatement();

            //准备sql语句
            //注意 字符串要用单引号
            String sql= "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            s.execute(sql);

            System.out.println("执行插入语句成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            //数据库的连接是有限资源，相关操作结束后，养成关闭数据库的好习惯
            //先关闭statement
            if(s !=null){
                try{
                    s.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            //再关闭connection
            if(c != null){
                try{
                    c.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
