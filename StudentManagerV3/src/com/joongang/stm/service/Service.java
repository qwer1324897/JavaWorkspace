package com.joongang.stm.service;

import java.util.List;

import com.joongang.stm.dto.StudentDto;
import com.joongang.stm.repository.Repository;
import com.joongang.stm.util.IoManager;

/* 컴포넌트 - 로직위주 클래스
 * 역할: 비즈니스로직(코어로직) 담당 */

public class Service {

    private Repository repository = new Repository();

    public void addStudent() {
        IoManager.print("\n========= 학생 정보 입력 =========\n");
        String name = IoManager.stringInput("이름 입력 > ");
        int age = IoManager.integerInput("\n나이 입력 > ");
        int score = IoManager.integerInput("\n점수 입력 > ");
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.save(studentDto);
        IoManager.print("================================");
    }

    public void listStudent() {
        IoManager.print("\n========= 학생 정보 목록 =========\n");
        List<StudentDto> list = repository.findAll();
        for (StudentDto studentDto : list) {
            String text = "";
            text += "이름: " + studentDto.getName();
            text += "\n나이: " + studentDto.getAge();
            text += "\n성적: " +studentDto.getScore();
            IoManager.print(text);
        }
        IoManager.print("\n총 " + list.size() + "명이 존재합니다.");
        IoManager.print("================================");
    }

    public void searchStudent() {
        IoManager.print("\n========= 학생 정보 검색 =========\n");
        String searchName = IoManager.stringInput("\n검색할 학생의 이름을 입력하세요 > ");
        List<StudentDto> list = repository.findByNameContaining(searchName);
        for(StudentDto studentDto : list) { 
            String text = "";
            text += "이름: " + studentDto.getName();
            text += "\n나이: " + studentDto.getAge();
            text += "\n성적: " +studentDto.getScore();
            IoManager.print(text);  
        }   
        IoManager.print("\n검색된 인원은 총 " + list.size() + "명 입니다.");
        IoManager.print("================================");
    }

    public void removeStudent() {
        IoManager.print("\n========= 학생 정보 삭제 =========\n");
        String removeName = IoManager.stringInput("삭제하실 학생의 이름을 입력하세요 > ");
        Integer count = repository.removeByName(removeName);
        IoManager.print("\n총 " + count + "명의 학생 정보가 삭제되었습니다.");
        IoManager.print("================================");
    }

    public void studentStatic() {
        IoManager.print("\n========= 학생 정보 통계 =========\n");
        List<StudentDto> list = repository.findAll();
        Integer avgScore = 0;
        for (StudentDto studentDto : list) {
            avgScore += studentDto.getScore();
        }
        double avg = avgScore/(double)list.size();
        IoManager.print("n총 인원: " + list.size());
        IoManager.print("평균: " + avg);
        IoManager.print("================================");
    }
}

