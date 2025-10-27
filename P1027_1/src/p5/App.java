package p5;

public class App {
    public static void main(String[] args) {
        
        // String str = null;
        // str = str.substring(3);

        // int a = 3/0 ;

        // int [] arr = new int[5];
        // arr [7] = 30;
        
        // 이런 말도 안되는 오류 투성이 코드를 예로 들면,

        try {
            String str = null;
            str = str.substring(3);

            int a = 3/0 ;

            int [] arr = new int[5];
            arr [7] = 30;

        } catch (NullPointerException exception) {
            System.out.println("NullPointerException이 발생했을 경우에 예외를 처리하는 로직");
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException이 발생했을 경우에 예외를 처리하는 로직");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException이 발생했을 경우에 예외를 처리하는 로직");
        } catch (Exception exception) {
            // 위의 캐치문들은 예측이 가능한 예외들
            // 사실상 예측 불가능한 부분들은 그냥 이렇게 Exception 을 찍어놓고, 반드시 로그를 출력한다.
            exception.printStackTrace();    // 만약 이렇게 로그가 출력되면, 그 때 가서 여기에 예외처리 코드를 만든다.
        }
        
        System.out.println("exit program");
    }
}
