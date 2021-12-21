package Calendar;
import java.util.ArrayList;

public class PlanItem {
	String plan;
	ArrayList<String> all_plan = new ArrayList<>();
	
	public PlanItem(String plan) {
		this.plan = plan;
		all_plan.add(plan);
	}
	
	public void add_plan(String plan) {
		all_plan.add(plan);
	}
	
	public int get_component_number() {
		return all_plan.size();
	}
	
	public void print_plan() {
		for(int i = 0; i < all_plan.size(); i++)
			System.out.println(all_plan.get(i));
	}
}
