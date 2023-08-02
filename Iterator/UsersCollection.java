package Iterator;

public interface UsersCollection {
    public void addUsers(User u);
    public void removeUsers(User u);
    public UsersIterator getIterator();

}
