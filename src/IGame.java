public interface IGame {
    void addObserverToGame(AbstractUser user);
    void addPlayerToGame(AbstractUser user);
    boolean reportMoveToServer(AbstractUser user, DicesScore dicesScore);
    void reportMoveFromServer(AbstractUser user, DicesScore dicesScore);
}
