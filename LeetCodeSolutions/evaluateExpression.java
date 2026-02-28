package LeetCodeSolutions;
class Evaluate {
    static int countWays(String s) {
        // code here
        int n = s.length();
        if(n == 1){
            return (s.charAt(0) == 'T') ? 1 : 0;
        }

        int count = 0;

        int i = 0;
        for(int k = 0; k<n-2; k+=2){
            boolean left = solve(s,i,k);
            boolean right = solve(s,k+2,n-1);

            if(s.charAt(k+1) == '&'){
                if(left && right) count++;
            }else if(s.charAt(k+1) == '|'){
                if(left || right) count++;
            }else{
                if(left && right == false || left == false && right) count++;
            }
        }

        return count;
    }

    static boolean solve(String s, int i, int j){
        if(i==j){
            return (s.charAt(i) == 'T') ? true : false;
        }

        for(int k = 0; k<=j-2; k+=2){
            boolean left = solve(s,i,k);
            boolean right = solve(s,k+2,j);

            if(s.charAt(k+1) == '&'){
                if(left && right) return true;;
            }else if(s.charAt(k+1) == '|'){
                if(left || right) return true;
            }else{
                if(left && right == false || left == false && right) return true;
            }
        }

        return false;
    }
}
class evaluateExpression {
    public static void main(String[] args) {
        Evaluate s1 = new Evaluate();
        System.out.println(s1.countWays("T^F|F"));
    }
}
