package BuilderPattern.user;

public class Demo {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder().setUserId("UUID1").setEmail("xyz").setUsername("XYZ").build();
        System.out.println(u1.toString());

        User u2 = new User.UserBuilder().setEmail("abc").build();
        System.out.println(u2.toString());
    }
}
