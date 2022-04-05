
public class MonHoc {
	private int maMH; 
	private String tenMH; 
	private int thoiLuong; 
	private double hocPhi; 
	private String ghiCHu; 
	private int soHV; 
	
	public MonHoc() {
		// TODO Auto-generated constructor stub
	}

	
	
	public int getMaMH() {
		return maMH;
	}

	public void setMaMH(int maMH) {
		if(String.valueOf(maMH) == null) {
			throw new IllegalArgumentException("MaMH khong duoc null ");
		}
		
		else if(maMH <0 ) {
			throw new IllegalArgumentException("MaMH khong duoc < 0 ");
		}
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		if(tenMH == null) {
			throw new IllegalArgumentException("tenMH khong duoc null");
		}
		else if(!tenMH.matches("^[a-zA-Z0-9]+$")) {
			throw new IllegalArgumentException("tenMH khong chua ky tu dac biet");
		}
		this.tenMH = tenMH;
	}

	public int getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		if(thoiLuong <= 0 ) {
			throw new IllegalArgumentException("thoiluong > 0");
		}
		else if(thoiLuong > 90 ) {
			throw new IllegalArgumentException("thoiluong phai <90");
		}
		this.thoiLuong = thoiLuong;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		if(hocPhi <= 0 || hocPhi > 20) {
			throw new IllegalArgumentException("hocPhi khong kha dung");
		}
		this.hocPhi = hocPhi;
	}

	public String getGhiCHu() {
		return ghiCHu;
	}

	public void setGhiCHu(String ghiCHu) {
	
		this.ghiCHu = ghiCHu;
	}

	public int getSoHV() {
		return soHV;
	}

	public void setSoHV(int soHV) {
		if(soHV <= 0 || soHV > 40) {
			throw new IllegalArgumentException("soHV khong kha dung");
		}
		this.soHV = soHV;
	}


	
}
