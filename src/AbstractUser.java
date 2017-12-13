public abstract class AbstractUser {
    private String nick;
    private boolean isRegistered;

    public abstract boolean registerUser(AbstractUser this);
}
