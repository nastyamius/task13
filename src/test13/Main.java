package test13;

import java.sql.*;
import java.util.Scanner;

public class Main {
    protected static Scanner in = new Scanner(System.in);
    protected static String tablename;
    protected static String mysqlUrl = "jdbc:mysql://localhost:3306/mysql";
    protected static Connection con;
    static{
        try{
            con = DriverManager.getConnection(mysqlUrl, "n", "12345");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws SQLException{
        int x = 0;
        String s = "";
        System.out.println("Введите название таблицы : ");
        tablename = in.nextLine();
        while (!"6".equals(s)){
            System.out.println("\n1.Вывести таблицы из базы данных. \n" +
                    "2. Создать таблицу в базе данных. \n" +
                    "3. Ввести список и сохранить в mySQL. \n" +
                    "4. Удалить элементы из списка mySQL из ID \n" +
                    "5. Сохранить итоговые результаты в Excel и вывести их в консоль.\n" +
                    "6. Завершить сеанс. \n");
            s = in.nextLine();

            try {
                x = Integer.parseInt(s);
            }
            catch (NumberFormatException e){
                System.out.println(s);
                System.out.println("Неправильно введенные данные!");
            }

            switch (x){
                case 1 -> {
                    case1.main();
                }
                case 2 -> {
                    case2.main();
                }
                case 3 -> {
                    case3.main();
                }
                case 4 -> {
                    case4.main();
                }
                case 5 -> {
                    case5.main();
                }
                case 6 -> {
                   System.out.println("Вы завершили работу");
                }
            }
        }
    }
}