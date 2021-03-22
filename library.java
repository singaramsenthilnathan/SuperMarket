public class Library{
int annualFees=50;
boolean lendbooks=true;
float salary=18000.0f;


public static void main(String[]args)
{
Library librarian = new Library();
System.out.println(librarian.annualFees);
System.out.println(librarian.lendbooks);
System.out.println(librarian.salary);
librarian.maintain_books();
librarian.collect_fees();

}
public void maintain_books()
{
	//Method Body
	System.out.println("arrange books");
System.out.println("Maintining Books Area");
}
public void collect_fees()
{
	if(annualFees!=50)
	{
	System.out.println("Fees  paid");
	}
	else
	{
		System.out.println("Not paid");
		
}
	
}
}

























