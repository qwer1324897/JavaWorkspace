package test.house.account.book.service;

import java.util.ArrayList;
import java.util.List;

import test.house.account.book.IoManager.IoManager;
import test.house.account.book.dto.Dto;
import test.house.account.book.repository.Repository;

public class Service {

    private Repository repository = new Repository();
    private List<Dto> list = new ArrayList<>();


    public void addTransaction() {
        IoManager.print("\n============ 수입/지출 내역 등록 ============\n");
        String date = IoManager.printAndInputString("수입/지출 하신 날짜를 입력해 주세요. (ex.25년 10월 23일) \n> ");
        String kind = IoManager.printAndInputString("\n유형을 입력해 주세요. ex.(수입, 지출) \n> ");
        String category = IoManager.printAndInputString("\n내용을 입력해 주세요. ex.(식비, 공과금, 교통비 등) \n> ");
        Integer price = IoManager.printAndInputInteger("\n금액을 입력해 주세요. ex.(12000, 1750) \n> ");
        String memo = IoManager.printAndInputString("\n메모하실 특이사항이 있다면 입력해 주세요. \n> ");
        Dto dto = new Dto(date, kind, category, price, memo);
        repository.save(dto);
        IoManager.pause();
    }

    public void transactionList() {
        IoManager.print("======== 수입/지출 내역 목록 및 합계 ========");
        IoManager.print("\n1. 수입 내역 목록 확인");
        IoManager.print("2. 지출 내역 목록 확인");
        IoManager.print("3. 전체 내역 및 잔고 확인");
        IoManager.print("4. 카테고리 별 합계");
        if (IoManager.printAndInputInteger(" > ")==1) {
            IoManager.print("\n============ 수입 내역 목록 ============\n");
            list = repository.copylist();
            int incomeCount = 0;
            for (Dto incomeDto : list) {
                if ("수입".equals(incomeDto.getKind())) {
                    String text = "";
                    text += "날짜: " + incomeDto.getDate();
                    text += "\n내용: " + incomeDto.getCategory();
                    text += "\n금액: " + incomeDto.getPrice();
                    text += "\n메모: " + incomeDto.getMemo();
                    incomeCount++;
                    IoManager.print(text);
                } 
            }
            IoManager.printAndInputString("\n총 " + incomeCount + "개의 수입 목록이 존재합니다.");
            

        } else if (IoManager.printAndInputInteger(" > ")==2){
            IoManager.print("\n========== 지출 내역 목록 ==========\n");
            

        } else if (IoManager.printAndInputInteger(" > ")==3){
            IoManager.print("\n========== 전체 내역 및 잔고 ==========\n");

            
        } else if (IoManager.printAndInputInteger(" > ")==4){
            IoManager.print("\n========== 카테고리 별 합계 ==========\n");


        }
    }
    

    //     public void listStudent() {
    //     IoManager.print("\n======= 학생 정보 목록 =======\n");
    //     StudentDto[] list = repository.findAll();
        
    //     for(StudentDto studentDto : list) {
    //         String text = "";
    //         text += "이름: " + studentDto.getName();
    //         text += " 나이: " + studentDto.getAge();
    //         text += " 성적: " +studentDto.getScore();
    //         IoManager.print(text);  
    //     }   
    //     IoManager.print("\n총 " + list.length + "명이 존재합니다.");
    //     IoManager.print("================================");
    // }

    

    public void removeTrasaction() {
        IoManager.print("=========== 수입/지출 내역 삭제 ===========");


    }

    public void totalPriceByCategory() {
        IoManager.print("============= 카테고리별 합계 =============");


    }

    public void showTotalPriceFromLowest() {
        IoManager.print("============ 금액 내림차순 보기 ============");


    }

    public void searchByMemoKeyword() {
        IoManager.print("============ 메모 키워드로 검색 ============");


    }
}
/*
 *  날짜(문자): 2025-10-22
    유형(문자): 수입, 지출
    카테고리(문자): 식비, 공과금, 교통비, 월급.. 등등
    금액(숫자): 12000
    메모(문자): 점심
 */