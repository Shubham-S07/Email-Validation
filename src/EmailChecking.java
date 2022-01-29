import java.util.Scanner;
import java.util.regex.Pattern; 
 
public class EmailChecking 
{ 
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
        
        Pattern p = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return p.matcher(email).matches(); 
    } 
 
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
    	System.out.println("Enter Email Address: \n");
    	String email1 = sc.next();
    	System.out.println("Enter Email Address: \n");
        String email2 = sc.next();
        System.out.println("Enter Email Address: \n");
        String email3 = sc.next();
        String[] emails= {email1,email2,email3};
        
     for (int i = 0; i < emails.length; i++) {
         String email=emails[i];
         if (isValid(email)) 
         System.out.print(email+" is valid email"); 
         else
         System.out.print(email+" is invalid email"); 
         System.out.println();
        }
    } 
} 