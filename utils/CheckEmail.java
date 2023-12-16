package utils;

public class CheckEmail {
    
    public static Boolean checkMail(String email){
        String RegexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if(email.matches(RegexEmail)){
            return true;
        }
        else{
            return false;
        }
    }
}
