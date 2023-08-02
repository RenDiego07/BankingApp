package Iterator;
import java.util.LinkedList;
public class UsersListP implements UsersCollection{
    public LinkedList<User>  listUsers;
    public UsersListP(){
        listUsers = new LinkedList<>();
    }
    // Agregar nuevos clientes que acaban de registrarse en el banco
    @Override
    public void addUsers(User e) {
        if(e != null) {
            if (e.HighProfileUser()) {
                listUsers.add(e);
            }
        }
    }
    // en el caso de que el cliente haya cancelado su cuenta
    @Override
    public void removeUsers(User e) {
        if(e != null){
            listUsers.remove(e);
        }
    }

    @Override
    public UsersIterator getIterator() {
        return new UsersHighIt(listUsers);
    }
}
