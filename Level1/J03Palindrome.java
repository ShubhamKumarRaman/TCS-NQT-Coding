public class J03Palindrome {
    public static boolean palindrome(int num) {
        int n = num;
        int revnum = 0;
        while (n != 0) {
            revnum = revnum * 10 + n % 10;
            n /= 10;
        }
        return (num == revnum);
    }

    public static void main(String args[]) {
        System.out.println(palindrome(121));
        System.out.println(palindrome(123));
        System.out.println(palindrome(1));
    }
}
