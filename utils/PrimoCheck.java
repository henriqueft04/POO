package utils;

public class PrimoCheck {

    public static Boolean isPrime(int number) {

        if (number <=1 ){
            return false;
        }
        for (int i = 2 ; i < number-1 ; i ++){
            if ( number % i == 0 ){
                return false;
            }
        }
        return true;
    }
    
}
