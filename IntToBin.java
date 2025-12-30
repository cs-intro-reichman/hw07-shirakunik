/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    /** Returns the binary representation of the given integer, as a string of 0's and 1's.  */
    public static String toBinary(int x) {

        String bin = "";

        if (x == 0) return bin + 0;
        if (x == 1) return bin + 1;

           else{
            if ( (x % 2) == 0) {
             bin = toBinary(x/2) + 0;
            }
            if ( (x % 2) != 0) {
            bin = toBinary((x-1)/2) + 1; 
            } 
                }
       
        return bin;   
        } 
 }
