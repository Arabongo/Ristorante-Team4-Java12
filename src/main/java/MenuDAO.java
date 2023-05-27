import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.stream.Stream;

public class MenuDAO {
    public void createMenu (Menu menu) throws SQLException {
        String quary = "INSERT INTO MENU(NAME, PRICE, INGREDIENTI, TIPO_PORTATA)" +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement statement = ConnectionProvider.getInstance().prepareStatement(quary);
        for (Portata portata : menu.getPortataList()) {
            statement.setString(1, portata.getName());
            statement.setDouble(2, portata.getPrice());
            statement.setString(3, portata.getIngredients().toString());
            statement.setString(4, portata.getTipoPiattoEnum().name());
            statement.executeUpdate();

        }
        statement.close();
    }
}
