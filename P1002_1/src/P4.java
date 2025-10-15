public class P4 {
    public static void main(String[] args) {
        
        int[] arr1 = null;

        {
            int[] arr2 = new int[5];
            arr2[0] = 30;
        }
        // 이 경우 중괄호를 빠져나오면 stack 메모리는 사라진다.
        // 근데 위 코드에서 arr2는 new int[5] 라는 heap에 저장된 인덱스 메모리를 참조하고 있었는데,
        // 인덱스 메모리는 참조하고 있는 변수가 사라지거나 지워지면 자동으로 소멸된다.
        // 따라서 위 코드에서 중괄호를 빠져나오면 인덱스도 사라진다.

        {
            int[] arr2 = new int[5];
            arr2[0] = 30;
            arr1 = arr2 ;
        }

        System.out.println(arr1[0]);   // 이 때는 heap 메모리가 사라지지 않는다.

        // 이게 중요하다. 왜냐면 arr2는 변수를 선언했기에 지워지지만, arr1에 arr2의 주소값을 넣어놨고,
        // arr1 은 지워지지 않았는데, arr1이 여전히 인덱스를 참조하고 있기 때문에 heap에 저장된 인덱스값은 스코프를 벗어나도 지워지지 않는다.
        // heap 메모리는 참조하고 있는 변수가 지워져야 지워지는데 아직 arr1이 참조하고 있어서 안 지워진 것
    }
}
