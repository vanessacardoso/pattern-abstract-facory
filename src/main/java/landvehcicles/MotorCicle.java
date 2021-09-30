package landvehcicles;

public class MotorCicle implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Estamos iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda");
    }
}
