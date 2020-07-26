package epam_project_12.Lambda_and_stream;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
class Slist
{
    public List<String> list;
	Slist(List<String> list)
	{
		this.list = list;
	}
    public List<Object> lists(List<String> list,int n)
    {
        List<Object> temp = list.stream() .filter(x -> x.length()==3) .collect(Collectors.toList());
        List<Object> required = temp.stream().filter( s -> ((String) s).startsWith("a") ).collect(Collectors.toList());
        return required;
    }
}
public class String_list
{
    public static void main(String args[])
    {
        List<String> list=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int no=sc.nextInt();
        System.out.println("Enter the strings:");
        while(no>0)
        {
            String str=sc.next();
            list.add(str);
            no=no-1;
        }
        Slist l=new Slist(list);
        List<Object> required=l.lists(list,no);
        System.out.print("Strings that are of length 3 and starts with 'A': ");
        System.out.print(required);
    }
}
