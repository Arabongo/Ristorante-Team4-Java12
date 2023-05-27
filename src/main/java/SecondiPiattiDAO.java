import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SecondiPiattiDAO {
    public void createSecondiPiatti (SecondiPiatti secondiPiatti) throws SQLException {
        String quary = "INSERT INTO SECONDIPIATTI(NAME, PRICE, INGREDIENTS, IS_SPICY)" +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, secondiPiatti.getName());
        statement.setDouble(2, secondiPiatti.getPrice());
        statement.setString(3, secondiPiatti.getIngredients().toString());
        statement.setBoolean(4, secondiPiatti.isSpicy());

        statement.executeUpdate();
        statement.close();
    }
}
