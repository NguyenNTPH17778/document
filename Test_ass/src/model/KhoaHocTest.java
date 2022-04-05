package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;
import org.testng.annotations.Test; 

@Generated(value = "org.junit-tools-1.1.0")
public class KhoaHocTest {
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
 public	ExpectedException ex = ExpectedException.none();

	@Test
	public void TestThoiLuong () {
		int tl = 90;
		kh.setThoiLuong(tl);
		assertEquals(90, kh.getThoiLuong());
		
	}
	//Test Hoc Phi
	@Test
	public void TestHocPhi () {
		int hp = 40;
		kh.setHocPhi(hp);
		assertEquals(40, kh.getHocPhi());
		
	}
	
	//Test SoLuong
	@Test
	public void TestSoluong () {
		int sl = 20;
		kh.setSoHV(sl);
		assertEquals(20, kh.getSoHV());
		
	}
	
	//Test Ten
	@Test
	public void TestTen () {
		String ten = "hello";
		kh.setTenKH(ten);
		assertEquals("hello", kh.getTenKH());
		
	}
	
	//Test Ma
	@Test
	public void TestMa () {
		
		int ma = 1;
	try {
		kh.setMaKH(ma);
	} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
		
	}

}