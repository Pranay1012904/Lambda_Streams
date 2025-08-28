package Stream_Api_Prac_5;

public class EEnum {
                          enum Color{
        RED,
        GREEN,
        BLUE
    }
    public static Color k;

    public static void main(String[] args) {
        Color c=Color.RED;
        System.out.println(c);
        k=Color.BLUE;
    }
}
