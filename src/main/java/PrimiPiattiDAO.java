import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrimiPiattiDAO {
    public void insertPrimiPiatti (PrimiPiatti primiPiatti) throws SQLException {
        String quary = "INSERT INTO PRIMIPIATTI(NAME, PRICE, INGREDIENTI, DISH_OF_THE_DAY)" +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, primiPiatti.getName());
        statement.setDouble(2, primiPiatti.getPrice());
        statement.setString(3, primiPiatti.getIngredients().toString());
        statement.setBoolean(4, primiPiatti.isCanBeDishOfTheDay());

        statement.executeUpdate();
        statement.close();
    }
}