package com.joongang.stm.service;

import com.joonang.stm.util.IoManager;
import com.joongang.stm.dto.StudentDto;
import com.joongang.stm.repository.Repository;

/* 컴포넌트 - 로직위주 클래스
 * 역할: 비즈니스로직(코어로직) 담당 */

public class Service {

    private Repository repository = new Repository();


    public void addStudent() {
        IoManager.print("\n========= 학생 정보 입력 =========\n");
        String name = IoManager.input("이름 입력 > ");
        int age = IoManager.integerInput("\n나이 입력 > ");
        int score = IoManager.integerInput("\n점수 입력 > ");
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.save(studentDto);
        IoManager.print("================================");
    }

    public void listStudent() {
        IoManager.print("\n======= 학생 정보 목록 =======\n");
        StudentDto[] list = repository.findAll();
        
        for(StudentDto studentDto : list) {
            String text = "";
            text += "이름: " + studentDto.getName();
            text += " 나이: " + studentDto.getAge();
            text += " 성적: " +studentDto.getScore();
            IoManager.print(text);  
        }   
        IoManager.print("\n총 " + list.length + "명이 존재합니다.");
        IoManager.print("================================");
    }

    public void serchStudent() {
        IoManager.print("\n======= 학생 정보 검색 =======\n");
        String searchWord = IoManager.input("\n검색할 학생의 이름을 입력하세요 > ");
        StudentDto[] list = repository.findByNameContaining(searchWord);

        for(StudentDto studentDto : list) { 
            String text = "";
            text += "이름: " + studentDto.getName();
            text += "\n나이: " + studentDto.getAge();
            text += "\n성적: " +studentDto.getScore();
            IoManager.print(text);  
        }   
        IoManager.print("\n검색된 인원은 총 " + list.length + "명 입니다.");
        IoManager.print("============================");
    }

    public void removeStudent() {
        IoManager.print("\n======= 학생 정보 삭제 =======\n");
        String removeName = IoManager.input("삭제하실 학생의 이름을 입력하세요 > ");
        int count = repository.removeByName(removeName);
        IoManager.print("\n총 " + count + "명의 학생 정보가 삭제되었습니다.");
        IoManager.print("============================");        
    }

    public void statistize() {
        IoManager.print("\n======= 학생 정보 통계 =======\n");
        StudentDto[] list = repository.findAll();
        int sumScore = 0;

        for(StudentDto studentDto : list) {
            sumScore += studentDto.getScore();
        }
        double avg = sumScore / (double)list.length;
        IoManager.print("n총 인원: " + list.length);
        IoManager.print("평균: " + avg);
        IoManager.print("============================");         
    }
}
