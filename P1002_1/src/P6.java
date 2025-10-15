public class P6 {
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        for(int i = 0 ; i < arr.length ; i++) {  // arr.length  는 arr에 접근해서 값을 읽는 클래스  i < 10 과 같다.
            arr[i] = (int)(Math.random()*6) + 1;

        }
    }
}
