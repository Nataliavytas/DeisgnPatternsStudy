package FactoryMethod;

public class Pizza {

    private int slices;
    private String specialty;

    public Pizza(int slices, String specialty) {
        this.slices = slices;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "slices=" + slices +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
