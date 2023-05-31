import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SecondiPiattiDAO {

    public void createSecondiPiatti (SecondiPiatti secondiPiatti) throws SQLException {
        String quary = "INSERT INTO SECONDI_PIATTI(NAME, PRICE, INGREDIENTS, IS_SPICY)" +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, secondiPiatti.getName());
        statement.setDouble(2, secondiPiatti.getPrice());
        statement.setString(3, secondiPiatti.getIngredients().toString());
        statement.setBoolean(4, secondiPiatti.isSpicy());

        statement.executeUpdate();
        statement.close();
    }
    public SecondiPiatti retrieveSecondiPiatti(SecondiPiatti secondoPiatto) throws SQLException {
        String query = "SELECT NAME, PRICE, INGREDIENTI, IS_SPICY FROM SECONDI_PIATTI WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, secondoPiatto.getName());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("NAME");
            Double price = resultSet.getDouble("PRICE");
            Boolean is_Spicy = resultSet.getBoolean("IS_SPICY");
            SecondiPiatti selectedDish = new SecondiPiatti(secondoPiatto.getName(), price, secondoPiatto.getIngredients(), is_Spicy, secondoPiatto.isCanBeDishOfTheDay(), secondoPiatto.getTipoMenuEnum());
            return selectedDish;
        }
        return null;
    }
    public void updateSecondiPiatti (SecondiPiatti secondoPiatto) throws SQLException {
        String query = "UPDATE SECONDI_PIATTI SET PRICE = ?, INGREDIENTI = ?, IS_SPICY = ? WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setDouble(1, secondoPiatto.getPrice());
        statement.setString(2, secondoPiatto.getIngredients().toString());
        statement.setBoolean(3, secondoPiatto.isSpicy());
        statement.setString(4, secondoPiatto.getName());

        statement.executeUpdate();
        statement.close();
    }
    public void deleteSecondiPiatti(String name) throws SQLException {
        String query = "DELETE FROM SECONDI_PIATTI WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, name);

        statement.executeUpdate();
        statement.close();
    }
}