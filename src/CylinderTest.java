class Cylinder {
    public double radius;
    public double height;

    public double lidarea() {
        return Math.PI * radius * radius;
    }

    public double TotalSurfaceArea() {
        return 2 * lidarea() + circumference() * height;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double volume() {
        return lidarea() * height;
    }
}

public class CylinderTest
{
    public static void main(String[] args) {
        {
            Cylinder c=new Cylinder();
            c.radius=7;
            c.height=10;
            System.out.println("lidarea" + c.lidarea());
            System.out.println("total area"+ c.TotalSurfaceArea());
            System.out.println("volume" + c.volume());
        }
    }
}
