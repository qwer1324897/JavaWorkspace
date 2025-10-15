import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        // 주제: 학생 정보 관리 프로그램
        // 기능: 학생 정보 등록, 목록, 검색, 삭제, 수정 등
        // 학생 한 명의 데이터: 이름, 나이, 성적
        
        Scanner scanner = new Scanner(System.in);

        // 자료구조
        String[] nameList = new String[5];
        int[] ageList = new int[5];
        int[] scoreList = new int[5];
        int studentCount = 0;

        System.out.println("\n\n=============================");
        System.out.println("     학생 관리 프로그램.V1     ");
        System.out.println("     개발자: QWER1324897     ");
        System.out.println("=============================\n\n");


        while(true) {

            System.out.println("*** Main ***\n");
            System.out.println("1. 학생 정보 등록");
            System.out.println("2. 학생 정보 목록");
            System.out.println("3. 학생 정보 검색");
            System.out.println("4. 학생 정보 삭제");
            System.out.println("5. 학생 정보 수정");    // 알아서 잘 만들어보쇼    
            System.out.println("6. 학생 정보 통계");    // 학생 평균 점수, 가장 낮은 점수를 가진 학생, 가장 높은 점수를 가진 학생 출력.
            System.out.println("\n0. 프로그램 종료\n\n");

            System.out.print("명령어 입력 > ");
            String command = scanner.nextLine();  // 값을 입력받는다.

            // 종료 처리
            if(command.equals("0")) {
                break;
            }
            
            // 명령 처리
            if(command.equals("1")) {
                // 학생 정보 등록 로직
                System.out.println("\n##### 학생 정보 등록 #####\n");
                // 이름 유효성 검사??
                System.out.print("이름 입력 > ");

                String name = scanner.nextLine();

                System.out.print("나이 입력 > ");
                while(!scanner.hasNextInt()) {
                    System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.");
                    scanner.nextLine();
                }
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("성적 입력 > ");
                while(!scanner.hasNextInt()) {
                    System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.");
                    scanner.nextLine();
                }
                int score = Integer.parseInt(scanner.nextLine());


                // ArrayList 내부 동작 구조 >> 배열이 다 찼을때 배열 확장

                if(studentCount == nameList.length) {
                    // 2배 크기의 배열 생성
                    String[] newNameList = new String[studentCount * 2];
                    // studentCount도 복사
                    for(int i = 0 ; i < studentCount ; i++) {
                        newNameList[i] = nameList[i];
                    }
                    nameList = newNameList; // 이 코드가 메모리 소멸의 핵심

                    int[] newAgeList = new int[studentCount * 2];
                    for(int i = 0 ; i < studentCount ; i++) {
                        newAgeList[i] = ageList[i];
                    }

                    int[] newScoreList = new int[studentCount * 2];
                    for(int i = 0 ; i < studentCount ; i++) {
                        newScoreList[i] = scoreList[i];
                    }
                }


                // 고도화 문제. 다음과 같이 등록하시겠습니까?(정보 출력) (Y/N 입력받기)
                System.out.println("\n다음과 같은 학생 정보를 등록하시겠습니까?");
                System.out.println("\n이름: " + name + " 나이: " + age + " 성적: " + score);

                System.out.println("\n등록하시려면 'ㅇㅇ'을, \n등록을 취소하고 초기화면으로 돌아가시려면 'ㄴㄴ'를 입력해주세요.");
                
                
                    if(scanner.nextLine().equals("ㄴㄴ")) {
                        continue;
                    } 

                nameList[studentCount] = name;
                ageList[studentCount] = age;   
                scoreList[studentCount] = score;
                studentCount++;

                for(int i = 0 ; i < studentCount ; i++) {
                    String text = "";
                    text += "이름: " + nameList[i];
                    text += ", 나이: " + ageList[i];
                    text += ", 성적: " + scoreList[i];
                    System.out.println(text);
                }

                System.out.println("\n#############################");
                System.out.println("학생 정보가 등록되었습니다.");
                
                } else if(command.equals("2")) {
                // 학생 목록 로직
                System.out.println("\n###### 학생 목록 ######\n");
                for(int i = 0 ; i < studentCount ; i++) {
                    String text = "";
                    text += "이름: " + nameList[i];
                    text += ", 나이: " + ageList[i];
                    text += ", 성적: " + scoreList[i];
                    System.out.println(text);
                }
                System.out.println("\n#####총 " + studentCount + "명의 학생 정보가 존재합니다.#####");


            } else if(command.equals("3")) {
                // 학생 정보 검색 로직   문제. 등록된 학생의 이름이 아니면, "해당 이름으로 등록된 학생이 없습니다" 출력
                System.out.println("\n##### 학생 정보 검색 #####");
                System.out.print("\n검색할 학생의 이름을 입력하세요 > ");
                String searchName = scanner.nextLine();

                int searchCount = 0;

                for(int i = 0 ; i < studentCount ; i++) {
                    if(nameList[i].contains(searchName)) {
                        searchCount++;
                        String text = "";
                        
                        text += "이름: " + nameList[i];
                        text += ", 나이: " + ageList[i];
                        text += ", 성적: " + scoreList[i];
                        System.out.println(text);
                        System.out.println("\n총 " + searchCount + "명이 검색되었습니다.");
                        System.out.println("###########################");
                    } 
                    if(!nameList[i].contains(searchName)) {
                        System.out.println("\n\n!!해당 이름으로 등록된 학생은 존재하지 않습니다!!");
                        continue;
                    }
                }


            } else if(command.equals("4")) {
                // 학생 정보 삭제 로직

                System.out.println("##### 학생 정보 삭제 #####");
                System.out.print("삭제할 학생의 이름을 입력하세요 > ");
                String deleteName = scanner.nextLine();

                int deleteCount = 0;

                for(int i = 0 ; i < studentCount ; i++) {
                    if(nameList[i].equals(deleteName)) {
                        // 밀어넣기
                        for(int x = i ; x < studentCount - 1 ; x++) {
                            nameList[x] = nameList[x+1];
                            ageList[x] = ageList[x+1];
                            scoreList[x] = scoreList[x+1];
                        }

                        studentCount--;
                        deleteCount++;
                        System.out.println("총 " + deleteCount + "명의 정보가 삭제되었습니다.");
                        System.out.println("#######################");
                    }
                    if(!nameList[i].equals(deleteName)) {
                        System.out.println("\n\n!!해당 이름으로 등록된 학생은 존재하지 않습니다!!");
                        continue;
                    }
                }
                

                
            } else if(command.equals("5")) {
                // 학생 정보 수정 로직
                System.out.println("[Test log] 학생 수정 로직 수행");



            } else {
                System.out.println("\n잘못 입력되었습니다.\n");
            }
            

            System.out.println("\n계속 진행하시려면 enter를 입력하세요.");
            scanner.nextLine();

        }

        // 마무리 코드
        System.out.println("\n프로그램을 종료합니다.");
        System.out.println("이용해주셔서 감사합니다.");

        scanner.close();
    }
}
