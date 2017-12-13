import java.util.List;

public interface ITabelModel {
    void refreshTabel(List<IGame> games);
    void requireTabelRefres();
    boolean registerGame(IGame game);
}
