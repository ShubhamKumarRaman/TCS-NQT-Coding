public class J04Armstrong {
    public static boolean armStrong(int num) {
        int n = num;
        int arm = 0;
        int numberOfDigit = String.valueOf(num).length();
        while (n != 0) {
            int digit = n % 10;
            arm += Math.pow(digit, numberOfDigit);
            n /= 10;
        }
        return (arm == num);
    }

    public static void main(String args[]) {
        System.out.println(armStrong(153));
        System.out.println(armStrong(9474));
        System.out.println(armStrong(123));
    }
}