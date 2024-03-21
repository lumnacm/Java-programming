import java.util.*;
import java.util.Scanner;
class StringManipulation
{
public static void main(String args[])
{
//String using new operator
char chs[]={'W','E','L','C','O','M','E'};
String newStr=new String (chs);
System.out.println("New string from char[] using new string: "+newStr);
//String length
System.out.println("\n");
System.out.println("----STRING LENGTH----");
String s1="good";
String s2="morning";
System.out.println(" String of length of " + s1 + ":" +s1.length());

//To Uppercase & Lowercase
System.out.println(s1+ "toUppercase :" +s1.toUpperCase());
System.out.println(s1+ "toLowercase :" +s1.toLowerCase());

//String concatination
System.out.println("\n");
System.out.println("----STRING CONCATINATION----");
System.out.println("using concat(): " + s1.concat(s2));
System.out.println("using + operator: "+ s1 + s2);

//Character extraction
System.out.println("\n");
System.out.println("----CHARACTER EXTRACTION----");
System.out.println(" character at 2nd position " + s1.charAt(2));
char c[]=new char[5];
s2.getChars(2,4,c,0);
System.out.println("Character between 2 and 4: "+new String(c));
s1="morning";
s2="MORNING";
System.out.println(s1 + " Equals " + s2 + " : " + s1.equals(s2));
System.out.println(s1 + " EqualsIgnorecase "+ s2 + " : " + s1.equalsIgnoreCase(s2));
System.out.println(s1 + " Compare" + s2 + " : " + s1.compareTo(s2));
System.out.println(s1 + " ComparIgnorecase " + s2 + " : " + s1.compareToIgnoreCase(s2));
System.out.println(s1 + " start with m " + s2 + " : " + s2.startsWith("M"));
System.out.println(s1 + " end with g " + s2 + " : " + s1.endsWith("g"));
System.out.print("\n");
System.out.print("----SEARCH  SUB STRING----");
System.out.println("\n");
s1="How are you";
System.out.println(" Index of you in " + s1 + " : " + s1.indexOf("you"));
System.out.print("\n");
System.out.print("----MODIFY STRING----");
System.out.print("\n");
System.out.print(" substring of " + s1 + " : " + s1.substring(5));
System.out.print(" string replacing: " + s1.replace ("how are","hey"));
System.out.print("\n");
System.out.print("----USING valueOf()----");
System.out.print("\n");
float n=10.6f;
System.out.println(n+" is convereted to " + String.valueOf(n));
}
}
 
