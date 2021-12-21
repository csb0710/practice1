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
			System.out.println("=======================����  �޴�========================");
			System.out.println(" 1. �޷� ����  2. ���� �߰��ϱ�  3. ���� Ȯ���ϱ�	4. ���� �����ϱ�");
			System.out.println("======================================================");
			System.out.println("���ϴ� ����� �Է��ϼ��� : ");
			
			try {
				int select = myObj.nextInt();
				switch (select) {
				case 1:
					System.out.println("�⵵�� �Է��ϼ��� :");
				    int year = Integer.parseInt(myObj.next());
				    
				    System.out.println("���� �Է��ϼ��� :");
				    int month = Integer.parseInt(myObj.next());
				    
				    calendar.print_calendar(year, month);
					
				    break;

				case 2:
					System.out.println("��¥�� �Է��ϼ��� (yyyy-MM-dd) :");
				    date =myObj.next();
				    
				    System.out.println("������ �Է��ϼ��� :");
				    plan =myObj.next();
				    
				    calendar.add_datePlan(date, plan);
				    
				    break;

				case 3:
					System.out.println("��¥�� �Է��ϼ��� (yyyy-MM-dd) :");
				    String select_date =myObj.next();

				    calendar.get_datePlan(select_date);
				    
					break;
					
				case 4:
					System.out.println("��¥�� �Է��ϼ��� (yyyy-MM-dd) :");
				    String delete_date =myObj.next();
				    
				    calendar.delete_datePlan(delete_date);
				    
				    break;   

				case 0:
					System.out.println("�����մϴ�");
					current = false;
					break;
				}
				
				
			} catch (InputMismatchException ime) {
				System.out.println("����� �� ���� �Է��� �ּ���");
				myObj = new Scanner(System.in);
			}
		}
	}

}
