package Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Calendar {
	int year = 0;
	int month = 0;
	int start = 0;
	static int[] maxDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	HashMap<Date, PlanItem> datePlan = new HashMap<>();
	
	public void add_datePlan(String date, String plan) {
		Date new_date = getDatefromString(date);
		if(datePlan.containsKey(new_date)) {
			datePlan.get(new_date).add_plan(plan);
		}
		else {
			PlanItem newPlan = new PlanItem(plan);
			datePlan.put(new_date, newPlan);
		}
	}
	
	public void get_datePlan(String date) {
		Date new_date = getDatefromString(date);
		if(datePlan.containsKey(new_date)) {
			PlanItem plan = datePlan.get(new_date);
			plan.get_component_number();
			plan.print_plan();
		}
		else
			System.out.println("일정이 존재하지 않습니다");
	}
	
	public void delete_datePlan(String date) {
		Date new_date = getDatefromString(date);
		if(datePlan.containsKey(new_date)) { 
			datePlan.remove(new_date);
			System.out.println(date + "의 일정이 삭제되었습니다");
		}
	}
	
	public static Date getDatefromString(String strDate) {
		Date date = null;
		try {
			date= new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static int get_first_day(int year, int month) {
		int sum = (year - 1) * 365;
		
		if(month == 1) {}
		else
			for(int i = 0; i < month-1; i++)
				sum += maxDay[i];
		return sum % 7;
	}
	
	public void print_calendar(int year, int month) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			maxDay[1] = 29;
		}
		start = get_first_day(year, month);
		
		int current = 1;
		String week = "";
		int count = 0;
		
		System.out.println("--------------------------");
		System.out.println("       " + year + "년   " + month + "월");
		System.out.println("--------------------------");
		System.out.println("MO  TU  WE  TH  FR  SA  SU");
		
		for (count = 0; count < start; count++)
			week = week + "    ";
		
		for(current = 1; current <= maxDay[month-1]; current++) {
			if((int)(Math.log10(current)+1) == 1)
				week = week + current + "   ";
			else
				week = week + current + "  ";
			if(((count + 1) % 7) == 0) {
				System.out.println(week);
				week = "";
			}
			count++;
		}
		
		if(!week.equals(""))
			System.out.println(week);
		System.out.println("--------------------------");
	}
}
