import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlTest {

    static String USERNAME = "root";
    static String PASSWORD = "123456";
    static String CLASSFORNAME = "com.mysql.cj.jdbc.Driver";
    static String MYSQL_URL = "jdbc:mysql://localhost:3306/pressuretest?test=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";


    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName(CLASSFORNAME);
            conn = DriverManager.getConnection(MYSQL_URL,USERNAME,PASSWORD);
            String sql = "select * from test";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("数据库连接成功！");
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch (Exception e){
            System.out.println("数据库出错！");
            e.getMessage();
        }

    }
}
