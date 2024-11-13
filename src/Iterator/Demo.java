package Iterator;

public class Demo {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("Yatnesh","1"));
        userManagement.addUser(new User("Mukul", "2"));
        userManagement.addUser(new User("Khushi", "3"));
        userManagement.addUser(new User("Aishu", "4"));

        MyIterator iterator = userManagement.getIterator();

        while(iterator.hasNext()){
            User user = (User) iterator.next();
            System.out.println(user.getName());
        }
    }
}
