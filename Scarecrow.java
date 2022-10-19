/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
import java.util.Scanner;

class Scarecrow {

    /* Parts of the Scarecrow
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Constructor*/
    public Scarecrow(Pumpkin pumpkin, Shirt shirt, Pants pants, Boot leftBoot, Boot rightBoot, Banner speech, String text) {
        head = pumpkin;
        body = shirt;
        legs = pants;
        leftFoot = leftBoot;
        rightFoot = rightBoot;
        sign = speech;
        message = text;
        speech.newMsg(message);
        
    }

    /* Displays the Scarecrow 
     * TODO: call the .display() method of each part... 
     *       ...in the right order!
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        System.out.print("        ");
        leftFoot.display();
        System.out.print(" ");
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        // TODO: Don't forget to update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(),new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new Banner(""), new String("USERINPUT"));

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        if (args.length > 0) {
            myScarecrow.message = args[0];
        }

        myScarecrow.display();
    }

}
