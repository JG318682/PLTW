
public class SciFiName   
{
    public static void main()
    {
        
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this method (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        
        
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        
        
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();


        // generate a sciFi name
        Math.random();
        int r = (int)Math.random() * relativeName1.length() + 1;
        String relative1 = relativeName1.substring(r);
        
        int e = (int)Math.random() * relativeName2.length();
        String relative2 = relativeName2.substring(e);
        
        String sciFirstName1;
        String sciFirstName2;
        String sciLastName1;
        String sciLastName2;

        
        sciFirstName1 = firstName.substring(0, 2);
        sciFirstName2 = lastName.substring(0, 1);
        sciLastName1 = city.substring(0, 1);
        sciLastName2 = school.substring(0, 2);
        
        
        System.out.println("Welcome " + sciFirstName1 + sciFirstName2 + " " + sciLastName1 + sciLastName2 + " of " + relative1 + relative2);
    }
}
