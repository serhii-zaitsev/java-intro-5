package lesson03.a_inheritanve;

public class Truck extends Car {

    public Truck(String manufactures, int produceYear, Color color)
    {
        super(manufactures, produceYear, color);
    }

    @Override
    public String toString() {
        return "Truck{} extends + " + super.toString();
    }

    @Override
    String getType() {
        return "Truck";
    }
}
