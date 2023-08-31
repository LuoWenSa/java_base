package study.enums;

public class Color {
    private final String color;

    public static final Color RED = new Color("RED");
    public static final Color BLUE = new Color("BLUE");
    public static final Color GREEN = new Color("GREEN");

    public Color(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
