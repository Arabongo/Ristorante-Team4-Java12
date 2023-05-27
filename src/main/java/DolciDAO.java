import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DolciDAO {
    public void createDolci (Dolci dolce) throws SQLException {
        String quary = "INSERT INTO DOLCI(NAME, PRICE, INGREDIENTS, IS_GLUTEN_FREE)" +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, dolce.getName());
        statement.setDouble(2, dolce.getPrice());
        statement.setString(3, dolce.getIngredients().toString());
        statement.setBoolean(4, dolce.isGlutenFree());

        statement.executeUpdate();
        statement.close();
    }
}
