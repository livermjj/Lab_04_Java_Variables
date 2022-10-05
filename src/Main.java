public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 3;
        int intSum = 10;
        int intProduct = 15;
        int intDifference = 17;
        int intQuotient = 25;
        int intModulo = 6;

        double doubleOperandA = 3.7;
        double doubleOperandB = 7.8;
        double doubleSum = 15.5;
        double doubleProduct = 17.5;
        double doubleDifference = 10.8;
        double doubleQuotient = 25.3;

        int numOfKids = 2;
        boolean isItRaining = false;
        double gasPrice = 3.75;
        int favNumber = 10;
        double shoeSize = 8.5;
        String birthMonth = "November";
        String fullName = "Justin Livermore";

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum using ints of  " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The difference using ints of  " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The product using ints of  " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of  " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of  " + intOperandA + " " + intOperandB + " is " + intModulo);
        System.out.println("The sum using doubles of  " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference using doubles of  " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product using doubles of  " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient using doubles of  " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
    }
}