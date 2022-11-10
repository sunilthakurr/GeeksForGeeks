class Solution {
    static long jumpingNums(long X) {
        // code here
        // String str = Integer.toString(X);
        // char[] ch = str.toCharArray();
        long x = X;
        Queue<Long> queue = new LinkedList<>();
        for(long i = 1; i<=9; i++) {

 

            queue.add(i);

 

        }

 

        long res = 0;

 

        while(!queue.isEmpty()) {

 

            long num = queue.remove();

 

            if(num > x) {

 

                continue;

 

            }

 

            res = Math.max(res, num);

 

            long lastDigit = num % 10;

 

            if(lastDigit != 0) {

 

                long f = num * 10 + (lastDigit-1);

 

                queue.add(f);

 

            }

 

            if(lastDigit != 9) {

 

                long s = num * 10 + (lastDigit+1);

 

                queue.add(s);

 

            }

 

        }

 

 

 

        return res;
    }
};
