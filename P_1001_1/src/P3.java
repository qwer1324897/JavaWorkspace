public class P3 {
    public static void main(String[] args) {
        
        // switch - 분기
        // switch case는 특정 문단으로 점프시켜서 거기부터 쭉 실행시키는 목적으로 개발되었다.
        {
        int value = 3;

        switch(value) {
            case 1:
                System.out.println("1 일때 사용할 로직들");
                System.out.println("1 일때 사용할 로직들");
            case 2:
                System.out.println("2 일때 사용할 로직들");
                System.out.println("2 일때 사용할 로직들");
            case 3:
                System.out.println("3 일때 사용할 로직들");
                System.out.println("3 일때 사용할 로직들");
            case 4:
                System.out.println("4 일때 사용할 로직들");
                System.out.println("4 일때 사용할 로직들");
            case 5:
                System.out.println("5 일때 사용할 로직들");
                System.out.println("5 일때 사용할 로직들");
            case 6:
                System.out.println("6 일때 사용할 로직들");
                System.out.println("6 일때 사용할 로직들");
            default:
                System.out.println("나머지 사용할 로직들");
        }
        }        
        // 이 코드의 경우 value가 3이면 특정 값으로 점프해서 그 아래 로직들을 전부 실행.
        // 그래서 분기용도로 쓰기 위해 case마다 break를 넣어 탈출시킨다.
        
        int value = 3;

        switch(value) {
            case 1:
                System.out.println("1 일때 사용할 로직들");
                System.out.println("1 일때 사용할 로직들");
                break;
            case 2:
                System.out.println("2 일때 사용할 로직들");
                System.out.println("2 일때 사용할 로직들");
                break;
            case 3:
                System.out.println("3 일때 사용할 로직들");
                System.out.println("3 일때 사용할 로직들");
                break;
            case 4:
                System.out.println("4 일때 사용할 로직들");
                System.out.println("4 일때 사용할 로직들");
                break;
            case 5:
                System.out.println("5 일때 사용할 로직들");
                System.out.println("5 일때 사용할 로직들");
                break;
            case 6:
                System.out.println("6 일때 사용할 로직들");
                System.out.println("6 일때 사용할 로직들");
                break;
            default:
                System.out.println("나머지 사용할 로직들");
        }
        // 이런식으로
        // 사실상 else if 로 다 대체가 된다.

    }
}
