1  import java.util.Scanner;
2  public class InputFromKeyboard{
3      public static void main(String args[]){
4          Scanner keyboard = new Scanner(System.in);
5          
6          System.out.println("What's your name?");
7          String strName = keyboard.nextLine();
8          System.out.println("How old are you?");
9          int iAge = keyboard.nextInt();
10         System.out.println("How tall are you (m)?");
11         double dHeight = keyboard.nextDouble();
12         
13         //similar to other data types
14         //nextByte(), nextShort(), nextLong()
15         //nextFloat(), nextBoolean()
16         
17         System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. "
18                            + "Your height is " + dHeight + ".");
19                            
20     }
21 }