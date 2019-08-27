package lesson03.a_inheritanve.c_interfaces;

public enum Color {
    RED("red"),
    GREEN("green"),
    BLUE("blue");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
