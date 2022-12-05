package fabric;

public class LuxFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new LuxCar();
    }
}

