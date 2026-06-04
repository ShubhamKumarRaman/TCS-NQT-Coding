
public class J01SumDigit {
    public static int sumOfDigit(int num) {
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String args[]) {
        int num = 564;
        System.out.println("Sum: "+sumOfDigit(num));
    }
}
