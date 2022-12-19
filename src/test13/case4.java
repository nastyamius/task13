package test13;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class case4 extends Main {
    public static void main() throws SQLException {
        System.out.print("Введите ID удаляемой строки: ");
        String s = in.nextLine();
        int flag = 0;
        int id_del = -5;
        while (flag == 0) {
            try {
                id_del = Integer.parseInt(s);
                flag = 1;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода. Введите целое число");
            }
        }
        Statement stmt1 = con.createStatement();
        String query = "DELETE FROM " + tablename + " WHERE id=" + id_del + "";
        stmt1.executeUpdate(query);
        System.out.println("Строка с id " + id_del + " успешно удалена!");
    }
}





