import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/northwind",
                    "root",
                    ""
            );

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM orders WHERE ship_name = ? OR ship_name = ?"
            );

            statement.setString(1,"Christina Lee");
            statement.setString(2,"Karen Toh");

            ResultSet resultado = statement.executeQuery();

            while (resultado.next()){
                System.out.printf(
                     "%d = %s\n",
                     resultado.getInt("id"),
                     resultado.getString("ship_name")
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
