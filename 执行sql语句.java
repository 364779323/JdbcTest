import java.sql.*;
class Main{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testmysql?characterEncoding=UTF-8&useSSL=false",
                    "root","lh367960");
            Statement s=c.createStatement();

            //准备sql语句
            //注意 字符串要用单引号
            String sql= "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            s.execute(sql);

            System.out.println("执行插入语句成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
