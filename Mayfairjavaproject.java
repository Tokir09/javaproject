
import java.lang.*;
import java.util.Scanner;


abstract class rides{
	
abstract public void mechfailure();
	
}

class amusement extends rides{
	String name;
	int age;
	
	
	int rideinput;
	
	Scanner sc =new Scanner(System.in);
	class InvalidInputException extends ArithmeticException{
		InvalidInputException(String Message){
			super(Message);
			
			
		}
		
	}
	
	static {System.out.println("Welcome To Mayfair..!!");
	
	System.out.println();
	
	
	}
	
	 public void ride(int a) {
		 												//using  this keyword ,which is used to store adrres of current obj 
		 												//non static global variable rideinput store object ,
		 												//replacing the default value with the value of a...
		 this.rideinput=a;
		try { 
			
			if (rideinput>=1 && rideinput<=5) {
		 switch(a) {
		 
		 case 1:		System.out.println("Welcome to Rollercoster ride");
		 break;
		 
		 case 2:		System.out.println("Welcome to 360 ride");
		 break;															//
		 
		 case 3:		System.out.println("Welcome to pendulum ride");
		 break;
		 
		 case 4:		System.out.println("Welcome to Bumper ride");
		 break;
		 
		 case 5:		System.out.println("Welcome to marygoround ride");

		 break;
		 
		 }
		 
		 System.out.println("Please enter your Age");
		 int b= sc.nextInt();
		 Age(b);    //  age is non static method and ride is also nonstatic method so we call call 2 ways directly and with he help of this keyword
		 }
			
		 else {
			throw new InvalidInputException("Enter valid input");
			
		 }
		}
		catch(Exception e) {
			System.out.println("Enter valid input");
			int b=sc.nextInt();
			ride(b);
		}
		 
	 }
	 public void Age( int n) {
	 
		 this.age=n;
	 
	try { if (age<=0 || age>100 ) {
		 
		 throw new InvalidInputException("Invalid Age Input");
		
	 }

	 else  if (age>= 12 && age< 18) {
			 
		 System.out.println(" You are eligible for this ride & ticket for Per person is 200rs"+"\n"+"...paid");
		
	 }
		 else if(age>=18 && age<=40) {
		 
		 System.out.println(" You are eligible for this ride & ticket for Per person is 300rs"+"\n"+"...paid");
	 }
	 
	 else if(age>40) {
		 
		 System.out.println(" You are eligible for this ride"+"\n"+" tickets for Senior Citezens Per person is 100rs"+"\n"+"...paid");
	 }
	 
	 else {
		 System.out.println("\n"+"You can choose from these AMAZING KIDS RIDE");
		 
		 
		 System.out.println("Press 3 for Bumper cars Or Press 4 for marygoround ");
		 
		 	int y= sc.nextInt();
		 	
		 	// calling the method
		 	
		 	Kidsride(y);
		
	 }	 	 
	 
	 }
	catch(Exception e){
		System.out.println("Please Enter valid age");
		int f=sc.nextInt();
		Age(f);
	}
	}
	 
	 
	 void Kidsride(int c){
	
		 if(c==3) {
			 System.out.println("Please pay 150 rs for Bumper car ticket " + "\n" + "paid");
			 
		 }
		 else 
		 { System.out.println("Please pay 150 rs for marygoround ticket "+ "\n" +"paid");
					 
		 }

		 
	 }
	 
	 //
	 
	static void options(String a){	
		
		
		System.out.println("Hello ..! "+ a +" We wish you a great day ");
		System.out.println(" ");
	
				
		 System.out.println("PLEASE CHOOSE FROM THE RIDES BELOW "); 
		 System.out.println();
		 
		 System.out.println("Enter 1 for Rollercoster");
		 System.out.println("Enter 2 for 360  ride");
		 System.out.println("Enter 3 for Pendulum ride");
		 System.out.println("Enter 4 for Bumper cars");
		 System.out.println("Enter"
		 		+ " 5 for Marygoround");
			
	
	}
	 
	
	 //implenation of abstract method by using overriding
	
