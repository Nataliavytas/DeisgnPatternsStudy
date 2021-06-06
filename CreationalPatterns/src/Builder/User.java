package Builder;

public class User {

    // User class has a lot of attributes. If you override the constructor for each possibility, you can end up
    // having a lot of complex constructors with a lot of parameters.

    private String name;
    private String lastName;

    private String email;
    private String phone;
    private String address;

    private User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static User Make(String name, String lastName){
        return new User(name, lastName);
    }

    public User Build(){
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User setAddress(String address) {
        this.address = address;
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
}
