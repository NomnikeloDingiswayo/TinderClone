import java.util.Scanner;

public class TinderApp{

    public static void main(final String[] args){
        Scanner input = new Scanner(System.in);

        //new Profile("Name", 20, "male", "Cape Town", "I love cats and evrything hiking");
        //Database userData = new Database();
        TinderSwipe swipe;
        
        //userData.readCSV();

        System.out.println("Please enter your gender preference: ");
        String pref = input.nextLine();
        
        //swipe.setPreference(pref);
        System.out.println("Looking up profiles for you:");
        swipe = new TinderSwipe(pref);
        
        String ans; Profile potential;
        
        do{
            System.out.println("What do you think of - Choose:(R)ight - yes/ (L)eft - no/ (Q)uit) ");
            potential = swipe.getNext();
            System.out.println(potential);
            ans = input.nextLine();
            
            if (ans.equals("R"))
                swipe.right(); 
//                userData.writeCSV(potential);
                
            else if (ans.equals("L")){
                continue;
            }
        }while (!ans.equals("Q"));
        System.out.println("See you soon!");
        input.close();   
        
    }
 }