package SimpleFactory;

public class Pizza {
    private int slices;

    public Pizza(int slices) {
        this.slices = slices;
    }

    public String toString(){
        return "Cantidad rebanadas: " + slices;
    }
}
