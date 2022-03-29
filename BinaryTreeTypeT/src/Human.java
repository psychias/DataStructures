
public class Human {
	private String name;
	private double heigth;
	
	
	
	public Human(String name, double heigth) {
		super();
		this.name = name;
		this.heigth = heigth;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getHeigth() {
		return heigth;
	}



	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public String toString() {
		return "Humman [name=" + name + ", heigth=" + heigth + "]";
	}
	
}
