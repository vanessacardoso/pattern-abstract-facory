package factories;

import aircrafts.Airplane;
import aircrafts.IAircraft;
import landvehcicles.Car;
import landvehcicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
