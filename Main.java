import static java.lang.System.out;
import java.util.Scanner;
public class Main{
	static int[] input;
	static int tn1,tn2,tn3;
	static Scanner inputN = new Scanner(System.in);
	public static void UserInput()
	{	
		System.out.println("Enter the 1000<number<9999 : ");
		String ui = inputN.nextLine();
		for (int z=0;z<ui.length();z++) 
		{	     
			if(Character.isDigit(ui.charAt(z))==false)
			{	
				tn1++;
			    break;
			    }
			 }		 
			 if(tn1==0) 
			 {	
				int InputNumber = Integer.parseInt(ui);
				if((InputNumber>=1000)&&(InputNumber<=9999))
				{	
					input = Question.toArray(InputNumber);
				}
				else {out.println("ERROR");tn1++;}
			 }
			 else {out.println("ERROR");
		}
	}
	
	public static void main(String ... args)
	{	
		do
		{	tn1=0;tn3=0;
			out.println("chose one : (a)Random 1000 <= number <= 9999 (b)Exit");
			String ui = inputN.nextLine();
			switch (ui)
			{
			case "a":
			{
				int[] qu = Question.make();
				do
				{	tn1=0;
					UserInput();
					if(tn1==0)
					{
						int[] AB = Ans.Check(qu, input);
						out.println(AB[0]+"A"+AB[1]+"B");
						if(AB[0]==4)
						{break;}
					}
				}while(tn3==0);
				break;
			}
			case "b":{tn2++;out.println("bye bye");break;}
			default:out.println("ERROR");
			}
		}while(tn2==0);
	}
}