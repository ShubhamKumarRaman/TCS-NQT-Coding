public class J02ReverseNumber {
    public static int reverseNumber(int num) {
        int revnum = 0;
        int n = num;
        while (n > 0) {
            revnum = revnum * 10 + (n % 10);
            n /= 10;
        }
        return revnum;
    }

    public static void main(String args[]) {
        System.out.println(reverseNumber(123));
        System.out.println(reverseNumber(100));
        System.out.println(reverseNumber(1001));
    }
}
