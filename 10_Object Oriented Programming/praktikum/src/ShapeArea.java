public class ShapeArea {
    public static double getSquareArea(int sideLength) {
        return sideLength * sideLength;
    }

    public static double getRectangleArea(int length, int width) {
        return length * width;
    }

    public static double getCircleArea(int radius) {
        double phi = 3.14;
        return phi * radius * radius;
    }

    public static double getTrapezoidArea(int base1, int base2, int height) {
        return 0.5 * (base1 + base2) * height;
    }
}
