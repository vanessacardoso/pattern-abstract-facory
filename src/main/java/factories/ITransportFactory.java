package factories;

import aircrafts.IAircraft;
import landvehcicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
