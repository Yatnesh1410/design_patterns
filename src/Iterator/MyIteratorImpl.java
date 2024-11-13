package Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> users = new ArrayList<>();
    private Integer size = 0;
    private Integer position = 0;
    public MyIteratorImpl(List<User> users) {
        this.users = users;
        this.size = users.size();
        position = 0;
    }

    @Override
    public Boolean hasNext() {
        return position < size;
    }

    @Override
    public Object next() {
        User user = (User) this.users.get(position);
        position = position + 1;
        return user;
    }
}
