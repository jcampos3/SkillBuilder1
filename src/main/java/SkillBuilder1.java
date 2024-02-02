import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO : Replace this comment with your code
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String username = input.nextLine();
        System.out.println("Enter a floating-point number:");
        double userfloatingpoint = input.nextDouble();

        double spiceResult = (4.0/3.0)*Math.pow(2.0,(Math.sqrt(5.0)/Math.pow(userfloatingpoint,3)));


        System.out.println("Well " + username + ", the spice value resulted in "+ spiceResult);
        String spiceFormat = String.format("%.2f",spiceResult);

        System.out.println("And the converted value is " + spiceFormat);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area


        double userarea = (wallWidth * wallHeight);
        System.out.println("Wall area: "+(int) userarea+" square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double usergallons = (userarea / squareFeetPerGallons);
        String gallons = String.format("%.2f",usergallons);
        System.out.println("Paint needed: "+gallons+" gallons");

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        int leftover = (int)((usergallons % 1) + 0.99);
        System.out.println("Cans needed: "+((int)(usergallons) + leftover)+" can(s)");

    }
}
