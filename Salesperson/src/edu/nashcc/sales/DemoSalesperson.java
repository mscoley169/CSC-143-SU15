package edu.nashcc.sales;

public class DemoSalesperson {

	public static void main(String[] args) {

		Salesperson[] sp = new Salesperson[10];
		
		for(int i = 0; i < 10; ++i){
			sp[i] = new Salesperson(9999, 0);
		}
		
		for(int i = 0; i < 10; ++i){
		System.out.println(sp[i].getID() + " " + sp[i].getSales());
		}
		
	}

}
