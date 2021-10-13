//package rectangletest;
class Rectangle {
    public double length;
    public double breadth;
    //public boolean isSquare;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length==breadth;

    }
}
    public class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        r.length=10.5;
        r.breadth=10.5;
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        System.out.println("It is a square"+ r.isSquare());
    }
}
