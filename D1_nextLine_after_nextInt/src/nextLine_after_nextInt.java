/*
Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!
Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/

import java.util.Scanner;

public class nextLine_after_nextInt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();					// Since nextDouble() does not consume the newline character, we need to call nextLine() to consume it before reading the string input.
        String s = scan.nextLine();
        
        /*
         	Method-2:
         	reading the complete line for the integer and converting it to an integer:
         	
        		int age = Integer.parseInt(sc.nextLine());
        		String fatherName = sc.nextLine();
        		String motherName = sc.nextLine();
        	
        	Although this method is not applicable for input String after Byte character
        	(Byte.parseByte(sc.nextLine()). 
        	Previous method is applicable in that case.
        */
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}
