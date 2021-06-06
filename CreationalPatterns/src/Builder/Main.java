package Builder;

public class Main {

    /**
     * Separate the construction of a complex object from its representation
     * so that the same construction process can create different representations.
     */
    public static void main(String[] args) {
        User cody = User.Make("Cody", "Jason").Build();
        System.out.println(cody);

        User nat = User.Make("Nati", "Vytas").setAddress("Tandil 124").setPhone("555488").Build();
        System.out.println(nat);

        ComplexUser nico = ComplexUser.Make("Nico", "Ara").setReachable(true).setEmail("Nico@mail.com").Build();
        System.out.println(nico);
    }
}
