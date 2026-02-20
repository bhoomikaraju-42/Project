

public class armtring {
    public static void main(String args[]) {
        int n=153;

        int og = n;
        int count = 0;
        int sum = 0;

      
        while (n > 0) {
            count++;
            n = n / 10;
        }

        n = og;   

        while (n > 0) {
            int d = n % 10;
            sum += (int)Math.pow(d, count);
            n = n / 10;
        }

        if (sum == og) {
            System.out.println("Yes, Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}
