import java.util.Scanner;
class square{
    float area,perimeter;
    public void getArea(float length){
        area = length * length;
        System.out.println("The area of given Square is: " + area);
    }
    public void getPerimeter(int length){
        perimeter = 4 * ( length );
        System.out.println("The perimeter of given Square is: " + perimeter);
    }
}
class rectangle{
    float recLength, recBreadth;
    public float getArea(){
        return recLength*recBreadth;
    }
    public float getPerimeter(){
        return 2*(recLength+recBreadth);
    }
}
class circle{
    public float area(float radius){
        return 3.14f * radius * radius;
    }
    public float perimeter(float radius){
        return 2*3.14f*radius;
    }
}
public class ps8q3 {
    public static void main(String[] args) {

        square SquareOne = new square();
        SquareOne.getArea(4);
        SquareOne.getPerimeter(2);

        System.out.println();

        rectangle RectangleOne = new rectangle();
        RectangleOne.recLength = 12.5f;
        RectangleOne.recBreadth = 6.0f;
        System.out.println("The area of given Rectangle is: " +RectangleOne.getArea());
        System.out.println("The perimeter of given Rectangle is: " +RectangleOne.getPerimeter());

        System.out.println();

        circle CircleOne = new circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = input.nextFloat();
        System.out.println("The area of given Circle is: " +CircleOne.area(radius));
        System.out.println("The perimeter of given Circle is: "+CircleOne.perimeter(radius));
    }
}
