/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    public void newMsg(String newText){
        this.message = newText;
    }
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀   ****************************
//             *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***
//             *** ~  -------------------- ~ ***
//             *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***
//             ********************     ***
//                                 *******
//                                   ***
//                                  ** ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
    /*
     * Prints Ascii speech bubble commented above with message within it
     */
    public void display() {
        System.out.println("               **************************** ");
        System.out.println("             *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***");
        //System.out.println("             *** ~  -------------------- ~ ***");
        if (this.message.length() <= 31) {
            System.out.print("             *");
            int space =  31 - this.message.length();
            for (int i = 0; i < space/2; i++ ){
                System.out.print(" ");
            }
            System.out.print(this.message);
            for (int i = 0; i < space/2; i++ ){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        else {
            System.out.print("             ");
            System.out.println(this.message);
        }
        System.out.println("             *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***");
        System.out.println("             ********************     ***");
        System.out.println("                                 *******");
        System.out.println("                                   ***");
        System.out.println("                                  **");
        
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
        myBanner.newMsg("This test text is longer than 31 characters");
        myBanner.display();
    }
}
