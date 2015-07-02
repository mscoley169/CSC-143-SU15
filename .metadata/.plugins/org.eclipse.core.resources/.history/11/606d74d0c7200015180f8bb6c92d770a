package edu.nashcc.cars;

public class Ford extends Auto {

	private String model;
	public Ford() {
		super("Ford");
	}
	public void setPrice(int price){
	this.price = price;	
	}
	public String modelOptions(){
		StringBuilder sb = new StringBuilder();
		sb.append("1 - Fiesta\n");
		sb.append("2 - Explorer\n");
		
		return sb.toString();
	}
	public void setModel(String choice){
		switch(choice){
		case "1":
			this.model = "Fiesta";
			setPrice(22000);
			break;
		case "2":
			this.model = "Explorer";
			setPrice(19000);
			break;
		default:
			this.model = "";
		}
	}
	public String getModel(){
		return model;
	}
}
