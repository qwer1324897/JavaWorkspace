public class P7 {
    public static void main(String[] args) {
        
        // 이중 배열

        int[][] arr = new int[3][4] ;  // 0번 1번 2번 배열 3개를 생성하고 각 배열 안에 0~3번 배열 4개를 다시 생성한다.
        
        arr[0][0] = 50;
        arr[1][2] = 70;

        // 이 때 첫번째 배열의 0번 배열을 지우면 그 배열과 연결된 0~3번째 배열 4개도 사라진다

        arr[0] = new int[2] ;  // 이렇게 첫번째 배열의 0번 배열에 새로 0, 1 두개의 배열을 생성한다.
        // 이 때 원래 있던 0번째 배열의 0123 4개 배열은 사라진다.
    
        for(int x = 0 ; x < 3 ; x++) {
            for(int y = 0 ; y < 4 ; y ++) {
                arr [x][y] = 30;   // 이건 오류가 뜬다
            }        
        }
    
        for(int x = 0 ; x < arr.length ; x++) {
            for(int y = 0 ; y < arr[x].length ; y ++) 
                arr [x][y] = 30;    // 이런식으로 해야한다
                // 이거 책 배열부분 읽고 복습하고 ai한테 물어봐서 끝까지 이해.
        }
    


}
}
