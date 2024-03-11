import java.util.*;
class data
{
	Set<String>Set  =new TreeSet<String>();
	Set<String>Set01=new TreeSet<String>();
	Set<String>Set02=new TreeSet<String>();
	Set<String>Set03=new TreeSet<String>();
	Set<String>Set04=new TreeSet<String>();
	Scanner z= new Scanner(System.in);

	void getdata(int num)
	{
		String a;
		System.out.println("Enter the Element");
		for (int i=1;i<=num;i++)
		{
			a=z.nextLine();
			Set.add(a);
			System.out.println("Element Added succesfuly");
			if(i!=num)
				{
					System.out.println("Eneter next Element");
				}
		}
	}

	void getdata01(int num)
	{
		String a;
		System.out.println("Enter the Element");
		for (int i=1;i<=num;i++)
		{
			a=z.nextLine();
			Set01.add(a);
			System.out.println("Element Added succesfuly");
			if(i!=num)
				{
					System.out.println("Eneter next Element");
				}
		}
	}


	void delete(int num)
	{
		String element;
		System.out.println("Enter element");
		
		for(int i=1;i<=num;i++)
		{
			element=z.nextLine();
			if(Set.contains(element)== true)
			{
				Set.remove(element);
				System.out.println("Element Removed succesfuly");
				if(i!=num)
				{
					System.out.println("Eneter next Element");
				}
			}
			else 
			{
				System.out.println("Element Not Exist In Set 01");
				if(i!=num)
				{
					System.out.println("Eneter next Element");
				}
			}
		}
	}


	void delete01(int num)
	{
		String element;
		System.out.println("Enter element");
		
		for(int i=1;i<=num;i++)
		{
			element=z.nextLine();
			if(Set01.contains(element)== true)
			{
				Set01.remove(element);
				System.out.println("Element Removed succesfuly");
				if(i!=num)
				{
					System.out.println("Eneter next Element");
				}
			}
			else 
			{
				System.out.println("Element Not Exist In Set 02");
				if(i!=num)
				{
					System.out.println("Eneter next Element");
				}
			}
		}
	}



	void checkElement(String element)
	{
		if(Set.contains(element)== true)
		{
			System.out.println(element + " Is Present In Set 01");
		}
		else
		{
			System.out.println(element + " Is Not Present In Set 01");	
		}


		if(Set01.contains(element)== true)
		{
			System.out.println(element + " Is Present In Set 02");
		}
		else
		{
			System.out.println(element + " Is Not Present In Set 02");	
		}
	}

	void checkSize()
	{
		System.out.println("size of set 1 - " +Set.size());
		System.out.println("size of set 2 - " +Set01.size());
	}

	
	void display()
	{
		System.out.println("Set 01"+Set);
		System.out.println("Set 02"+Set01);
	}
	void union()
	{
		Set02.addAll(Set);
		Set02.addAll(Set01);
		System.out.println("union -"+Set02);
	}
	void intersection()
	{
		Set03.addAll(Set);
		Set03.retainAll(Set01);
		System.out.println(" intersection - "+Set03);	
	}
	void difference()
	{
	         Set03.addAll(Set);
		Set03.retainAll(Set01);
		Set04.removeAll(Set03);
		System.out.println(" Difference - "+Set04);
	}
	void subset()
	{
		
		if(Set.isEmpty()==false && Set01.isEmpty()==false)
			{
				if(Set.containsAll(Set01)==true)
				{  
					System.out.println("Set 01 is Subset of Set 02");
				}
				if(Set01.containsAll(Set)==true)
				{					
					System.out.println("Set 02 is Subset of Set 01");
				}
				if(Set.containsAll(Set01)==false && Set01.containsAll(Set)==false)
				{
					System.out.println("Subset Not Exist");
				}

			}
		else if(Set.isEmpty()==true)
		{
			System.out.println("Set 01 is empty");
		}
		if(Set01.isEmpty()==true) 
		{
			System.out.println("Set 02 is empty");
		}	
	}

}


class set
{
	public static void main(String ab[])
	{
		int ch,num,ch2;
		String ans="y";
		String element;
		data x=new data();
		Scanner z=new Scanner(System.in);
		Scanner zz=new Scanner(System.in);

		do
		{
			System.out.println("Enter a choice");
			System.out.println("1. add element");
			System.out.println("2. remove element");
			System.out.println("3. check element");
			System.out.println("4. check size");
			System.out.println("5. display set");
			System.out.println("6. union");
			System.out.println("7. intersection");
			System.out.println("8. difference");
			System.out.println("9. Subset");
			ch=z.nextInt();

			switch(ch)
			{
				 case 1: System.out.println("1. for Set 01");
				 		 System.out.println("2. for Set 02");
				 		 ch2=z.nextInt();

					 		 switch(ch2)
					 		 {
					 		 	 case 1: System.out.println("Enter how much element want to add");
					 		 			 num=z.nextInt();
					 		 	 		 x.getdata(num);
					 		 	 		 break;

					 		 	 case 2: System.out.println("Enter how much element want to add");
					 		 			 num=z.nextInt();
					 		 	 		 x.getdata01(num);
					 		 	 		 break;

					 		 	 default: System.out.println("Wrong input");		 
	 		 
					 		 }
					 	 break;
					 	 
				case 2:  System.out.println("1. for Set 01");
				 		 System.out.println("2. for Set 02");
				 		 ch2=z.nextInt();

					 		 switch(ch2)
					 		 {
					 		 	 case 1: System.out.println("Enter how much element want to remove");
					 		 			 num=z.nextInt();
					 		 	 		 x.delete(num);
					 		 	 		 break;

					 		 	 case 2: System.out.println("Enter how much element want to remove");
					 		 			 num=z.nextInt();
					 		 	 		 x.delete01(num);
					 		 	 		 break;

					 		 	 default: System.out.println("Wrong input");		 
	 		 
					 		 }
					 	 break;	

				case 3:  System.out.println("Enter the element");
				 		 element=zz.nextLine();
                         x.checkElement(element);
					 	 break;

				case 4: 
					 	x.checkSize();
					 	break;
	 	 		
				case 5: x.display();
						break;

				case 6: x.union();
						break;

				case 7: x.intersection();
						break;	

				case 8: x.difference();
						break;	

				case 9: x.subset();
						break;						

	 	 		default: System.out.println("Wrong input");
			}
				System.out.println("Do you Want to continue y/n");
				ans=zz.nextLine();
		}
		while(ans.equals("y")||ans.equals("Y"));
	}
}