import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class MonHocTest {
	
	MonHoc mh ;
	
	@Before
	public void Init() {
		mh = new MonHoc();
	}
	
	@After
	public void Destroy() {
		mh = null;
		
	}
	
	@Rule public ExpectedException ex = ExpectedException.none();
	
	//Test ma
	@Test
	public void TestMa() {
		int ma = 88; 
		mh.setMaMH(ma);
		assertEquals(88, mh.getMaMH());
	}
	

	@Test
	public void TestTen() {
		String ten = "Nguyen"; 
		mh.setTenMH(ten);
		assertEquals("Nguyen", mh.getTenMH());
	}
	

	@Test
	public void TestThoiLuong() {
		int tl = 88; 
		mh.setThoiLuong(tl);
		assertEquals(88, mh.getThoiLuong());
	}
	

	@Test
	public void TestHocPhi() {
		double hp = 15.8; 
		mh.setHocPhi(hp);
		assertEquals(15.8, mh.getHocPhi());
	}
	

	@Test
	public void TestSoHV() {
		int sohv = 30; 
		mh.setSoHV(sohv);
		assertEquals(30, mh.getSoHV());
	}

}