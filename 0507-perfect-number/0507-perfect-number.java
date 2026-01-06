class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0, i = 1;
        for(i = 1; i<=num/2; i++){
            if (num%i==0)
            sum += i;
        }
        if (sum == num){
            return true;
        }
        return false;
        
        
    }
}