package com.joongang.stm.dto;

/* Dto = 기능 없음. 자료 형태 묶기만을 위한 클래스. 따라서 핵심은 속성(필드)이다. */

public class StudentDto {
    private String name;
    private int age;
    private int score;

    /* All Argument(받는 값. 파라미터와 동일한 의미) Constructor */

    public StudentDto(String name, int age, int score) {    /* 이게 파라미터. 외부에서 받는 변수 */
        this.name = name ;
        this.age = age ;
        this.score = score ;
    }

    /* No Argument Constructor */

    public StudentDto() {}  /* 받는 값이 없는 StudentDto. 이렇게 없는 것도 하나 만드는게 그냥 공식인데 실무에선 생략하기도 한다 */


    /* setter, getter : 문법은 메서드이지만, 개념적 기능으로 분류하지 않는다. */

    /* 그냥 공식이다. name에서 = 을써서 직접 변경하는게 아니라, .setName .getName으로 name에 접근해서 변경하는 용도. */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }    

    /* 매번 이렇게 공식처럼 다 써줘야되는데, 나중에는 API 딸깍으로 이걸 다 생성해준다. 따라서 이 구조를 이해해야 한다. */
}
