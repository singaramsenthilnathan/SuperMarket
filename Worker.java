public class Worker implements OfficeRules
{
public int salary = 40000;

public static void main(String[]args)
{
Worker w = new Worker(); 
w.eightHoursDuty();
w.travel();
//w.fine=10;
System.out.println(w.fine);
}
public void eightHoursDuty()
{
System.out.println("8");
}
public void applyLeave()
{
System.out.println("Leave");
}
public void travel()
{
System.out.println("Travelling");

}

}