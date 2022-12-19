package test13;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;

    public class case5 extends Main {
        public static void main() throws SQLException {
            String query = "SELECT * FROM " + tablename + "";
            PreparedStatement stmt1 = con.prepareStatement(query);
            ResultSet rs = stmt1.executeQuery();
            System.out.println("Сохраненные результаты: ");
            System.out.printf("%3s | %1000s | %1000s |\n", "id", "Randomnaya_stroka", "SPISOK");
            while (rs.next()){
                int id_ = rs.getInt("id");
                String Randomnaya_stroka_ = rs.getString("Randomnaya_stroka");
                String SPISOK_ = rs.getString("SPISOK");
                System.out.printf("%3d | %30s | %10s |\n", id_,Randomnaya_stroka_, SPISOK_);
            }
            System.out.println();

            System.out.println("Введите название для таблицы Excel:");
            String filename = in.nextLine();
            String query2 = "SELECT 'id', 'Randomnaya_stroka', 'SPISOK' UNION ALL SELECT * FROM " + tablename + " INTO OUTFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/" + filename + "'CHARACTER SET cp1251";
            PreparedStatement stmt2 = con.prepareStatement(query2);
            stmt2.executeQuery();
            System.out.println("Данные успешно экспортированы в Excel.");
        }
    }
