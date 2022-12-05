package fabric;

public class DefFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new DefaultCar();
    }
}

