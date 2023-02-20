class Solution {
    public int solution(int n) {
        int evenSum = 0;
        
        for(int i = 0 ; i< n ; i++) {
         if ((i + 1) % 2 == 0) {
                evenSum = evenSum + (i + 1);
            }
        }
        return evenSum;
    }
}