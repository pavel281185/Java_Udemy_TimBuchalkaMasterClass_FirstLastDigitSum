public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        if(number < 10){
            return 2*number;
        }
        int first = number % 10;
        while(number >= 10){
            number /= 10;
        }
        return first+number;
    }
}
