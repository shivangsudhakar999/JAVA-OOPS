
class StudentTest
{
    public double rollno;
    public String name;
    public String course;
    public int m1,m2,m3;

    public double total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return total()/3;
    }
    public char grade()
    {
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String details()
    {
        return "ROLLNO" + rollno +"\n" +"Name"+ name+ "\n" +"Course" +course+"\n";
    }

}

public class StudentClass
{
    public static void main(String[] args)
    {
        StudentTest s= new StudentTest();
        s.rollno=1;
        s.name="john";
        s.course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;

        System.out.println("total"+s.total());
        System.out.println("average"+s.average());
        System.out.println("Details"+s.details());
    }
}
