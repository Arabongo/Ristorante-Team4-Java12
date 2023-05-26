import java.sql.*;

public class RistoranteDAO {
    public void createRistorante (Ristorante ristorante) throws SQLException {
        String query = "INSERT INTO RISTORANTE(NAME, ADRESS, OPENING_HOURS, CLOSING_HOURS, DELIVERY_PRICE, POSTI_MASSIMI, MEDIUM_PRICE)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
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
    public Ristorante retriveRistorante(Ristorante ristorante) throws SQLException {
        String query = "SELECT NAME, ADRESS, OPENING_HOURS, CLOSING_HOURS, DELIVERY_PRICE, POSTI_MASSIMI, MEDIUM_PRICE FROM RISTORANTE WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, ristorante.getName());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String address = resultSet.getString("ADRESS");
            Timestamp openingHours = resultSet.getTimestamp("OPENING_HOURS");
            Timestamp closingHours = resultSet.getTimestamp("CLOSING_HOURS");
            double deliveryPrice = resultSet.getDouble("DELIVERY_PRICE");
            int postiMassimi = resultSet.getInt("POSTI_MASSIMI");
            ristorante = new Ristorante(ristorante.getName(), address, openingHours, closingHours, deliveryPrice, ristorante.getMenu(), postiMassimi);
            return ristorante;
        }
        return null;
    }
    public void updateRistorante (Ristorante ristorante) throws SQLException {
            String query = "UPDATE RISTORANTE SET ADRESS = ?, OPENING_HOURS = ?, CLOSING_HOURS = ?, DELIVERY_PRICE = ?, POSTI_MASSIMI = ?, MEDIUM_PRICE = ? WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, ristorante.getAddress());
        statement.setTimestamp(2, ristorante.getOpeningHours());
        statement.setTimestamp(3, ristorante.getClosingHours());
        statement.setDouble(4, ristorante.getDeliveryPrice());
        statement.setInt(5, ristorante.getPostiMassimi());
        statement.setDouble(6, ristorante.getMenu().generateMediumPrice());
        statement.setString(7, ristorante.getName());

        statement.executeUpdate();
        statement.close();
    }
    public void deleteRistorante(String name) throws SQLException {
        String query = "DELETE FROM RISTORANTE WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, name);

        statement.executeUpdate();
        statement.close();
    }
}

