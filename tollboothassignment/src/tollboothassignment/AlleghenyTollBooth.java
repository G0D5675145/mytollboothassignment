package tollboothassignment;

public class AlleghenyTollBooth implements TollBooth{

	private int tolldue;
	private int sum=0;
	private int c=1;

	@Override
	public void calculateToll(Truck truck) {
		tolldue = (truck.axlesCount()*5)+((truck.totalWeight()/500)*10);
		
	}

	@Override
	public void displayData(Truck truck) {
		
		System.out.println("Truck Arrival - Axles :"+truck.axlesCount()+"   Total Weight :"+truck.totalWeight()+" Kg"+"   Toll Due :$"+tolldue);
		sum=sum+tolldue;
		System.out.println("****************Collecting Receipts***************");
		System.out.println("Total since last collection - Receipts :$"+sum+"   Trucks :"+(c++));
		
	}

	@Override
	public void resetReceipt() {
		sum=0;
		c=0;
		System.out.println("*******************Reset Receipts*****************");
		System.out.println("Total since last collection - Receipts :$"+sum+"   Trucks :"+c);
		
	}
	
	public static void main(String[] args)
	{
		TollBooth booth=new AlleghenyTollBooth();
		
		Truck ford=new FordTruck(5,12000);
		Truck nissan=new NissanTruck(2,5000);
		Truck daewoo=new DaewooTruck(6,17000);
		
		System.out.println("Welcome to the Allegheny TollBooth");
		System.out.println();
		
		System.out.println("Arrival of Ford truck");
		booth.calculateToll(ford);
		booth.displayData(ford);
		System.out.println();
		
		System.out.println("Arrival of Nissan truck");
		booth.calculateToll(nissan);
		booth.displayData(nissan);
		System.out.println();
		
		System.out.println("Arrival of Daewoo truck");
		booth.calculateToll(daewoo);
		booth.displayData(daewoo);
		System.out.println();
		
		booth.resetReceipt();
		
		System.out.println();
		
		//System.out.println("Thanks for visiting :)");
		//System.out.println("Untill Next time!!");
	}

}
