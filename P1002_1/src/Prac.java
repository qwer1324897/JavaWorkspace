public class Prac {
    public static void main(String[] args) {
        
        int [] arr = new int [5] ;

        for (int i = 0 ; i < 5 ; i ++ ) {
            arr[i] = i + 1 ;
        }
        for (int element : arr )
        System.out.println(element);
    }

    

}
