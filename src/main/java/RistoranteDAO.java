import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class RistoranteDAO {
    public void insertRistorante (Ristorante ristorante) throws SQLException {
        String quary = "INSERT INTO RISTORANTE(NAME, ADRESS, OPENING_HOURS, CLOSING_HOURS, DELIVERY_PRICE, POSTI_MASSIMI, MEDIUM_PRICE)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, ristorante.getName());
        statement.setString(2, ristorante.getAddress());
        statement.setTimestamp(3, ristorante.getOpeningHours());
        statement.setTimestamp(4, ristorante.getClosingHours());
        statement.setDouble(5, ristorante.getDeliveryPrice());
        statement.setInt(6, ristorante.getPostiMassimi());
        statement.setDouble(7, ristorante.getMenu().generateMediumPrice());

        statement.executeUpdate();
        statement.close();
    }
}
