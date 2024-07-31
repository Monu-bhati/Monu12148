package Plan;

public class SelectNetworkPlan {

	public CellularPlan getPlan(String PlanType) {
		if(PlanType==null) {
		return null;
		}
		if(PlanType.equalsIgnoreCase("ThreeG")) {
			return new ThreeG();
		}
		if(PlanType.equalsIgnoreCase("FourG")) {
			return new FourG();
		}
		
		
		return null;
	}
}
