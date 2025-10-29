package com.joongang.stm.repository;

import java.util.ArrayList;
import java.util.List;
import com.joongang.stm.dto.StudentDto;

/* 컴포넌트
 * 역할: 저장소 - 데이터 입출력 담당 */

public class Repository {
    
    private List<StudentDto> list = new ArrayList<>();

    public void save(StudentDto studentDto) {   
        list.add(studentDto);
    }

    public List<StudentDto> findAll() {
        return list;
    }

    public List<StudentDto> findByNameContaining(String searchWord) {
        List<StudentDto> newList = new ArrayList<>();
        for (StudentDto studentDto : list) {
            if (studentDto.getName().contains(searchWord)) {
                newList.add(studentDto);
            }
        }
        return newList;
    }

    // 실제로 List 의 remove를 사용할 일은 거의 없다. 이 부분은 넘어가도 됨.
    public Integer removeByName(String removeName) {
        int count = 0;
        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).getName().equals(removeName)) {
                list.remove(i);
                i--;
                count ++;
            }
        }
        return count;
    }
}
