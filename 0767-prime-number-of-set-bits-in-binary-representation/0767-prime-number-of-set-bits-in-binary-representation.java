class Solution {
    private static final HashSet<Integer> primes = new HashSet<>();
        static{
            primes.add(2);
            primes.add(3);
            primes.add(5);
            primes.add(7);
            primes.add(11);
            primes.add(13);
            primes.add(17);
            primes.add(19);
            primes.add(23);
            primes.add(29);
            primes.add(31);
        }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int num = left;num <= right; num++){
            int setBits = Integer.bitCount(num);
            if(primes.contains(setBits)){
                count++;
            }
        }
        return count;
    }
}