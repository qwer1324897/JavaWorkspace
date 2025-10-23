class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        int middle = left;
        for(; middle <= right ; middle++) {
            for(int i = 1 ; i <= middle ; i++) {
                if(middle%i == 0) {
                    count ++;
                }   
            }
            if(count%2 == 1) {
                middle = middle*-1 ;     
            } 
            answer += middle;
        }
        
        
        return answer;
    }
}
