package kkkk;

public class Student {
	 private String maSv;
	 private String hoTen; 
	private String  gioiTinh;
	private String chuyenNganh;
	private String sdt;
	private String email;
	private String thoiGian;
	
	public Student() {

		
	}
	
	
	
	public Student(String maSv, String hoTen, String gioiTinh, String chuyenNganh, String sdt, String email,
			String thoiGian) {
		super();
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.chuyenNganh = chuyenNganh;
		this.sdt = sdt;
		this.email = email;
		this.thoiGian = thoiGian;
	}



	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}



	@Override
	public String toString() {
		return "Student [maSv=" + maSv + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", chuyenNganh=" + chuyenNganh
				+ ", sdt=" + sdt + ", email=" + email + ", thoiGian=" + thoiGian + "]";
	}
	
	
	
}
