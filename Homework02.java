// Alessia Leonardini
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		double money = 0;
		
		System.out.println("Welcome to Kindness Quest!  Let's begin!\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// "~" added for decoration
		
		// This is the first decision a user can make
		System.out.println("You're walking down the street.  Suddenly, a cat approaches you.  Do you "
				+ "A. Ignore it, or B. Pet it? (Enter A or B)");
		
		// By entering A or B, the user chooses a different outcome
		String response = key.next();
		
		if(response.equalsIgnoreCase("A"))
		{
			System.out.println("You decide to keep walking.  You see a elderly woman trying to cross the street."
					+ " \nDo you A. cross the street with her to help, or B. ignore her and keep walking?"
					+ "  (Enter A or B)");
			
			response = key.next();
			
			if(response.equalsIgnoreCase("A"))
			{
				System.out.println("You decide to help her.  At the end of the cross walk, she thanks you "
						+ "and hands you a $50 bill.");
				
				money = 50;
				// Ending 1
				// This completes the first decision, making this the first ending
			}
			else if(response.equalsIgnoreCase("B"))
			{
				money = 0;
				// Ending 2
			}
		}
		else if(response.equalsIgnoreCase("B"))
		{
			System.out.println("You decide to pet the cat.  You notice that the cat's stomach is growling,"
					+ " meaning it is hungry. \nDo you A. Give the cat half of a sandwich from your bag,"
					+ " or B. go to the store and buy food for it?");
			
			response = key.next();
			
			if(response.equalsIgnoreCase("A"))
			{
				System.out.println("You decide to give the cat the sandwich from your bag, placing it in a cat bowl"
						+ "you found on the sidewalk.  Under the cat bowl was $60, which you take to keep. "
						+ "You notice that the cat has fleas, and wonder if it should have an home with an owner."
						+ "Do you A. bring it to an animal shelter, or B. let it stay as a stray?");
				response = key.next();
				
				if(response.equalsIgnoreCase("A"))
				{
					System.out.println("You bring the cat to a local animal shelter.  The vet working there give you 2 options, "
							+ "you can A. keep the cat for yourself, or B. give to the shelter for it to be adopted."
							+ "Which do you choose?");
					
					response = key.next();
					
					if(response.equalsIgnoreCase("A"))
					{
						System.out.println("You decide to keep the cat for yourself, and the vet give you $120 for your efforts.");
						
						money = 180;
						//Ending 4 
					}
					else if(response.equalsIgnoreCase("B"))
					{
						System.out.println("You decide to give the cat to the shelter.  The vet gives you $70 for your generosity.");
						
						money = 130;
						//Ending 5
					}
				}
				else if(response.equalsIgnoreCase("B"))
				{
					System.out.println("You decide to leave the cat a stray, and continue your walk.");
					
					money = 60;
					//Ending 3
				}
			}
			else if(response.equalsIgnoreCase("B"))
			{
				System.out.println("You decide to go to the store to buy fish for the cat.  "
						+ "/nWhile looking for the fish eisle, you notice that a woman dropped a wad of cash."
						+ "/nDo you A. ignore it or B. tell her she dropped her money?");
				
				response = key.next();
				
				if(response.equalsIgnoreCase("A"))
				{
					System.out.println("You decide to ignore the woman's cash, and head to the register with the fish."
							+ "The cashier asks you why you are buying a fish.  /nAfter telling him that you are givng it"
							+ "to a stray cat, he gives the fish for free and hands you $150 for your kindness. "
							+ "/nYou return to the cat, putting the fish in a nearby cat bowl on the sidewalk."
							+ "/nDo you A. check under the bowl, or B. dont check?");
					
					response = key.next();
					if(response.equalsIgnoreCase("A"))
					{
						System.out.println("You find $60 under the bowl.");
						
						money = 210;
						//Ending 6
					}
					else if(response.equalsIgnoreCase("B"))
					{
						money = 150;
						//Ending 7
					}
				}
				else if(response.equalsIgnoreCase("B"))
				{
					System.out.println("You tell the woman that she dropped her cash.  She thanks you very much, "
							+ "and tells you that you deserve to keep the money.  \nYou count the total cash to be "
							+ "$80, then head to the register with the fish. The cashier asks you why you are buying a fish.  "
							+ "After telling him that you are givng it to a stray cat, he gives the fish for free and hands "
							+ "you $150 for your kindness. /nYou return to the cat, putting the fish in a nearby cat bowl on the sidewalk."
							+ "Do you A. check under the bowl, or B. dont check?");
					
					response = key.next();
					
					if(response.equalsIgnoreCase("A"))
					{
						System.out.println("You find $60 under the bowl.");
						
						money = 290;
						//Ending 8
					}
					else if(response.equalsIgnoreCase("B"))
					{
						money = 230;
						//Ending 9
					}
				}

			}
		}
		// These determine which prize the user receives based on money earned
		String prize = "";
		
		if(money > 0 && money <= 50)
		{
			prize = "a box of chocolates";
		}
		
		else if(money > 50 && money <= 100)
		{
			prize = "new sneakers";
		}
		else if(money > 100 && money <= 150)
		{
			prize = "a free spa day";
		}
		else if(money > 150 && money <= 200)
		{
			prize = "a real gold necklace";
		}
		else if (money > 200 && money <= 250)
		{
			prize = "airpods";
		}
		else
		{
			prize = "an IPhone";
		}
	
		// This displays the final messages, displaying money and prize won
		if(money > 0)
		{
			System.out.println("Your Quest has ended. Congrats!! You earned $" + money +"!!!");
			System.out.println("With this money, you win "+ prize +"!!!");
			

		}
		else
		{
			System.out.println("Thank you for playing!  \nUnfortunately, you didn't earn any money,"
					+ " so you cannot win any prizes. Try again!");
		}
		
		
		

	

}
}
