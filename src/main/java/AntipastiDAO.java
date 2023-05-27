import enumerati.IngredientsEnum;
import enumerati.TipoPortataEnum;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

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

    public Antipasti retriveAntipasti(Antipasti antipasto) throws SQLException {
        String query = "SELECT NAME, PRICE, INGREDIENTI, PORZIONI, LOCAL_PRODUCT FROM ANTIPASTI WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, antipasto.getName());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Double price = resultSet.getDouble("PRICE");
            Integer porzioni = resultSet.getInt("PORZIONI");
            Boolean prodotto_locale = resultSet.getBoolean("LOCAL_PRODUCT");
            Antipasti selectedDish = new Antipasti(antipasto.getName(), price, antipasto.getIngredients(), false, porzioni, prodotto_locale, antipasto.getTipoMenuEnum());
            return selectedDish;
        }
        return null;
    }

    public void updateAntipasti (Antipasti antipasto) throws SQLException {
        String query = "UPDATE ANTIPASTI SET PRICE = ?, INGREDIENTI = ?, PORZIONI = ?, LOCAL_PRODUCT = ? WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setDouble(1, antipasto.getPrice());
        statement.setString(2, antipasto.getIngredients().toString());
        statement.setInt(3, antipasto.getPortions());
        statement.setBoolean(4, antipasto.getLocalProduct());
        statement.setString(5, antipasto.getName());

        statement.executeUpdate();
        statement.close();
    }

    public void deleteAntipasti(String name) throws SQLException {
        String query = "DELETE FROM ANTIPASTI WHERE NAME = ?";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(query);
        statement.setString(1, name);

        statement.executeUpdate();
        statement.close();
    }
}
