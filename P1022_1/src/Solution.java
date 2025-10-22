
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        So so = new So();

        System.out.println(so.solution(15));
        
    }
}


class So {

    public int solution(int n) {
        int ans = 0;
        while(n!=0){
            if(n%2==0) {
                n/=2; 
            }
            else{
                n--; 
                ans++;
            }
        }
        return ans;
    }
    
}
