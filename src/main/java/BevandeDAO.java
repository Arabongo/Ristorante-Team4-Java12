import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BevandeDAO {
    public void insertBevande (Bevande bevande) throws SQLException {
        String quary = "INSERT INTO BEVANDE(NAME, PRICE, INGREDIENTS, ALCOHOLIC, ALCOHOL_PERCENTAGE)" +
                "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, bevande.getName());
        statement.setDouble(2, bevande.getPrice());
        statement.setString(3, bevande.getIngredients().toString());
        statement.setBoolean(4, bevande.isAlcoholic());
        statement.setDouble(5, bevande.getAlcoholPercentage());

        statement.executeUpdate();
        statement.close();
    }
    public Bevande retriveBevande(Bevande bevande) throws SQLException {
        String query = "SELECT NAME, PRICE, INGREDIENTS, ALCOHOLIC, ALCOHOL_PERCENTAGE FROM BEVANDE WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, bevande.getName());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Double price = resultSet.getDouble("PRICE");
            Boolean alcoholic = resultSet.getBoolean("ALCOHOLIC");
            Double alcoholPercentage = resultSet.getDouble("ALCOHOL_PERCENTAGE");
            Bevande selectedDish = new Bevande(bevande.getName(), price, bevande.getIngredients(),alcoholic, alcoholPercentage, false, bevande.getTipoMenuEnum());
            return selectedDish;
        }
        return null;
    }
    public void updateBevande (Bevande bevande) throws SQLException {
        String query = "UPDATE BEVANDE SET PRICE = ?, INGREDIENTS = ?, ALCOHOLIC = ?, ALCOHOL_PERCENTAGE = ? WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setDouble(1, bevande.getPrice());
        statement.setString(2, bevande.getIngredients().toString());
        statement.setBoolean(3, bevande.isAlcoholic());
        statement.setDouble(4, bevande.getAlcoholPercentage());
        statement.setString(5, bevande.getName());

        statement.executeUpdate();
        statement.close();
    }
    public void deleteBevande(String name) throws SQLException {
        String query = "DELETE FROM ANTIPASTI WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, name);

        statement.executeUpdate();
        statement.close();
    }
}
