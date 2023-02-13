public class Main {

    public static void main(String[] args) {
	String politicalParty = "";
	String menu = "D - Democrat, R - Republican, I - Independent"; // menu to show what the valid options are
	if(politicalParty.equalsIgnoreCase("D")) // if politicalParty is d or D, the output below will display
        {
            System.out.println("You get a Democratic Donkey."); // output if user entered d or D
        }
    else if (politicalParty.equalsIgnoreCase("R")) // if politicalParty is r or R, the output below will display
        {
            System.out.println("You get a Republican Elephant."); // output if user entered r or R
        }
    else if (politicalParty.equalsIgnoreCase("I")) // if politicalParty is i or I, the output below will display
        {
            System.out.println("You get an Independent man."); // output if user entered i or I
        }
    else // entry other than D,R, or I was entered. Invalid entry
        {
            System.out.println("Your entry is invalid: " + politicalParty); // output tells user that an invalid input (anything other than D, R, I) was entered
        }

    }
}
