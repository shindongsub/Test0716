
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cmd = "";
		
		ArrayList <Integer> ids = new ArrayList<Integer>();
		ArrayList <String> titles = new ArrayList<String>();
		ArrayList <String> bodies = new ArrayList<String>();
		ArrayList <String> writers = new ArrayList<String>();
		
		int id = 1;
//		int lastIndex = 0; //인덱스관리용
		
//		//자바 배열 -> 데이터타입, 길이
//		String[] titles = new String[3];  // 배열을 10개가 차면 20개로 늘려주고 40개로 늘려주는 방식 해보기.****
//		String[] bodies = new String[3];
//		String[] writers = new String[3];  //- 게시물 목록을 위해 배열 사용 add
		

		while (true) {

			System.out.print("명령어를 입력해주세요 : ");
			cmd = sc.next();

			if (cmd.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			if (cmd.equals("help")) {
				System.out.println("add : 데이터 저장");
				System.out.println("read : 데이터 조회");
				System.out.println("update : 데이터 수정");
				System.out.println("delete : 데이터 삭제");
			}
			if (cmd.equals("add")) {
				
				ids.add(id);
				id ++; // 삭제한 데이타는?? 번호가 어떻게 사라지냐...
				
				sc.nextLine(); // 입력통이 빈다.
				System.out.print("제목을 입력해주세요 :");
				String title = sc.nextLine();
				titles.add(title);
				
//				titles.add(sc.nextLine());
				
				System.out.print("내용을 입력해주세요 :");
				String body = sc.nextLine();
				bodies.add(body);
//				bodies[lastIndex] = sc.nextLine();
				
				System.out.print("작성자를 입력해주세요 :");
				String writer = sc.nextLine();
				writers.add(writer);
//				writers[lastIndex] = sc.nextLine();
//				System.out.println(titles + "," + bodies + "," + writers);
				
				System.out.println("게시물이 등록되었습니다..");
//				lastIndex ++;
			}
			if (cmd.equals("read")) { // 제목 : 제목 / 작성자 : 작성자 두개만일단.
				System.out.println("==========게시물 목록============");
				for (int i = 0; i < titles.size() ; i++) {  // .size는 몇개있는지 보여준다.????
					System.out.println("번호 : " + ids.get(i));
					System.out.println("제목 : " + titles.get(i));
//					System.out.println("내용 : " + bodies.get(i)+"\n");
				}
			}
			if (cmd.equals("update")) {
				System.out.println("어떤 게시물을 수정하시겠습니까? : ");
				int targetIndex = sc.nextInt();
				sc.nextLine();
				System.out.println("수정할 제목을 입력해 주세요 : ");
				String updated_title = sc.nextLine();			
				titles.set(targetIndex - 1, updated_title);
				System.out.println("제목 수정이 완료되었습니다.");
				
				
			}
			if (cmd.equals("delete")) {
//				store = null;
//				System.out.println("삭제가 완료되었습니다.");
			}
		}

	}

}

/*
1. 게시물 등록
 - 제목, 내용, 작성자 저장
 - 배열을 이용해 게시물 내용 저장
 - 등록중에 길이를 넘어서 등록할 때 오류..
 - ArrayList 도입
 
 2. 게시물 목록조회
 -제목:제목
 -작성자:작성자
 -배열에 있는 게시물들 목록화(리스팅)
 
 -게시물 목록을 위해 배열사용
 -게시물 조회했는데 한꺼번에 나옴.
 */
