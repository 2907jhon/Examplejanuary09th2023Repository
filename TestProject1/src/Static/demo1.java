package Static;
interface staff
{
	void showstaffName(String name);
}
interface sales
{
	void showsales(int salary);
}
interface dept
{
	void showDept(String name);
}
class office implements staff,sales,dept
{
 	public void showstaffName(String name)
{
	System.out.println("showstaffName:"+name);
}
public void showsales(int salary)
{
	System.out.println("showsales"+salary);
}
public void showDept(String name)
{
	System.out.println(name);
}

public class demo1 {

	public static void main(String[] args) {
		

	}

}
