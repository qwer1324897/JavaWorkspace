public class P2 {
    public static void main(String[] args) {
        
        int[] arr1 = new int[5];
        // arr1 = 0 ;    arr1 도 결국엔 변수이므로 대입을 할 수 있는데, 이건 문법적으로 불가능하다. arr1 은 참조변수라서 자바에선 불가능하다.
        
        // arr1 = null; ;  // 이렇게 대입할 수 있는데, null = 참조할 것이 없다는 의미의 값이다.

        int[] arr2 = new int[5];

        arr1[0] = 30;
        arr2[0] = 40;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);


        // int[] arr2 = arr1;   이것도 가능하다.
        

    }
}
