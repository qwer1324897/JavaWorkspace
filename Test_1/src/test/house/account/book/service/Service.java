package test.house.account.book.service;

import test.house.account.book.IoManager.IoManager;
import test.house.account.book.dto.Dto;
import test.house.account.book.repository.Repository;

public class Service {

    private Repository repository = new Repository();

    public void addTransaction() {
        IoManager.print("============ 수입/지출 내역 등록 ============");
        String date = IoManager.printAndInputString("수입/지출 하신 날짜를 입력해 주세요 > ");
        String kind = IoManager.printAndInputString("유형을 입력해 주세요. ex.(수입, 지출 등) > ");
        String category = IoManager.printAndInputString("내용을 입력해 주세요 ex.(식비, 공과금, 교통비 등) > ");
        int price = IoManager.printAndInputInteger("금액을 입력해 주세요. ex.(+12000, -9500 등) > ");
        String memo = IoManager.printAndInputString("메모하실 내용을 입력해 주세요. > ");
        Dto dto = new Dto(date, kind, category, price, memo);
        repository.save(dto);
    }

    public void transactionList() {
        IoManager.print("======== 수입/지출 내역 목록 및 합계 ========");


    }

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