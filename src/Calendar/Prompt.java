package Calendar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Prompt {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
		
		Calendar calendar = new Calendar();
		boolean current = true;
		String date;
		String plan;
		
		while (current) {
			System.out.println("=======================메인  메뉴========================");
			System.out.println(" 1. 달력 보기  2. 일정 추가하기  3. 일정 확인하기	4. 일정 삭제하기");
			System.out.println("======================================================");
			System.out.println("원하는 기능을 입력하세요 : ");
			
			try {
				int select = myObj.nextInt();
				switch (select) {
				case 1:
					System.out.println("년도를 입력하세요 :");
				    int year = Integer.parseInt(myObj.next());
				    
				    System.out.println("월을 입력하세요 :");
				    int month = Integer.parseInt(myObj.next());
				    
				    calendar.print_calendar(year, month);
					
				    break;

				case 2:
					System.out.println("날짜를 입력하세요 (yyyy-MM-dd) :");
				    date =myObj.next();
				    
				    System.out.println("일정을 입력하세요 :");
				    plan =myObj.next();
				    
				    calendar.add_datePlan(date, plan);
				    
				    break;

				case 3:
					System.out.println("날짜를 입력하세요 (yyyy-MM-dd) :");
				    String select_date =myObj.next();

				    calendar.get_datePlan(select_date);
				    
					break;
					
				case 4:
					System.out.println("날짜를 입력하세요 (yyyy-MM-dd) :");
				    String delete_date =myObj.next();
				    
				    calendar.delete_datePlan(delete_date);
				    
				    break;   

				case 0:
					System.out.println("종료합니다");
					current = false;
					break;
				}
				
				
			} catch (InputMismatchException ime) {
				System.out.println("제대로 된 값을 입력해 주세요");
				myObj = new Scanner(System.in);
			}
		}
	}

}
