//import java.lang.*;
//package Circle1;
// class Circle
class Circle
{
    public double radius;

    public double area()
    //public double perimeter();
    {
        return (Math.PI*radius*radius);
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }

}
class Circle1
{
    public static void main(String[] args)
    {
        Circle c1=new Circle();
        c1.radius=7;
        System.out.println("area"+c1.area());
        System.out.println("perimeter"+c1.perimeter());
        System.out.println("circumference"+c1.circumference());
    }
}
