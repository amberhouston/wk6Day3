
import java.util.Scanner;

class mainClass {
    public static void main(String args[]) {
        
        Scanner calc = new Scanner(System.in);
        int num1, num2;
        int math;
        calculator c1 = new calculator();
        

        System.out.println("Enter first num: ");
        num1 = calc.nextInt();
        System.out.println("which expression? 1: Addition, 2: Subtraction, 3: Multiply, 4: Divide, 5: Modulus, 6: Square ");
        math = calc.nextInt();
            if (math == 6){
                System.out.println("Answer: " + Math.pow(num1, 2) );
            }
        System.out.println("Enter second num: ");
        num2 = calc.nextInt();


            switch(math) {
                case 1:
                System.out.println("Answer: " + c1.add(num1, num2) );
                
                break;
                
                case 2:
                System.out.println("Answer: " + c1.subtract(num1, num2) );
                
                break;

                case 3:
                System.out.println("Answer: " + c1.multiply(num1, num2) );
                
                break;

                case 4:
                System.out.println("Answer: " + c1.divide(num1, num2) );
                
                break;

                case 5:
                System.out.println("Answer: " + c1.modulus(num1, num2) );
                
                break;

            }    
        
    }
}