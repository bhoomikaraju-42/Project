public class cap {
    public static void main(String args[]) {

        int n = 45;
        int p = n * n;
        int div = 10;
        boolean isKaprekar = false;

        while (div < p) {

            int right = p % div;
            int left = p / div;

            if (right + left == n) {
                isKaprekar = true;
                break;
            }

            div *= 10;
        }

        if (isKaprekar)
            System.out.println("Yes, it is Kaprekar");
        else
            System.out.println("Not Kaprekar");
    }
}
 