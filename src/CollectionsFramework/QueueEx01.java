package CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx01 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	// Queue에 최대 5개까지만 저장
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있음");
		
		while(true) {
			System.out.print(">> ");
			
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help: 도움말");
					System.out.println(" q 또는 Q: 프로그램 종료");
					System.out.println(" history: 최근 입력한 명령어 " + MAX_SIZE + "를 보여줌");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);	// 입력받은 명령어 저장
					
					LinkedList tmp = (LinkedList)q;	// LinkedList 내용 보여주기
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("에러: " + e.getMessage());
			}
		}
	}
	
	public static void save(String input) {
		// queue에 저장
		if(!"".equals(input))
			q.offer(input);
		
		// queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제
		if(q.size() > MAX_SIZE) // size()는 Collection인터페이스에서 정의
			q.remove();
	}
}