	@Override
	
	public void mechfailure() {
		
System.out.println("Before enjoying the ride, please wait a moment while,our engineers are solving the problem ");

//present loading ... for 3 lines
	
int n=5;
for(int i=1;i<=n;i++) {
	
		for(int j=1;j<=n;j++) {
			if(i+j<=n+1){
			System.out.print("*");
			
		}else {
			System.out.print("");
		}
		
			
		}
			
		System.out.println( );
	}
			
	System.out.println("Enjoy the Ride..!!"	+"\n"+"5.4.3.2.1..goooo");
	
	System.out.println(" ");
	
	System.out.println("\r\n"
			+ "█████████████████████████████████████████████████████████████████████████\r\n"
			+ "█▄─▄▄▀█─▄▄─█▄─▄███▄─▄███▄─▄▄─█▄─▄▄▀███─▄▄▄─█─▄▄─█─▄▄▄▄█─▄─▄─█▄─▄▄─█▄─▄▄▀█\r\n"
			+ "██─▄─▄█─██─██─██▀██─██▀██─▄█▀██─▄─▄███─███▀█─██─█▄▄▄▄─███─████─▄█▀██─▄─▄█\r\n"
			+ "▀▄▄▀▄▄▀▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▀▄▄▀▀▀▄▄▄▄▄▀▄▄▄▄▀▄▄▄▄▄▀▀▄▄▄▀▀▄▄▄▄▄▀▄▄▀▄▄▀"
			+ "");
	
	System.out.println(" ");
	
	
	}

}



class shops {
	
	Scanner  sc = new Scanner (System.in);
	
	//CLASSES CAN BE NESTED
	
	class InvalidInputException  extends ArithmeticException{
	
		InvalidInputException(String Message) {
		super(Message);
						}
		
	}

	
	shops()		{
		
		
	}
	
/*creating a custom exception by creation a class  named
 *  as InvalidInputException and extending class with an exception hierarchy
 *  creating constructor with 1parameterized constructor
 *  and in if block using throw followed by 
 *  new keyword and custom exception	*/
	
	
	
	shops(int a){
		
	 try{
		 if(a==0 ||a<0||a>4) {
	 
	 
			throw new InvalidInputException("Invalidinput");
		
	 
		
		 }
		 else if(a>=1 && a<=3) {
			 System.out.print("your order is coke,");
			 System.out.println(""
				 		+ "	 		        ...       \r\n"
				 		+ "	 		       .!.!.      \r\n"
				 		+ "	 		        ; :       \r\n"
				 		+ "	 		       ;   :      \r\n"
				 		+ "	 		      ;_____:     \r\n"
				 		+ "	 		      !     !  	  \r\n"
				 		+ "	 		      !coca !     \r\n"
				 		+ "	 		      :~cola!     \r\n"
				 		+ "	 		      :     ;     \r\n"
				 		+ "	 		      .'   '.     \r\n"
				 		+ "	 		      :     :     \r\n"
				 		+ "	 		       '''''      \r\n"
				 		);
			 
		 }
		
	}catch(Exception e) {
		
		System.out.println("invalid input ");
		
		System.out.println("please enter a valid input");
		
		 int input=sc.nextInt();       /* Above and below statement taking input to call 1parametrised 
		 								consrtuctor 
		 						        and making him enter valid input again	*/ 
		
		
		 new shops(input);
		 
		 									/* instance created to call 1par constr
											this anonymous instance can be used only */	 
	}
	

	
}
	shops(int a,int b){
		
		this(a);
		System.out.print(" & popcorn");
		System.out.println();
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀"
				+ ""
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢠⣤⣤⣴⠿⢿⣿⣿⣿⣿⣆⣠⣤⣤⡀⢀⣀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⣴⡆⢸⣿⡟⢡⣴⡀⠻⠿⠿⣿⣿⣿⣿⣿⣇⣈⣉⡁⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⣠⣤⣄⡈⠛⣿⣿⣿⣇⣤⣶⡆⢸⣿⣿⣿⡟⢋⣙⣻⡟⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⢿⣿⣿⣿⣄⣼⣿⣿⣿⣿⣿⣷⣾⡟⢡⣤⣤⣾⣿⣿⣶⡶⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⢀⣉⣉⣙⡛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠚⠛⠛⢛⣋⣉⣉⡀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠘⣿⣿⣿⣿⡀⢸⣿⣿⣿⡇⢸⣿⣿⣿⡇⢀⣿⣿⣿⣿⠃⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⢿⣿⣿⣿⡇⠸⠛⠋⣉⣁⣈⣉⠙⠛⠇⢸⣿⣿⣿⡿⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⢸⣿⣿⣿⠃⣰⣾⣿⣿⣿⣿⣿⣿⣷⣆⠘⣿⣿⣿⡇⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⣿⣿⣿⡀⢻⣿⣿⣿⣿⣿⣿⣿⣿⡟⢀⣿⣿⣿⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢹⣿⣿⣷⠀⣈⡉⠛⠛⠛⠛⢉⣁⠀⣾⣿⣿⡏⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⡄⢹⣿⣿⡇⢸⣿⣿⡏⢠⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⡇⢸⣿⣿⡇⢸⣿⣿⡇⢸⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⡇⢸⣿⣿⡇⢸⣿⣿⡇⢸⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠈⠉⠉⠁⠈⠉⠉⠁⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println();
	}
	
