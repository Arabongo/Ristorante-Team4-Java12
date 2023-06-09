import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrimiPiattiDAO {
    private static final String TABLE = "PRIMIPIATTI";
    private static final String PASTA_TYPE = "PASTA_TYPE";
    private static final String NAME = "NAME";
    private static final String PRICE = "PRICE";
    private static final String INGREDIENTI = "INGREDIENTI";
    private static final String DISH_OF_THE_DAY = "DISH_OF_THE_DAY";

    public void createPrimiPiatti(PrimiPiatti primiPiatti) throws SQLException {
        String quary = "INSERT INTO " + TABLE + "(" + PASTA_TYPE + ", " + NAME + ", " + PRICE + ", " + INGREDIENTI + "," + DISH_OF_THE_DAY + ")" +
                "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        statement.setString(1, primiPiatti.getPastaType());
        statement.setString(2, primiPiatti.getName());
        statement.setDouble(3, primiPiatti.getPrice());
        statement.setString(4, primiPiatti.getIngredients().toString());
        statement.setBoolean(5, primiPiatti.isCanBeDishOfTheDay());

        statement.executeUpdate();
        statement.close();
    }

    public PrimiPiatti retrievePrimiPiatti(PrimiPiatti primopiatto) throws SQLException {
        String query = "SELECT " + PASTA_TYPE + ", " + NAME + ", " + PRICE + ", " + INGREDIENTI + ", " + DISH_OF_THE_DAY + " FROM " + TABLE + " WHERE " + NAME + " = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, primopiatto.getName());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String nome = resultSet.getString(NAME);
            Double price = resultSet.getDouble(PRICE);
            String pasta_type = resultSet.getString(PASTA_TYPE);
            Boolean canBeDishOfTheDay = resultSet.getBoolean(DISH_OF_THE_DAY);
            PrimiPiatti selectedDish = new PrimiPiatti(nome, price, primopiatto.getIngredients(), pasta_type, canBeDishOfTheDay, primopiatto.getTipoMenuEnum());
            return selectedDish;
        }
        return null;
    }

    public void updatePrimiPiatti(PrimiPiatti primopiatto) throws SQLException {
        String query = "UPDATE PRIMIPIATTI SET " + PRICE + " = ?, " + INGREDIENTI + " = ?, " + PASTA_TYPE + " = ?, " + DISH_OF_THE_DAY + " = ? WHERE " + NAME + " = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setDouble(1, primopiatto.getPrice());
        statement.setString(2, primopiatto.getIngredients().toString());
        statement.setString(3, primopiatto.getPastaType());
        statement.setBoolean(4, primopiatto.isCanBeDishOfTheDay());
        statement.setString(5, primopiatto.getName());

        statement.executeUpdate();
        statement.close();
    }

    public void deletePrimiPiatti(String name) throws SQLException {
        String query = "DELETE FROM PRIMIPIATTI WHERE " + NAME + " = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, name);

        statement.executeUpdate();
        statement.close();

    }
}
