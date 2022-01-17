    import java.util.regex.*;    
    import java.util.*;    
    public class EmailValidation{  
        public static void main(String args[]){  
            ArrayList<String> emails = new ArrayList<String>();  
            emails.add("Shubhams1407@mphasis.com");  
            emails.add("Shubhams1407@mphasis.com");  
            emails.add("Shubhams1407.name@mphasis.com");  
            emails.add("Shubhams1407#@mphasis.com");  
            emails.add("Shubhams1407@mphasis.com");  
            emails.add("Shubhams1407@mphasis.com");   
            emails.add("@outlook.com");  
            emails.add("ShubhamS1407#mphasis.com");  
            String regex = "^(.+)@(.+)$";  
            Pattern pattern = Pattern.compile(regex);  
            for(String email : emails){  
                Matcher matcher = pattern.matcher(email);  
                System.out.println(email +" : "+ matcher.matches()+"\n");  
            }  
        }  
    }  