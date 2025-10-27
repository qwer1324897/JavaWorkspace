package p8;

import java.io.FileOutputStream;

// 오늘 수업의 결론.

// 파일 입출력 담당하는 네트워크 코드 짤 때,

// 앞으로 어떤 api를 썼는데, 분명히 잘 썼는데도, 문법오류가 떠서 마우스 갖다 댔는데 Unhandle exception 어쩌구 뜨면,
// 반드시 try catch 문을 써야 그 api를 사용할 수 있는 api라는 뜻이니까, 그 api를 쓰려면 try catch 문을 쓰면 된다.

// catch 문에는 오류에 해당하는 모든 익셉션 종류를 쓰지 말고, 그냥 Exception 을 써버리면,
// Exception이 모든 익셉션의 최상위 부모이기 때문에 그 api가 필요한 모든 catch문을 다 일일이 안 써도 된다.

// 아래는 try catch 가 필요한 api 사용 예시.

public class App {
    public static void main(String[] args) {
        int value = Integer.parseInt("19");
        try(FileOutputStream fileOutputStream = new FileOutputStream("c:/aaa/bbb.text")){
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
