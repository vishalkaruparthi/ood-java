package com.ood.cp.sp;

public class SingeltonPattern {
	private static SingeltonPattern instance;
	private SingeltonPattern(){	}
	
//	public static synchronized SingeltonPattern getInstance(){
//		if(instance == null){
//			instance = new SingeltonPattern();
//		}
//		return instance;
//	}
	/*
	 * synchronized is used to handle multithreaded environment
	 * Pushing synchronized into the method to make sure that this executes only once(while creating instance)
	 */
	public static SingeltonPattern getInstance(){
		if(instance == null){
			synchronized (SingeltonPattern.class) {
				if(instance == null){
					instance = new SingeltonPattern(); 
				}
			}
		}
		return instance;
	}
	
	public void doIdentify(){
		System.out.println("I am a singleton!!!");
	}
	
}
