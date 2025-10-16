package com.joong_ang.stm.repo;



public class QQQ {
    AAA aaa;    // 같은 패키지(폴더) 안에 있으니까 AAA클래스 사용 가능.

    // BBB bbb;    // BBB는 다른 패키지(폴더)에 있기 때문에 생짜로는 사용 불가.

    com.joong_ang.stm.service.BBB bbbb;    // 이렇게 쓰거나 import를 쓰면 된다.(자동완성 지원함)

    // import com.joong_ang.stm.service.BBB; 이걸 위에 import하면 가능.(자동완성 됨)
}
