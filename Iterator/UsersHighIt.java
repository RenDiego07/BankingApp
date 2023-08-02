package Iterator;
import java.util.List;
public class UsersHighIt implements UsersIterator {

    private List<User> list;
    private int index;
    public UsersHighIt(List<User> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        boolean vbool = false;
        searching:
        while(index<list.size()){
            User s = list.get(index);
            if(s.HighProfileUser()){
                vbool = true;
                break searching;
            }else{
                index++;
            }

        }
        return vbool;
    }

    @Override
    public User next() {
        if(hasNext()){
            return list.get(index);
        }else{
            return null;
        }

    }

}
