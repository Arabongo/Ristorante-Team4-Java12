import java.sql.PreparedStatement;
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
}
