package com.ood.dp.dip;

public class Manager {
	IWorker worker;
	
	public void setWorker(IWorker w){
		worker = w;
	}
	
	public void manage(){
		worker.doWork();
	}
	
	public static void main(String[] arg){
		SuperWorker s = new SuperWorker();
		Manager m = new Manager();
		m.setWorker(s);
		m.manage();
		
		Worker w = new Worker();
		Manager m1 = new Manager();
		m1.setWorker(w);
		m1.manage();
	}
}
