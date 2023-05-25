import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private static Connection connection;

    private static String URL = "jdbc:mysql://localhost:3306/ristoranteprova";

    private static String USERNAME = "root";

    private static String PASSWORD = "1234567890";

    // Costruttore privato per impedire l'istanziazione diretta
    private ConnectionProvider() {
        // Inizializzazione
    }

    public static Connection getInstance() throws SQLException {
        if (connection == null || connection.isClosed()) {
                    connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            }
        return connection;
    }
}