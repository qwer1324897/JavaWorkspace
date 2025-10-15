public class P3 {
    public static void main(String[] args) {
        
        int [] arr1 = new int[5];
        // arr1 = null; // null = 참조할 것이 없다는 의미의 값

        int [] arr2 = arr1;  // 이렇게도 가능하다  == 이 뜻은 arr2 주소를 arr1 주소로 바꾸겠다는 뜻.

        arr1[0] = 30;
        arr2[0] = 40;   // arr2 주소는 이제 arr1 주소와 똑같기 때문에, arr1[0] = 40; 의 값을 대입한 것.

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        // 그래서 이걸 출력시키면 이미 arr1, arr2 주소는 같고, 한 개의 인덱스가 있는데, 40으로 덮어썼기 때문에 앞의 30은 밀어졌다.
        // 따라서 30 30 이 출력되는게 아니라 40 40 이 출력되는 것.

    }
}
