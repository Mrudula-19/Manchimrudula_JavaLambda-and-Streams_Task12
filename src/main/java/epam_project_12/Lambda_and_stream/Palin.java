package epam_project_12.Lambda_and_stream;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
class Pal
{
    public List<String> lst;
	Pal(List<String> lt)
	{
		this.lst = lt;
	}
    public List<String> b(List<String> list,int n)
    {
        List<String> p=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            String t = list.get(i).replaceAll("\\s+", "").toLowerCase();
            if(IntStream.range(0, t.length() / 2).noneMatch(j -> t.charAt(j) != t.charAt(t.length() - j - 1))==true)
            {
                p.add(t);
            }
        }
        return p;
    }
}
public class Palin
{
    public static void main(String args[])
    {
        List<String> lst=new ArrayList<String>();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no of strings........");
        int no=s.nextInt();
        System.out.println("Enter the Strings... ");
        int index=0;
        while(index<no)
        {
            String st=s.next();
            lst.add(st);
            index=index+1;
        }
        Pal arr=new Pal(lst);
        List<String> flst=arr.b(lst,no);
        System.out.print("Palindrome Strings are: ");
        System.out.print(flst);
    }
}

