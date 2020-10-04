public class FizzBuzz {
    public String fizzBuzz(int numbwer){
        if (numbwer % 15 == 0) {
            return "fizzbuzz";
        } else if (numbwer % 5 == 0) {
            return "buzz";
        } else if (numbwer % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(numbwer);
    }
}


