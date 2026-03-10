package task14;

public class Car extends vehicle  {
	double seats;

	public Car(int vid, String modelname, double baserent, double seats) {
		super(vid, modelname, baserent);
		this.seats = seats;
	}
	public double calculaterent() {
		double totalrent=baserent+(seats*100);
		return totalrent;
		
	}

}

