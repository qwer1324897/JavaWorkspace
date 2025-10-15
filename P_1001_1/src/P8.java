public class P8 {
    public static void main(String[] args) {
        
        // break, continue
        // 1~10 자연수 중 3의 배수는 제외하고 더해보자

        {
        int sum = 0;
        for(int i = 1 ; i <= 10 ; i++) {
            sum += i;
        }
            System.out.println(sum);
    }
        // 1~10까지 더하는 코드다. 여기에 3의 배수를 제외하는 조건으로 작성해보면
    
    {
        int sum = 0;
        for(int i = 1 ; i <= 10 ; i++) {
            if(i%3 != 0){
            sum += i;
            }
            System.out.println(sum);
        }
    }
        //이렇게도 짤 수 있지만

    {
        int sum = 0;
        for(int i = 1 ; i <= 10 ; i++) {
            if(i%3 == 0){
                continue;
            }
                sum += i;
            }
            System.out.println(sum);
    }
        // 이렇게 continue를 쓰는게 가독성이 훨씬 좋다.

        // 문제 난이도를 높여서, 1이상 자연수 중, 3의 배수는 제외하고 다 더 했을때, 더한 값이 500을 넘는 순간에 더하는 숫자는 몇일까?
    {

        int sum = 0;
        for(int i = 1 ; true ; i++) {  // 이러면 i는 계속 반복된다. 조건식이 항상 true이기 때문에
            if(i%3 == 0){
                continue;
            }
                sum += i;
                if(sum > 500) {
                    break;
                }
            }
            // System.out.println(i); 여기서 i값을 찍고 싶은데, for문은 for문이 끝나면 i값이 소멸하기 때문에 오류가 뜬다. 따라서

    }
    {
        int sum = 0;
        int i = 0;
        for( ; true ; i++) {  
            if(i%3 == 0){
                continue;
            }
                sum += i;
                if(sum > 500) {
                    break;
                }
            }
            System.out.println(i);  // 이렇게 i를 for문 전에 할당해 놓으면 된다. 혹은,
    }

    {

        int sum = 0;
        for(int i = 1 ; true ; i++) {  
            if(i%3 == 0){
                continue;
            }
                sum += i;
                if(sum > 500) {
                    System.out.println(i);
                    break;
                }
            }   // 이렇게 i값을 찍고 탈출하도록 짤 수도 있다.

    }
}
}



