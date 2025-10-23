package test.house.account.book.repository;

import java.util.ArrayList;
import java.util.List;

import test.house.account.book.dto.Dto;

public class Repository {

    /*
     * 하단 내용은 배열도 모르고 ArrayList API도 잘 몰라서 그냥 gpt로 작성하였음.
     */
    
    List<Dto>houseAccountList = new ArrayList<>();

    public Repository () {
        houseAccountList.add(new Dto("", "", "", 0, ""));
    }

    public void save(Dto dto) {
        if (dto != null) {  
            houseAccountList.add(dto);  
            System.out.println("성공적으로 저장되었습니다.\n===== 저장 내용 =====\n");
            System.out.println("날짜: " + dto.getDate() + " 유형: " + dto.getKind() + " 거래 내용: " + dto.getCategory() +"\n금액: "+ dto.getPrice() + "원"+" 메모: "+dto.getMemo());  
        } else { 
            System.out.println("저장할 데이터가 없습니다.");
        }
    }

}

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
