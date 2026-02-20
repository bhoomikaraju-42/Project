class happy {
 public static boolean isHappy(int n) {
 while (n != 1 && n != 4) {
 int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 19;

        if (isHappy(n))
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}
