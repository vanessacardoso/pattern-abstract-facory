package aircrafts;

public class Helicopter implements IAircraft {
    @Override
    public void starRoute() {
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, ligando helices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, sudeste, ventos ok!");
    }
}
