public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (goal > 0) {
            if (bigCount > 0 && goal >= 5) {
                bigCount -= 1;
                goal -= 5;
                continue;
            } else if (smallCount > 0 && smallCount >= goal) {
                goal -= smallCount;
                continue;
            }
            return false;
        }

        if (goal <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
