package epam_project_12.Lambda_and_stream;
import java.util.*;
import java.io.*;
import java.util.Arrays;
class Avvg
{
    public List<Integer> lt;
	Avvg(List<Integer> l)
	{
		this.lt = l;
	}
    public void sum(List<Integer> lt,int no)
    {
        int ele=lt.stream().mapToInt(i -> i).sum();
        System.out.print(ele/no);
    }
}
public class List_average
{
    public static void main(String args[])
    {
        List<Integer> lt = new ArrayList<Integer>();
        System.out.println("Enter no of array elements:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("Enter array elements: ");
        for(int i=1;i<=no;i++)
        {
            int m=sc.nextInt();
            lt.add(m);
        }
        Avvg a=new Avvg(lt);
        System.out.print("Average of array elements is: ");
        a.sum(lt,no);
    }
}
