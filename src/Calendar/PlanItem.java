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
		System.out.println(all_plan.size() + "���� ������ �ֽ��ϴ�");
	}
	
	public void print_plan() {
		System.out.println("---����---");
		for(int i = 0; i < all_plan.size(); i++)
			System.out.println(all_plan.get(i));
		System.out.println("---------");
	}
}
