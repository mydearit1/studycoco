class Solution {
    public int solution(String message) {
        int answer = 0;
        int i = 0;
        for(i=0; i<=message.length(); i++) {
            answer = i*2;
        }
        return answer;
    }
}