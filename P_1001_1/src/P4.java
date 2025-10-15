public class P4 {
    public static void main(String[] args) {
        
        // 3항 연산자
    {    
        int score = 78;

        String result = "";

        if (score >= 60) {
            result = "합격" ;
        } else {
            result = "불합격";
        }

        System.out.println(result);
    }
        // 위의 코드는
{
        int score = 78;

        String result = score >= 60 ? "합격" : "불합격" ;

        System.out.println(result);
    }
        // 이 코드와 완벽하게 동일한 코드다.
        // 3항 연산자는   ? 앞의 boolean이 true면 왼쪽 : 오른쪽 ; 중에 왼쪽을 대입하고, false면 오른쪽을 대입한다.

}
}
