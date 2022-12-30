class area{
    public static float squareArea(float SqLen){
        return SqLen*SqLen;
    }
    public static float rectangleArea(float RecLen, int RecBre){
        return RecLen*RecBre;
    }
    public static float circleArea(float radius){
        return 3.14f*radius*radius;
    }
}
class perimeter {
    public static float squarePerimeter(float SqLen) {
        return 4 * SqLen;
    }
    public static float recPerimeter(float RecLen, int RecBre) {
        return 2 * (RecLen + RecBre);
    }
    public static float circlePerimeter(float radius) {
        return 2 * 3.14f * radius;
    }
}
public class ps8q3{
    public static void main(String[] args) {
        System.out.println("Area of Square is: " + area.squareArea(10));
        System.out.println("Area of Rectangle is: " + area.rectangleArea(10,20));
        System.out.println("Area of Circle is: " + area.circleArea(5));
        System.out.println();
        System.out.println("Perimeter of Square is: " + perimeter.squarePerimeter(10));
        System.out.println("Perimeter of Rectangle is: " + perimeter.recPerimeter(10, 20));
        System.out.println("Perimeter of Circle is: " + perimeter.circlePerimeter(5));
    }
}