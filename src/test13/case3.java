package test13;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class case3 extends Main {

    public static void main() throws SQLException {
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите ID: ");
            int id = in.nextInt();
            listik array = new listik();
            ArrayList<String> strarr = array.input();
            ArrayList<Integer> intarr = array.random();
            String listString = String.join(", ", strarr);
            StringBuilder sb = new StringBuilder();
            for (int i = intarr.size() - 1; i >= 0; i--) {
                int num = intarr.get(i);
                sb.append(num);
            }
            String resstr = sb.toString();
            String listStringint = String.join(", ", resstr);
            String query = "INSERT INTO " + tablename + " (id, Randomnaya_stroka, SPISOK) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.setString(2, listStringint);
            stmt.setString(3, listString);
            stmt.executeUpdate();
        }
        System.out.println("\nДанные внесены в MySQL!\n");
        String query = "SELECT * FROM " + tablename + "";
        PreparedStatement stmt1 = con.prepareStatement(query);
        ResultSet rs = stmt1.executeQuery();
        System.out.println("Вывод текущего состояния таблицы: ");
        System.out.printf("%s | %s | %s |\n", "id", "Randomnaya_stroka", "SPISOK");
        while (rs.next()){
            int id_ = rs.getInt("id");
            String Randomnaya_stroka_ = rs.getString("Randomnaya_stroka");
            String SPISOK_ = rs.getString("SPISOK");
            System.out.printf("%d | %s | %s |\n", id_, Randomnaya_stroka_, SPISOK_);
        }
        System.out.println();
    }


}


