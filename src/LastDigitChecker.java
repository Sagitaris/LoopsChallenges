public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }

        if ((firstNumber % 10) == (secondNumber % 10)) {
            return true;
        } else if ((firstNumber % 10) == (thirdNumber % 10)) {
            return true;
        } else if ((secondNumber % 10) == (thirdNumber % 10)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {

        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
