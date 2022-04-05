/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1ChuyenDe;

import org.junit.internal.Checks;

/**
 *
 * @author DELL
 */
public class ChuyenDe {
    private String macd;
    private String tencd;
    private double hocphi;
    private int thoiluong;
    private String hinh;
    private String mota;

    public ChuyenDe() {
    }

    public ChuyenDe(String macd, String tencd, double hocphi, int thoiluong, String hinh, String mota) {
        this.macd = macd;
        this.tencd = tencd;
        this.hocphi = hocphi;
        this.thoiluong = thoiluong;
        this.hinh = hinh;
        this.mota = mota;
    }

    public String getMacd() {
        return macd;
    }

    public void setMacd(String macd) {
    	if (macd == null) {
			throw new IllegalArgumentException("mcd không được null");
		}
    	else if (macd.length() < 3) {
    		throw new IllegalArgumentException("mcd lớn hơn 3 ký tự");
		}
    	
//    	if (!macd.matches("^[a-ZA-0-9]+$")) {
//    		throw new IllegalArgumentException("mcd không chứa các ký tự đặc biệt ");
//		}
    	
    	else if (macd.length() >15) {
    		throw new IllegalArgumentException("mcd nhỏ hơn 15 ký tự ");
		}
    	
    	
        this.macd = macd;
        
    }

    public String getTencd() {
        return tencd;
    }

    public void setTencd(String tencd) {
    	if (tencd == null) {
			throw new IllegalArgumentException("Tencd khong duoc null");
			
		}
    	else if (!tencd.matches("^[a-zA-Z0-9]+$") ) {
			throw new IllegalArgumentException("Tencd phai la chu or so");
			
		}
    	else if (tencd.length() > 10) {
			throw new IllegalArgumentException("Tencd nho hon 10 ky tu");
			
		}
    
    	
    	
        this.tencd = tencd;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
    	if (hocphi < 0 ) {
			throw new IllegalArgumentException("hocphi khong duoc nho hon 0");
			
		}
    	else if (!String.valueOf(hocphi).matches("^[0-9]+$") ) {
			throw new IllegalArgumentException("hocphi phai la so");
			
		}
    	else if (hocphi > Double.MAX_VALUE  ) {
			throw new IllegalArgumentException("hocphi khong hop le");
			
		}
        this.hocphi = hocphi;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
    	if (thoiluong < 0 ) {
			throw new IllegalArgumentException("thoiluong khong duoc nho hon 0");
			
		}
    	else if (!String.valueOf(thoiluong).matches("^[0-9]+$") ) {
			throw new IllegalArgumentException("thoiluong phai la so");
			
		}
    	
    	else if (String.valueOf(thoiluong) == null) {
			throw new IllegalArgumentException("thoiluong khong duoc null");
			
		}
   	
        this.thoiluong = thoiluong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
    	if (hinh == null) {
			throw new IllegalArgumentException("Hinh khong duoc phep null");
			
		}

    	
        this.hinh = hinh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
    	if (mota == null) {
			throw new IllegalArgumentException("Mota khong duoc phep null");
			
		}
    	else if (mota.length() >25 ) {
			throw new IllegalArgumentException("Mota nho hon 25 ky tu");
			
		}
        this.mota = mota;
    }
    

}
