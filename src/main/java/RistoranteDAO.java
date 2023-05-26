import java.sql.*;

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

    public void updateRistorante (Ristorante ristorante) throws SQLException {
            String quary = "UPDATE RISTORANTE SET ADRESS = ?, OPENING_HOURS = ?, CLOSING_HOURS = ?, DELIVERY_PRICE = ?, POSTI_MASSIMI = ?, MEDIUM_PRICE = ? WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
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

    public void delete(String name) throws SQLException {
        String quary = "DELETE FROM antipasti WHERE id = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, name);

        statement.executeUpdate();
        statement.close();
    }

    public Ristorante getById(String name) throws SQLException {
        Ristorante ristorante = null;
        String quary = "SELECT NAME, ADRESS, OPENING_HOURS, CLOSING_HOURS, DELIVERY_PRICE, POSTI_MASSIMI, MEDIUM_PRICE FROM RISTORANTE WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    ristorante = new Ristorante(resultSet.getString("NAME"), resultSet.getString("ADRESS"), resultSet.getTimestamp("OPENING_HOURS"),
                            resultSet.getTimestamp("CLOSING_HOURS"), resultSet.getDouble("DELIVERY_PRICE"), new Menu(resultSet.getDouble("POSTI_MASSIMI")), resultSet.getInt("MEDIUM_PRICE"));
                    ristorante.setName(resultSet.getString("NAME"));
                    return ristorante;
                }
        return null;
    }

    public List<Antipasti> getAll() throws SQLException {
        List<Antipasti> antipastiList = new ArrayList<>();
        String sql = "SELECT id, name, price, portions, local_product FROM antipasti";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Antipasti antipasti = new Antipasti();
                antipasti.setId(resultSet.getInt("id"));
                antipasti.setName(resultSet.getString("name"));
                antipasti.setPrice(resultSet.getDouble("price"));
                antipasti.setPortions(resultSet.getInt("portions"));
                antipasti.setLocalProduct(resultSet.getBoolean("local_product"));
                antipastiList.add(antipasti);
            }
        }
        return antipastiList;
    }
}

