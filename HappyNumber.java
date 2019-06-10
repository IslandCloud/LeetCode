public class HappyNumber{

    // https://leetcode.com/problems/happy-number/description/

    private boolean isHappy(int n){
        int slow = n, fast = n;
        do{
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        }while(slow != fast);

        return slow == 1;
    }

    private int digitSquareSum(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }

        return sum;
    }

}
