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
        System.out.print("               *");
        for (int j =0; j < this.message.length(); j++){
            System.out.print("*");
        }
        System.out.println("*");
        System.out.print("             **");
        for (int j =0; j<(this.message.length()+1); j++){
            System.out.print("~");
        }
        System.out.println("**");
        System.out.print("             *  ");
        System.out.print(this.message);
        System.out.println("  *");
        System.out.print("             **");
        for (int j =0; j<(this.message.length()+1); j++){
            System.out.print("~");
        }
        System.out.println("**");
        System.out.print("               *");
        for (int j =0; j < this.message.length(); j++){
            System.out.print("*");
        }
        System.out.println("*");
        System.out.print("              ");
        for (int j=0; j<(this.message.length()-5); j++){
            System.out.print(" ");
        }
        System.out.println("*****");
        System.out.print("              ");
        for (int j=0; j<(this.message.length()-4); j++){
            System.out.print(" ");
        }
        System.out.println("***");
        System.out.print("              ");
        for (int j=0; j<(this.message.length()-5); j++){
            System.out.print(" ");
        }
        System.out.println("**");
        
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
        myBanner.newMsg("This test text is longer than 31 characters");
        myBanner.display();
    }
}
