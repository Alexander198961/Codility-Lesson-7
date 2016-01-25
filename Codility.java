package test;

import java.util.ArrayList;
import java.util.List;

public class Codility {

	public void remove_nested_str(List<Character> ref)
	{
		int size=ref.size();
	
		for(int i=0;i<size-1;i++)
		{
			
			
			
			if (ref.get(i).compareTo('(') == 0 && ref.get(i+1).compareTo(')') == 0 )
			{
				
				ref.remove(i);
				ref.remove(i);
				size=ref.size();
				
			}
		
		}
		
	}
	public int test(String  str)
	{
		if(str.length() %2== 1)
		{
			return 0;
		}
		else if(str == null)
		{
			return 1;
		}
		
		char [] mychars= str.toCharArray();
		List<Character> mylist= new ArrayList<Character>();
		for(char c:mychars)
		{
			mylist.add(c);
		}
		int currentSize=0;

		do
		{
		
		 currentSize=mylist.size();
			
		
		
		
		remove_nested_str(mylist);

		System.out.println("List size="+mylist.size());
		if(mylist.size()  == 0)
		{
			return 1;
		}
		}
		while(mylist.size()<currentSize );

		return 0;
		
	}
	public static void main(String []args)
	{
		Codility mycode =new Codility();
		mycode.test("(()())");
		
	}
	
}
