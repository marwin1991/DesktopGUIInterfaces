import java.util.List;

public interface Server {
    boolean registerClient(String nick, GamesTableEventHandler gamesTableEventHandler);
    ServerGame createGame(GameConfigDTO gameConfigDTO, GameEventHandler gameEventHandler, UserType userType);
    ServerGame joinGame(GameDTO gameDTO, GameEventHandler gameEventHandler, UserType userType);
    List<GameDTO> getGames();
}
