package Calendar;
import java.util.ArrayList;

public class PlanItem {
	ArrayList<String> all_plan = new ArrayList<>();
	
	public PlanItem(String plan) {
		all_plan.add(plan);
	}
	
	public void add_plan(String plan) {
		all_plan.add(plan);
	}
	
	public void get_component_number() {
		System.out.println(all_plan.size() + "개의 일정이 있습니다");
	}
	
	public void print_plan() {
		System.out.println("---일정---");
		for(int i = 0; i < all_plan.size(); i++)
			System.out.println(all_plan.get(i));
		System.out.println("---------");
	}
}
