package edu.nashcc.sales;

public class DemoSalesperson2 {

	public static void main(String[] args) {
	
		Salesperson[] sp = new Salesperson[10];
		int ID[] = {111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
		double sales[] = {25000, 30000, 35000, 40000, 45000, 50000, 55000, 60000, 65000, 70000};
		
		for(int i = 0; i < 10; ++i){
			sp[i] = new Salesperson(ID[i], sales[i]);
		}
		
		for(int i = 0; i < 10; ++i){
		System.out.println(sp[i].getID() + " " + sp[i].getSales());
		}
		
	}

}
