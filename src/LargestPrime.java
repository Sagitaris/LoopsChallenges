public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int largestPrime = 0;
        boolean prime = true;

        for (int i = number; i >= 0; i--) {
            prime = true;
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if(i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    largestPrime = i;
                    break;
                }
            }
        }

        return largestPrime;
    }
}
