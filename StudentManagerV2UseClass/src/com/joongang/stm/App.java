package com.joongang.stm;

import com.joongang.stm.controller.Controller;
// import com.joongang.stm.dto.StudentDto;

public class App {
    public static void main(String[] args) {
        // StudentDto s1 = new StudentDto();   // 자동완성(tab)을 쓰면 위의 import도 만들어준다.
        
        //  s1.name = "한조";  << 이거 안 된다. name이 private이라서 
        // s1.setName("한조");     /* 이렇게 */

        //  String aaa = s1.name;  << 이것도 안 된다.
        // String aaa = s1.getName();  /* 이렇게 */

        new Controller().run();
    }
}
