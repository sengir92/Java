import java.io.*;
import java.sql.*;

public class Main {

    //Define database informations
    public static final String databaseBaseUrl = "jdbc:postgresql://localhost/Homework";
    public static final String username = "postgres";
    public static final String password = "postgres";

    public static void main(String[] args) {
        Connection connect = null;

        try {
            //Connection to database
            connect = DriverManager.getConnection(databaseBaseUrl, username, password);
            Statement st = connect.createStatement();

            //Create prepared statement
            PreparedStatement pr = connect.prepareStatement("INSERT INTO employees (name,position,salary) VALUES (?,?,?)");

            //Adding employees information to database manually
            pr.setString(1, "John");
            pr.setString(2, "Jr Dev");
            pr.setDouble(3, 2500.0);
            pr.executeUpdate();

            pr.setString(1, "Oleg");
            pr.setString(2, "Senior Dev");
            pr.setDouble(3, 4000.0);
            pr.executeUpdate();

            pr.setString(1, "Tom");
            pr.setString(2, "Accountant");
            pr.setDouble(3, 3250.0);
            pr.executeUpdate();

            pr.setString(1, "Gelly");
            pr.setString(2, "Intern");
            pr.setDouble(3, 1500.0);
            pr.executeUpdate();

            pr.setString(1, "Julia");
            pr.setString(2, "Manager");
            pr.setDouble(3, 6500.0);
            pr.executeUpdate();


            //Print information from databese
            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");
            System.out.println("Employee List: ");
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("Name : " + resultSet.getString("name"));
                System.out.println("Position : " + resultSet.getString("position"));
                System.out.println("Salary : " + resultSet.getInt("salary"));
                System.out.println("########");
            }

            //Close functions
            pr.close();
            st.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
