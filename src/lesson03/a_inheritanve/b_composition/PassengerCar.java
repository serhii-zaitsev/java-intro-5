package lesson03.a_inheritanve.b_composition;

public class PassengerCar extends Car {

    public PassengerCar(String manufactures, int produceYear, Color color) {
        super(manufactures, produceYear, color);
    }

    @Override
    String getType() {
        return "Passenger Car";
    }

    public PassengerCar(String manufactures, int produceYear, Color color, Engine engine) {
        super(manufactures, produceYear, color, engine);
    }
}
