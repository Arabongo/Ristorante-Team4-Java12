import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AntipastiDAO {
    public void insertAntipasti (Antipasti antipasti) throws SQLException {
        String quary = "INSERT INTO ANTIPASTI(NAME, PRICE, INGREDIENTI, PORZIONI, LOCAL_PRODUCT)" +
                "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, antipasti.getName());
        statement.setDouble(2, antipasti.getPrice());
        statement.setString(3, antipasti.getIngredients().toString());
        statement.setInt(4, antipasti.getPortions());
        statement.setBoolean(5, antipasti.getLocalProduct());

        statement.executeUpdate();
        statement.close();
    }
}
