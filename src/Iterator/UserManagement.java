package Iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        this.users.add(user);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(this.users);
    }

}
