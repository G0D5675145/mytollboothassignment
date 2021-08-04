package tollboothassignment;

public class FordTruck  implements Truck{
	int ax,tw;

	public FordTruck(int ax, int tw)
	{
		this.ax=ax;
		this.tw=tw;
	}

	@Override
	public int axlesCount() {
		
		return ax;
	}

	@Override
	public int totalWeight() {
		
		return tw;
	}
	

}
