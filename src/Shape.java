public interface Shape {
    /*
    100 % abstraction
     */

    int area = 0;
    double calculateArea();

    public static double areaOfNoShape() {
        return 0.0;
    }

}
