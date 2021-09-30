package factories;

import aircrafts.Helicopter;
import aircrafts.IAircraft;
import landvehcicles.ILandVehicle;
import landvehcicles.MotorCicle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new MotorCicle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
