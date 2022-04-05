package BussinessLayer.Entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the admins database table.
 * 
 */
@Entity
@Table(name="admins")
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_ad")
	private int idAd;

	private String diachi;

	private String email;

	private String hoten;

	private String password;

	private String sdt;

	@Lob
	private String tentk;

	//bi-directional many-to-one association to Staff
	@OneToMany(mappedBy="admin")
	private List<Staff> staffs;

	public Admin() {
	}

	public int getIdAd() {
		return this.idAd;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoten() {
		return this.hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getTentk() {
		return this.tentk;
	}

	public void setTentk(String tentk) {
		this.tentk = tentk;
	}

	public List<Staff> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}

	public Staff addStaff(Staff staff) {
		getStaffs().add(staff);
		staff.setAdmin(this);

		return staff;
	}

	public Staff removeStaff(Staff staff) {
		getStaffs().remove(staff);
		staff.setAdmin(null);

		return staff;
	}

}