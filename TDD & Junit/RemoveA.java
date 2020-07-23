import java.util.*;
public class RemoveA
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 ReturnString obj=new ReturnString();
	 String s=sc.next();
	 String result=obj.find(s);
	 System.out.println("The Obtained string : "+result);
	}
}