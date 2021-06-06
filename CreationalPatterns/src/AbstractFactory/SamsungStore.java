package AbstractFactory;

public class SamsungStore implements IAbstractFactory{

    @Override
    public IComputer createComputer() {
        return new SamsungQX410();
    }

    @Override
    public ITablet createTablet() {
        return new SamsungTabS3();
    }
}
