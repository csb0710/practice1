package Calendar;
import java.util.Scanner;

public class Prompt {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
		
	    System.out.println("�⵵�� �Է��ϼ��� :");
	    int year = Integer.parseInt(myObj.nextLine());
	    
	    System.out.println("���� �Է��ϼ��� :");
	    int month = Integer.parseInt(myObj.nextLine());
	    
		Calendar calendar = new Calendar();
		calendar.print_calendar(year, month);

	}

}
