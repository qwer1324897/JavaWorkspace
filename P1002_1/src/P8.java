public class P8 {
    public static void main(String[] args) {
        
        // for문

        int[] arr = new int[10];


        // foreach. 향상된 for 문

        for(int element : arr) {  // 이때  element 는 그냥 변수 이름이다 아무거나 설정하면 되고
            System.out.println(element);
        }

        // 이 for문은 배열에 접근해서 배열 수 만큼 반복을 돌린다.
        // 고전 for문은 하나하나 범위 정하고 했어야 했는데
        // 이건 그냥 배열 만들고 그만큼 반복을 돌릴 수 있다. 고전 for문은 안 쓴다.

    }
}
