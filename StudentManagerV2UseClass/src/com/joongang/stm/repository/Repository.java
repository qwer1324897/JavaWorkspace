package com.joongang.stm.repository;

import com.joongang.stm.dto.StudentDto;

/* 컴포넌트
 * 역할: 저장소 - 데이터 입출력 담당
 * 
 * 이 부분(레퍼지토리)은 사실상 DB 쿼리로 변경 예정. 지금은 아직 DB를 안 배워서 구현한 것. > 현업에서 직접 구현할 일 없음
 * 복습할 때 이 부분은 그냥 복붙으로 진행.
 */

public class Repository {
    private StudentDto[] list = new StudentDto[5];
    private int count = 0;

    public void save(StudentDto studentDto) {
        list[count] = studentDto;
        count ++; 
    }

    public StudentDto[] findAll() {
        // 깊은 복사
        StudentDto[] newList = new StudentDto[count];

        /* 하단 내용은 필요한 만큼의 배열을 복사해서 리턴하는 내용 
         * 나중에는 알아서 다 해준다.*/
        for(int i = 0; i < count ; i++) {
            String name = list[i].getName();
            int age = list[i].getAge();
            int score = list[i].getScore();
            
            StudentDto studentDto = new StudentDto(name, age, score);
            newList[i] = studentDto;
        }
        return newList;
    }

    public StudentDto[] findByNameContaining(String searchWord) {
        int searchCount = 0;
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().contains(searchWord)) {
                searchCount++;  
            }
        }
        StudentDto[] newList = new StudentDto[searchCount];
        int newListCount = 0;
        for(int i = 0 ; i < count ; i++) {
            if(list[i].getName().contains(searchWord)){
                String name = list[i].getName();
                int age = list[i].getAge();
                int score = list[i].getScore();
                StudentDto studentDto = new StudentDto(name, age, score);
                newList[newListCount] = studentDto;
            }
        }
        return newList;
    }

    public int removeByName(String removeName) {
        int removeCount = 0;

        for(int i = 0 ; i < count; i ++) {
            if(list[i].getName().equals(removeName)) {
                for(int x = i ; x < count ; x++) {
                    list[x] = list[x+1];
                }
                count --;
                i --;
                removeCount++;
            }
        }
        return removeCount;
    }

}
