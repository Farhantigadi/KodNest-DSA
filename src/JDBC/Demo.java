package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/Demo";
        String username = "root";
        String password = "8858";
        String sqlQ = "select * from customers";

        Connection con = DriverManager.getConnection(url, username, password);

        // 3. Create Statement
        Statement st = con.createStatement();

        ResultSet resultSet = st.executeQuery(sqlQ);
        resultSet.next();
        String name = resultSet.getString(1);

        System.out.println(name);

        con.close();


    }
}
