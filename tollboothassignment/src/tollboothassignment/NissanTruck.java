package tollboothassignment;

public class NissanTruck implements Truck{
	int ax,tw;

	public NissanTruck(int ax, int tw)
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
