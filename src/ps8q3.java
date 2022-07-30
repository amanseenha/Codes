class square{
    float length, area,perimeter;
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
    }
}
