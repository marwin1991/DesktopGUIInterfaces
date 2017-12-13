public interface IGame {
    void addObserverToGame(AbstractUser user);

    void addPlayerToGame(AbstractUser user);

    void removePlayerFromGame(AbstractUser user);

    Dices rerollUserDices(AbstractUser user, Dices dices);

    void refreshGameStatus();
}
