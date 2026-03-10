package task14;

public class Bike extends vehicle {
	double enginecapacity;

	public Bike(int vid, String modelname, double baserent, double enginecapacity) {
		super(vid, modelname, baserent);
		this.enginecapacity = enginecapacity;
	}
	public double calculaterent() {
		double totalrent=baserent+(enginecapacity*2);
		return totalrent;
	}

}
