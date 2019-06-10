public class PrimeNumberOfSetBitsInBinaryRepresentation{

    // https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/

    private boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    private int countPrimeSetBits(int L, int R){
//        Set<Integer> primes = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19,23));
        int number = 0;
        for(int i = L; i <= R; i++){
            if(isPrime(Integer.bitCount(i))){
                number++;
            }
        }

        return number;
    }

}
