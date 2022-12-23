public class Main {
    private static boolean primeNumber(int number){
        // your code here
        for(int i=2; i <= number/2; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println(primeNumber(11)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(18)); // false
        System.out.println(primeNumber(35)); // false
    }

}
