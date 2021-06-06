package Builder;

public class ComplexUser {

    // User class has a lot of attributes. If you override the constructor for each possibility, you can end up
    // having a lot of complex constructors with a lot of parameters.

    private String name;
    private String lastName;

    private boolean isReachable;

    private String email;
    private String phone;
    private String address;

    private ComplexUser(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        isReachable = false;
    }

    public BuilderUser setReachable(boolean reachable) {
        if(!reachable){
            throw new IllegalArgumentException("Not possible to assign a false value to isReachable");
        }
        this.isReachable = reachable;
        return new BuilderUser(this);
    }

    public static ComplexUser Make(String name, String lastName){
        return new ComplexUser(name, lastName);
    }

    public ComplexUser Build(){
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class BuilderUser{

        private ComplexUser user;

        public BuilderUser(ComplexUser user){
            this.user = user;
        }

        public BuilderUser setEmail(String email) {
            user.email = email;
            return this;
        }

        public BuilderUser setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public BuilderUser setAddress(String address) {
            user.address = address;
            return this;
        }

        public ComplexUser Build(){
            return user;
        }
    }
}
