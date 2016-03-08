package com.ood.cp.sp;

public class MainClass {
	public static void main(String[] args){
		SingeltonPattern s = SingeltonPattern.getInstance();
		s.doIdentify();
	}
}
