package JDBC;

import java.sql.*;

public class SelectAnyTable {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Demo",
                "root",
                "8858"
        );

        String sql = "SELECT * FROM customers";  // ANY table works

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        ResultSetMetaData meta = rs.getMetaData();
        int columnCount = meta.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + " | ");
            }
            System.out.println();
        }

        rs.close();
        ps.close();
        con.close();
    }
}


  class InsertDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Demo",
                "root",
                "8858"
        );

        String sql = "INSERT INTO customers(name, age) VALUES (?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "Farhan");
        ps.setInt(2, 23);

        int rows = ps.executeUpdate();
        System.out.println("Inserted: " + rows);

        ps.close();
        con.close();
    }
}


  class UpdateDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Demo",
                "root",
                "8858"
        );

        String sql = "UPDATE customers SET age = ? WHERE name = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 30);
        ps.setString(2, "Farhan");

        int rows = ps.executeUpdate();
        System.out.println("Updated: " + rows);

        ps.close();
        con.close();
    }
}



  class DeleteDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Demo",
                "root",
                "8858"
        );

        String sql = "DELETE FROM customers WHERE name = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "Farhan");

        int rows = ps.executeUpdate();
        System.out.println("Deleted: " + rows);

        ps.close();
        con.close();
    }
}
 