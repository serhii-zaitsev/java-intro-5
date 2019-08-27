package lesson03.a_inheritanve.b_composition;

public abstract class Car {

    private String manufactures;
    private int produceYear;
    private Color color;

    private Engine engine;

    public Car(String manufactures, int produceYear, Color color, Engine engine) {
        this.manufactures = manufactures;
        this.produceYear = produceYear;
        this.color = color;
        this.engine = engine;
    }

    public Car(String manufactures, int produceYear, Color color) {
        this.manufactures = manufactures;
        this.produceYear = produceYear;
        this.color = color;
    }

    abstract String getType();

    public void gas()
        {
            engine.startEngine();
            System.out.println(getType() + " started to move");
        }

    public void stop()
        {
            engine.stopEngine();
            System.out.println(getType() + " started to stop");
            System.out.println(getType() + " stoped");
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (produceYear != car.produceYear) return false;
        if (manufactures != null ? !manufactures.equals(car.manufactures) : car.manufactures != null) return false;
        if (color != car.color) return false;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    @Override
    public int hashCode() {
        int result = manufactures != null ? manufactures.hashCode() : 0;
        result = 31 * result + produceYear;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactures='" + manufactures + '\'' +
                ", produceYear=" + produceYear +
                ", color=" + color +
                '}';
    }
}
