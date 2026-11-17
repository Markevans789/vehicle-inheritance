import com.pluralsight.Hovercraft;
import com.pluralsight.SemiTruck;

public class main {
    public static void main (String[] args) {
        SemiTruck semiTruck = new SemiTruck();

        SemiTruck.setFuelCapacity(18);

        SemiTruck.setCargoCapacity(20);

        SemiTruck.setNumberOfPassengers(5);

        SemiTruck.Color("purple");

    }
}
