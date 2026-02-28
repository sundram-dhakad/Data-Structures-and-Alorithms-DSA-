package MathsPractice;

public class Logarithm {
    public static void main(String[] args) {
        System.out.printf("%.3f",calculateLog(2,20));

    }
    static double calculateLog(double base, int n){
        double log = 0.0;
        
        int start = 0;
        int end = n;
        
        while (start<=end){
            int mid = start + (end-start)/2;
            if (Math.pow(base,mid)==n){
                return mid;
            }
            if (Math.pow(base,mid)<n){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        log = end;
        double incr = 0.1;
        for (int i = 1; i <=3 ; i++) {
            while (Math.pow(base,log)<=n){
                log +=incr;
            }
            log -= incr;
            incr /= 10;
        }

        return log;

    }
}

