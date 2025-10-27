package test.house.account.book.repository;

import java.util.ArrayList;
import java.util.List;
import test.house.account.book.dto.Dto;

public class Repository {

    
    List<Dto> houseAccountList = new ArrayList<>();

    public Repository () {
        houseAccountList.add(new Dto("", "", "", 0, ""));
    }

    public void save(Dto dto) {
        if (dto != null) {  
            houseAccountList.add(dto);  
            System.out.println("\n\n*** "+ dto.getCategory() +" "+ dto.getKind() +"내역이 저장되었습니다. ***");
            System.out.println("\n========== 저장 내용 ===========\n");
            System.out.println("날짜: " + dto.getDate() + "\n유형: " + dto.getKind() + " / 거래항목: " + dto.getCategory() +"\n금액: "+ dto.getPrice() + "원"+"\n\n메모: "+dto.getMemo());  
        } else { 
            System.out.println("저장할 데이터가 없습니다.");
        }
    }

}
// public List<Dto> getAllTransactions() {
//     return new ArrayList<>(houseAccountList);  // 얕은 복사 반환 (원본 보호)
// }

// public List<Dto> getIncomeTransactions() {  // 수입만 필터링
//     List<Dto> incomeList = new ArrayList<>();
//     for (Dto dto : houseAccountList) {
//         if ("수입".equals(dto.getKind())) {
//             incomeList.add(dto);
//         }
//     }
//     return incomeList;
// }

/*
날짜(문자): 2025-10-22
유형(문자): 수입, 지출
카테고리(문자): 식비, 공과금, 교통비, 월급.. 등등
금액(숫자): 12000
메모(문자): 점심

* 화면 예시
[가계부]
1. 거래 등록 (수입/지출)
2. 거래 목록 및 합계
3. 거래 삭제
4. 카테고리별 합계
5. 금액 내림차순 보기
6. 검색(메모 키워드)
7. 종료
선택>
*/
