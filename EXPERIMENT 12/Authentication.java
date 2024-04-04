import java.util.Scanner;
class InvalidUserException extends Exception
{
public InvalidUserException (String msg){
super(msg);
}
}
public class Authentication{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter username:");
String username=sc.nextLine();
System.out.println("Enter Password:");
String Password=sc.nextLine();

try{
if(username.length()<8)
{
throw new InvalidUserException("Invalid username!..User must be greater than 7 character");
}
else if (!Password.equals("abcd123"))
{
throw new InvalidUserException("Invalid password,Enter correct password!");
}
else
{
System.out.println("Login Successfull");
}
}
catch(InvalidUserException e)
{
e.printStackTrace();
}
}
}
