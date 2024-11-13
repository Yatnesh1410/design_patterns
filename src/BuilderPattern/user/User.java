package BuilderPattern.user;

public class User {
    private final String userID;
    private final String  userName;
    private final String email;

    private User(UserBuilder userBuilder) {
        userID = userBuilder.userId;
        userName = userBuilder.username;
        email = userBuilder.email;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static class UserBuilder{
        private String userId;
        private String username;
        private String email;

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
