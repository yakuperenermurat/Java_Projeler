package week6.pratik3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDatabaseApp {
    // JDBC URL, username and password
    static final String JDBC_URL = "jdbc:postgresql://localhost:5432/patika";
    static final String USER = "postgres";
    static final String PASSWORD = "yakup660";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Database connection
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            statement = connection.createStatement();

            // Append data SQL query
            String insertSql1 = "INSERT INTO employees (name, position, salary) VALUES ('Yakup ermurat', 'Developer', 50000)";
            String insertSql2 = "INSERT INTO employees (name, position, salary) VALUES ('Murat Gümrük', 'Developer', 40000)";
            String insertSql3 = "INSERT INTO employees (name, position, salary) VALUES ('Mehmet Aydın', 'Sales', 45000)";
            String insertSql4 = "INSERT INTO employees (name, position, salary) VALUES ('Merve Tanrıkulu', 'Marketing', 42000)";
            String insertSql5 = "INSERT INTO employees (name, position, salary) VALUES ('Dilara Kurtulmuş', 'HR', 48000)";

            // Perform data insertion
            statement.executeUpdate(insertSql1);
            statement.executeUpdate(insertSql2);
            statement.executeUpdate(insertSql3);
            statement.executeUpdate(insertSql4);
            statement.executeUpdate(insertSql5);

            System.out.println("Veri başarıyla eklendi.");


            // SQL query
            String sql = "SELECT id, name, position, salary FROM employees";

            // Run sql query
            ResultSet resultSet = statement.executeQuery(sql);

            // Show results
            while (resultSet.next()) {
                // take data
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");

                // Wiew the results to the screen
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Position: " + position);
                System.out.println("Salary: " + salary);
                System.out.println("--------------------------");
            }
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}