package string;

public class stringMethods 
{

	public static void main(String[] args) 
	{
	    //STRING DECLARATION
		
	/*	String name ="rahul";
		System.out.println(name);
	*/	
		//CONCATENATE STRINGS
		
	/*	String name = "tony";
		String lastName = "stark";
		String fullName = name +" "+ lastName;   //concatinate
		System.out.println(fullName);
    */
		//STRING LENGTH
		
	/*	String fullName = "TONY STARK";
		//System.out.println(fullName.length());  //length size printed
		
		//CHARAT
		
		for(int i=0;i<fullName.length();i++)
		{
			System.out.println(fullName.charAt(i));  //character of string printed
			                                        //spaces also counted
		}
	*/
		
		//COMPARE TO
		
		//name < name1 --> -ve value
		//name = name1 --> 0
		//name > name1 --> +ve value
		
		//String name = "tony";  //decide by first char of string according to alphabate order A to Z
		//String name1 = "tony"; //Ex.char 'a' and 'b' --> in A to Z 'b'comes after 'a'
		                       //hence result--> 'b'>'a'
		
	/*	if(name.compareTo(name1) == 0)  //this method always prefer
		{
			System.out.println("Strings are equals");
		}
		else
		{
			System.out.println("strings are not equal");
		}
	*/
	/*	if(name == name1)  //this method not appllicable for some cases
		{
			System.out.println("Strings are equals");
		}
		else
		{
			System.out.println("strings are not equal");
		}
	*/
	
	
	/*	if(new String("Tony") == new String("Tony"))  //shows different output
		{
			System.out.println("Strings are equals");
		}
		else
		{
			System.out.println("strings are not equal");
		}
	*/
		
		//SUBSTRING
		
	/*	String fullName = "TONY STARK";  //INDEXING--> 0 1 2 3 4 5 6 7 8 9
		                                 //            T O N Y   S T A R K
		
		String name = fullName.substring(0, 3);  //shows char till endIndex-1
		System.out.println(name);
	*/
		
		//UPPERCASE
		
	/*	String name="tony";
		System.out.println(name.toUpperCase());
	*/
		//LOWERCASE
		
	/*	String name="TONY";
		System.out.println(name.toLowerCase());
	*/
		//STARTS WITH
		
	/*	//String name="Tony Stark";
	  
		System.out.println(name.startsWith("Ton"));
	*/
		//ENDS WITH
	
	/*	String name="Tony Stark";
		System.out.println(name.endsWith("ark"));
	*/
		//EQUALS & EQUALS IGNORE
		
	/*	String a="Tony";
		String b="TONY";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
	*/
	/*	String name="TONY STARK";
		//String result=name.trim();
		System.out.println(name.trim());
		System.out.println(name.length());
	*/	
		//CONVERT STRING INTO ARRAY
		
	/*	String a="rahul";
		char b[]=new char[a.length()];
		System.out.print("array b[]=[");
		
		for(int i=0;i<a.length();i++)
		{
			 b[i]=a.charAt(i);
			System.out.print(b[i]+" ");
		}
		System.out.print("]");  //array b[]=[r a h u l]
	*/
		
	/*	String a="rahul patil";
		String b="";
		char x;
		for(int i=0;i<a.length();i++)
		{
			 x=a.charAt(i);
			 b=x+b;
		}
		System.out.print(b);  //litap luhar
	*/
		
		String a="rahul patil";
		String b="";
		char x;
		a.split(b);
		System.out.println(a);
		System.out.println(b);
	}

}
