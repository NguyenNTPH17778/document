package model;

public class KhoaHoc {
	private int maKH;
	private String tenKH;
	private int thoiLuong;
	private int hocPhi;
	private String ghiChu;
	private int soHV;
	
	public KhoaHoc() {
		// TODO Auto-generated constructor stub
	}

	public KhoaHoc(int maKH, String tenKH, int thoiLuong, int hocPhi, String ghiChu, int soHV) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.thoiLuong = thoiLuong;
		this.hocPhi = hocPhi;
		this.ghiChu = ghiChu;
		this.soHV = soHV;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		if(String.valueOf(maKH) == null ) {
			throw new IllegalArgumentException("maKH khong duoc null");
		}
		else if(maKH <= 0  ) {
			throw new IllegalArgumentException("maKH khong duoc < 0");
		}
		else if(maKH>Integer.MAX_VALUE) {
			throw new IllegalArgumentException("maKH khong hop le");
		}
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		if (tenKH == null) {
			throw new IllegalArgumentException("tenKH khong duoc null");
		}
		
		else if (!tenKH.matches("^[a-zA-Z0-9]+$")) {
			throw new IllegalArgumentException("tenKH khong chua ky tu dac biet");
		}
		this.tenKH = tenKH;
	}

	public int getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		
		if( thoiLuong > 120 || thoiLuong <= 0 ) {
			throw new IllegalArgumentException("Thoiluong khong kha dung ");
		}

		this.thoiLuong = thoiLuong;
	}

	public int getHocPhi() {
		
		return hocPhi;
	}

	public void setHocPhi(int hocPhi) {
		if( hocPhi > 50 || hocPhi <= 0  ) {
			throw new IllegalArgumentException("hocphi khong kha dung ");
		}

		this.hocPhi = hocPhi;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public int getSoHV() {
		return soHV;
	}

	public void setSoHV(int soHV) {
		if(soHV  > 25 || soHV <= 0) {
			throw new IllegalArgumentException("soHV khong kha dung ");
		}

		this.soHV = soHV;
	}
	
	
	
}
