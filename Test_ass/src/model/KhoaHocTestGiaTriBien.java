package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class KhoaHocTestGiaTriBien {

	KhoaHoc kh;

	@Before
	public void Init() {
		kh = new KhoaHoc();
	}

	@After
	public void Destroy() {
		kh = null;
	}

	@Rule
	public ExpectedException ex = ExpectedException.none();
	
	@Test 
	public void TestThoiLuong() {
		ex.expect(IllegalArgumentException.class);
		kh.setThoiLuong(0);
		kh.setThoiLuong(1);
		kh.setThoiLuong(-1);
		kh.setThoiLuong(120);
		kh.setThoiLuong(121);
	}
	
	@Test 
	public void TestHocPhi() {
		ex.expect(IllegalArgumentException.class);
		kh.setThoiLuong(0);
		kh.setThoiLuong(1);
		kh.setThoiLuong(-1);
		kh.setThoiLuong(50);
		kh.setThoiLuong(51);
	}
	@Test 
	public void TestSoLuongHV() {
		ex.expect(IllegalArgumentException.class);
		kh.setSoHV(0);
		kh.setSoHV(1);
		kh.setSoHV(25);
		kh.setSoHV(26);
	}
	
	@Test 
	public void TestTenKH() {
		String TenKH = "hi";
		try {
			kh.setTenKH(TenKH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("tenKH 3-50 ký tự và không chứa ký tự đặc biệt !", e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	@Test 
	public void TestMaKHN0() {
		ex.expect(IllegalArgumentException.class);
		kh.setMaKH(-1);
		kh.setSoHV(0);

		
	}
}
