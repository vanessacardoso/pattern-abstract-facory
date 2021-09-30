package app;

import aircrafts.IAircraft;
import factories.ITransportFactory;
import landvehcicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.starRoute();
    }

}