	shops(int a,int b,int c){
		
		this(a,b);
		System.out.println(" &  2 snicker bars");
		System.out.println();
		System.out.print(" "
				+ ""
				+ ""
				+ "   __________________,.............,    \r\n"
				+ "   /_/_/_/_/_/_/_/_/,-',  ,. -,-,--/|\r\n"
				+ "  /_/_/_/_/_/_/_/,-' //  /-| / /--/ /\r\n"
				+ " /_/_/_/_/_/_/,-' `-''--'  `' '--/ /\r\n"
				+ "/_/_/_/_/_/_,:................../ /\r\n"
				+ "|________,'                   |/\r\n"
				+ "         \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'");
		
	}
	public void order(int input) {
	try {
		if(input==1) {
			new shops(1);
		}
		else if(input==2) {
			new shops(2,2);
		}
		else if(input==3) {
			new shops(input,input,input);
		}
		
		else {
			System.out.println("Enter a valid input");
			throw new ArithmeticException();
			
		}
		
		}
		catch(ArithmeticException e) {
		
			int b=sc.nextInt();
			order(b);
		}
	
	}
	
}
	
class Mayfair extends amusement{

	public static void main(String[] args) {
 
	
		Mayfair m = new Mayfair();// this intancee helps us to access all non static methods further
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		
		
		String name=sc.nextLine();
		
		amusement.options(name);		// CALLING STATIC METHOD OPTIONS  WTH CLASSNAME	
		
	
		
		int rideinput= sc.nextInt();        
		
		m.ride(rideinput); 									//line 32
		
		System.out.println();
		
		
		
		rides r= new Mayfair(); 			//multi level inheritance ---upcasting
										  
		r.mechfailure();				// abst method overiding method calling statement //line 171
		
		
		
		
	System.out.println("Congratulations on your first ride.. "+ name +" !Would you like Some snacks or softdrinks..?");	
	
														//constructor overloading
	
	String p="Enter 1 for coke -- 50rs";
	
	String q="Enter 2 for popcorn and coke -- 150rs";
	
	System.out.println(" ");
	
	
	
	System.out.println(p +"\n" +q +"\n" +"Enter 3  for popcorn ,coke ,ice-cream and 2 snickers bars ---200rs ");
	
	
	
	shops s= new shops();
	
	int input=sc.nextInt();
	s.order(input);
	
	/*
	 * constructor chainning  for user input through if else ladder and this calling statement
	 *       
	
	 *   */

	
 System.out.println("Thank you " + name +"\n" + "we hope you had a great time with us .."+ "\n" 
 +"\n"+"Until then Hakuna Matata"+"\n"+"See you soon..");
	 
	 }
	 
	   
			

	
	}