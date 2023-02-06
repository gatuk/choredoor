import java.util.Scanner;
public class CodeGymLevel2 {
//package en.codegym.task.pro.task02.task0201;
/*
lesson3, "I'm here about the job..."
*/
    public static void main(String[] args) {
        //write your code here
        int intValue = 10;
        int numericValue = 20;
        int size = 30;
        int number = 40;

//
//package en.codegym.task.pro.task02.task0202;
/*
lesson4, Feature-length film
*/
        int centimeters = 243;
        int meters = 0; //write your code here
        meters =centimeters/100;
        System.out.println(meters);
    
//
//package en.codegym.task.pro.task02.task0203;
/*
lesson4, Last digit of a number
*/
        int number1 = 546;
        int lastDigit = number1 % 10;
        System.out.println(lastDigit);
    
//
//package en.codegym.task.pro.task02.task0204;
/*
lesson4, 9 is an inverted 6
*/

        int six = 6;
        //write your code here
        six++;
        six++;
        six++;
        System.out.println(six);

//
//package en.codegym.task.pro.task02.task0205;
/*
lesson4, Once there were 32 teeth
*/

        int toothCounter = 32;
        //write your code here
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        System.out.println(toothCounter);

//
//package en.codegym.task.pro.task02.task0206;
/*
lesson 5, "It's me again about the job..."
 */

        //write your code here
        String word= "The";
        String phrase = "quick";
        String line="brown";
        String text="fox";

//
//package en.codegym.task.pro.task02.task0207;
/*
lesson6, The logo is everything
*/

        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";
        String tagline = s3 + s1 + s2; //write your code here
        System.out.println(tagline);

//
//package en.codegym.task.pro.task02.task0208;
/*
lesson6, Emptiness and spaces
*/

        String emptiness = "emptiness";
        String fullness = emptiness + " " + emptiness + " " + emptiness ; //write your code here
        System.out.println(fullness);

//
//package en.codegym.task.pro.task02.task0209;
/*
lesson6, Concatenation of strings and numbers
*/
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = (x+y) + "" + z ; //write your code here
        System.out.println(digits);

//
//package en.codegym.task.pro.task02.task0210;
/*
lesson6, Bigger every time
*/
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount) ; //write your code here

        System.out.println(hugeAmount);

//
//package en.codegym.task.pro.task02.task0211;
/*
lesson6, Getting the length of a string
*/

        String emptyString = "";

        //write your code here
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());

//
//package en.codegym.task.pro.task02.task0213;
/*
lesson6, Sprucing up your resume
*/

        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //write your code here
        System.out.println("RESUME".toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: " + career).toLowerCase());

//package en.codegym.task.pro.task02.task0212;
/*
lesson6, Don't you raise your voice at me!
*/

        String caps = "if I type in uppercase, ";
        String usa = "usa";

        //write your code here
        System.out.println(usa.toUpperCase());
        System.out.println("Winnie the Pooh".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());

//
//package en.codegym.task.pro.task02.task0214;
//import java.util.Scanner;
/*
lesson8, Reading and converting strings
*/
        //write your code here
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        String c = console.nextLine();
        System.out.println(c);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());

//
//package en.codegym.task.pro.task02.task0215;
//import java.util.Scanner;
/*
lesson8, Reading numbers
*/
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int arithmeticMean = (n1 + n2 + n3) / 3;
        System.out.println(arithmeticMean);

    }
}












