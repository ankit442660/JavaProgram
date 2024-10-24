public class fabonacci {
        public static void main(String[] args) {
            int n = 10; // number of Fibonacci numbers to generate
            int firstNumber = 0;
            int secondNumber = 1;
    
            System.out.print(firstNumber + " " + secondNumber);
    
            for (int i = 2; i < n; i++) {
                int nextNumber = firstNumber + secondNumber;
                System.out.print(" " + nextNumber);
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }
    }
    
    

