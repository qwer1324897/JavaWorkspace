import java.util.Scanner; 
public class casino {
    public static void main(String[] args) {
        
        // 카지노 게임을 만들어보자.
        // 게임은 총 4개의 게임중 아무거나 골라서 진행 가능
        // 초기자본은 1000달러
        // 게임은 홀짝, 가위바위보, 블랙잭, 하이로우
        // 퇴장, 혹은 자본이 0달러가 되면 게임이 종료됨.

        Scanner scanner = new Scanner(System.in);
        int coin = 1000;




        System.out.println("\n\n************************************");
        System.out.println("    카지노에 오신 걸 환영합니다.      ");
        System.out.println("************************************");

        
        while (true) {

            System.out.println("\n플레이 하실 게임을 선택해주세요.\n");
            System.out.println("1. 홀짝 게임.");
            System.out.println("2. 가위바위보.");
            System.out.println("3. 로또.");
            System.out.println("4. 하이로우.");
            System.out.println("\n0. 끝내기");
            System.out.print("\n숫자 입력 > ");
            String command = scanner.nextLine();

            if(command.equals("0")) {
                break;
            }

            if(command.equals("1")) {
                // 홀짝게임 진행

                System.out.println("\n\n\n\n\n\n\n-----홀짝 게임에 오신 것을 환영합니다-----");
                System.out.print("\n베팅액 입력(남은 자본: "+coin+" 달러) > ");
                int bet = Integer.parseInt(scanner.nextLine());

                coin -= bet;

                System.out.println("\n홀 / 짝 중 하나를 골라주세요.\n");
                System.out.println("1. 홀");
                System.out.println("2. 짝");
                System.out.print("\n입력 > ");
                String even = scanner.nextLine();

                if(even.equals("1")) {
                    System.out.println("\n------------------------- '홀'을 선택하셨습니다. -------------------------");
                    System.out.println("\n주사위 굴리는 중...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");

                    int result = (int)(Math.random()*2) + 1;   // 이렇게 하고 아래에서 api로 value를 변경할 수도 있고
                    // String strResult = result + "";  // 이런식으로 숫자 + 문자 로 숫자를 문자로 문법적으로 바꿔버릴 수도 있다

                    String textResultEven = result == 1 ? "홀" : "짝" ;
                    System.out.println("-------------- 주사위 결과는 " + textResultEven + " 입니다. ----------------");

                
                    
                    if(Integer.parseInt(even) == result) {
                        System.out.println("\n축하합니다!! 정답을 맞추셨습니다. 베팅액의 2배를 획득합니다.\n");
                        coin += bet * 2;// 달러 획득
                        System.out.println("\n남은 자본: "+coin+" 달러");
                    } else {
                        System.out.println("\n아쉽게도 패배하셨습니다.\n베팅액을 잃습니다.\n");
                        System.out.println("남은 자본: "+coin+" 달러");
                    }
                }

                else if(even.equals("2")) {
                    System.out.println("\n------------------------- '짝'을 선택하셨습니다. -------------------------");
                    System.out.println("\n주사위 굴리는 중...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");

                    int result2 = (int)(Math.random()*2) + 1;   // 이렇게 하고 아래에서 api로 value를 변경할 수도 있고
                    // String strResult = result + "";   이런식으로 숫자 + 문자 로 숫자를 문자로 문법적으로 바꿔버릴 수도 있다

                    // string texResultEven = result == 1 ? "홀" ; "짝" ;
                    // System.out.println(textResultEven + "이 나왔습니다.") ;

                    System.out.println("\n주사위의 총 합은" + result2 + "");
                    
                    if(Integer.parseInt(even) == result2) {
                        System.out.println("\n축하합니다! 정답을 맞추셨습니다. 베팅액의 2배를 획득합니다.\n");
                        coin += bet * 2;// 달러 획득
                        System.out.println("\n남은 자본: "+coin+" 달러");
                    } else {
                        System.out.println("\n아쉽게도 패배하셨습니다.\n베팅액을 잃습니다.\n");
                        System.out.println("\n남은 자본: "+coin+" 달러");
                    }
    
                    System.out.println("\n------------- 홀짝 게임을 종료 합니다 -------------");
                } else {

                    System.out.println("\n유효하지 않은 값 입니다.\n\n초기 화면으로 돌아갑니다.");
                    continue;
                }


            } else if(command.equals("2")) {
                // 가위바위보 게임

                System.out.println("\n\n\n\n\n\n\n\n------------- 가위바위보 게임 -------------\n");
                System.out.println("가위바위보 게임에 오신 것을 환영합니다.");

                System.out.print("\n베팅 금액을 입력하세요 (보유 자본: "+coin+") > ");
                int bet = Integer.parseInt(scanner.nextLine());
                
                coin -= bet;

                System.out.println("\n가위, 바위, 보 중에 하나를 선택해 주세요.\n");
                
                System.out.println("\n1. 가위");
                System.out.println("\n2. 바위");
                System.out.println("\n3. 보");
                
                System.out.println("\n\n입력 > ");

                String rockScissorsPaper = scanner.nextLine();

                int result = (int)(Math.random()*3) + 1;

                //String cpuRockScissorsPaper = result == 1 ;

                if (rockScissorsPaper.equals("1")) {

                    System.out.println("------------------------");
                    System.out.println("------" + result + "------");
                    System.out.println("------------------------");


                    System.out.println(result);

                    if (Integer.parseInt(rockScissorsPaper) == result) {
                        System.out.println("축하합니다! 승리하셨습니다");
                    }
                    




                } else if (rockScissorsPaper.equals("2")) {

                    if (Integer.parseInt(rockScissorsPaper) == result);


                } else if (rockScissorsPaper.equals("3")) {

                    if (Integer.parseInt(rockScissorsPaper) == result);


                } else {
                    
                    System.out.println("\n유효하지 않은 값 입니다.\n\n초기 화면으로 돌아갑니다.");
                    continue;
                }

















            } else if(command.equals("3")) {
                // 블랙잭











            } else if(command.equals("4")) {
                System.out.println("\n\n\n\n\n\n\n\n------------- 하이로우 -------------\n");
                System.out.println("하이로우 게임에 오신 것을 환영합니다.");
                System.out.println("\n이 게임은 시스템이 0~46 사이의 숫자들 중 한 가지 숫자를 정하고, 사용자가 이를 맞추는 게임입니다.");
                System.out.println("\n총 5번의 기회가 주어집니다.");

                System.out.print("\n베팅 금액을 입력하세요 (보유 자본: "+coin+") > ");
                int bet = Integer.parseInt(scanner.nextLine());
                
                coin -= bet;

                int targetNumber = (int)(Math.random()*47);

                boolean correct = false ;
                for(int i = 5 ; i > 0 ; i--) {
                    System.out.print("\n예상하신 숫자를 입력하세요. ("+i+"회 남음) \n> ");
                    int guessNumber = Integer.parseInt(scanner.nextLine()) ;

                    if(targetNumber > guessNumber) {
                        System.out.println("\n업 입니다!");
                    } else if(targetNumber < guessNumber) {
                        System.out.println("\n다운 입니다!");
                    } else {
                        // 맞춘 경우
                        System.out.println("\n축하합니다!! 정답("+ targetNumber +")을 맞추셨습니다. 베팅액의 2배를 획득합니다.\n");
                        coin += bet*3 ;
                        System.out.println("\n남은 자본: "+coin+" 달러");
                        correct = true;
                        break;
                    }
                }
            
                if(!correct) {
                    System.out.println("\n정답이 아닙니다. 패배하셨습니다.\n\n베팅액을 잃습니다.\n");
                    System.out.println("\n남은 자본: "+coin+" 달러");
                    
                }





            } else {
                System.out.println("\n#유효하지 않은 값입니다. 다시 입력해주세요.#\n");
            }

            if(coin <= 0) {
                System.out.println("\n\n자본금이 없습니다. 카지노에서 퇴장합니다.");
                break;
            }

            System.out.println("\n계속해서 카지노를 플레이 하시려면 enter를 입력해주세요.");
            scanner.nextLine();

        }

            System.out.println("\n\n이용해주셔서 감사합니다.\n");



    }
}









