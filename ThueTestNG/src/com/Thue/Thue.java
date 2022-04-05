package com.Thue;

public class Thue {
	public  double ThueMy(double luong) {
		 if( luong < 0 && luong <5) {
			 return luong * 0.05;
				
			}
		 
		 else if(luong > 5 && luong <10) {
			 return luong * 0.1;
		} 
		 else if(luong > 10 && luong <18) {
				return luong * 0.15;
			}
		 else if(luong > 18 && luong <32) {
				return luong * 0.2;
			}
		 else if(luong > 32 && luong <52) {
				return luong * 0.25;
			}
		 else if(luong > 52 && luong <80) {
				return luong * 0.3;
			}
		 else {
			 return luong * 0.35;
		 }
	
				
	
	}
}
