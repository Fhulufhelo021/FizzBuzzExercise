public class FizzBuzz {
    public static String operation(int number){
        /* declaring and initializing variables*/
        int divisibleNum= number;

        /*setting conditions using if statement*/
        /*If both numbers are divisible by 6 and 8 return FizzBuzz*/
        if (number%6==0 && number%8==0) {
            return "FizzBuzz";

        /*if number is divisible by 8 program will return Fizz*/
        } else if (number %8==0) {
            return "Fizz";

        /*if number is divisible by 6 program will return Fizz*/
        }else if (number%6==0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            String messageOutput = String.valueOf(i) + " is " + operation(i);
            System.out.println(messageOutput);
        }
    }

}

