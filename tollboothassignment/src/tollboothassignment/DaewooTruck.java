package tollboothassignment;

public class DaewooTruck implements Truck{
	int ax,tw;
	public DaewooTruck(int ax, int tw)
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
