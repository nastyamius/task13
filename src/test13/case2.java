package test13;

import java.sql.*;

public class case2 extends Main {
    public static void main() throws SQLException {
        try {
            Statement stmt1 = con.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS " + tablename + " (id int, Randomnaya_stroka VARCHAR(1000), SPISOK VARCHAR(1000))";
            stmt1.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Таблица " + tablename + " создана!");
    }
}
