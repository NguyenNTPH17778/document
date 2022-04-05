package beans.form_data.java;

public class RegisterData {
	private String hoTen;
	private String email;
	private String password;
	private String sdt;
	private int gioiTinh;
	private int loaiKH;
	//getter & setter
	public RegisterData() {
		
	}
	public RegisterData(String hoTen, String email, String password, String sdt, int gioiTinh, int loaiKH) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.password = password;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
		this.loaiKH = loaiKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getLoaiKH() {
		return loaiKH;
	}
	public void setLoaiKH(int loaiKH) {
		this.loaiKH = loaiKH;
	}
}
