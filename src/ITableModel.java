import java.util.List;

public interface ITableModel {
    void refreshGames(List<IGame> games);

    List<IGame> viewAllGames();

    boolean registerGame(IGame game);
}
