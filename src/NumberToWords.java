public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int originalNumber = number;
        number = reverse(number);

        int lastDigit;

        while (number > 0) {
             lastDigit = number % 10;

             switch (lastDigit) {
                 case 0:
                     System.out.print("Zero");
                     break;
                 case 1:
                     System.out.print("One");
                     break;
                 case 2:
                     System.out.print("Two");
                     break;
                 case 3:
                     System.out.print("Three");
                     break;
                 case 4:
                     System.out.print("Four");
                     break;
                 case 5:
                     System.out.print("Five");
                     break;
                 case 6:
                     System.out.print("Six");
                     break;
                 case 7:
                     System.out.print("Seven");
                     break;
                 case 8:
                     System.out.print("Eight");
                     break;
                 case 9:
                     System.out.print("Nine");
                     break;
                 default:
                     System.out.print("Error");
                     break;
             }
            System.out.print(" ");

             number /= 10;
        }

        if (getDigitCount(originalNumber) != getDigitCount(reverse(originalNumber))) {
            while ((originalNumber % 10) == 0) {
                System.out.print("Zero ");
                originalNumber /= 10;
            }
        }

        if (originalNumber == 0) {
            System.out.println("Zero");
        }

        System.out.println("");
    }

    public static int reverse(int number) {

        int reversedNumber = 0;
        boolean negativeNumber = false;

        if (number < 0) {
            number *= -1;
            negativeNumber = true;
        }

        while (number > 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }

        if (negativeNumber) {
            reversedNumber *= -1;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int countDigit = 0;
        do {
            countDigit++;
            number /= 10;
        } while (number > 0);

        return countDigit;
    }
}
