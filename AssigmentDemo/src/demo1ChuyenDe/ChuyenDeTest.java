package demo1ChuyenDe;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class ChuyenDeTest{
	
//	Runnable runnable = new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//	};
	
	ChuyenDe cd;
	@Before
	public void Init() {
		cd = new ChuyenDe();
		
	}
	
	@After
	public void Destroy() {
		cd = null;
		
	}
	
	@Rule public ExpectedException  ex = ExpectedException.none();
		
	
	//Test MaCd
	
	@Test
	public void TestMaCDNull() {
		try {
			String macdString = null;
//			ex.expect(IllegalArgumentException.class);
			cd.setMacd(macdString);
			assertEquals(macdString, cd.getMacd());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	@Test
	public void TestMaCDNho3() {
		String macdString = "Hi" ;
		try {
			cd.setMacd(macdString);
			assertEquals(macdString, cd.getMacd());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void TestMaCDKL15() {
		String macdString = "Hhjdhfkjhgdgfhjyf" ;
		try {
			cd.setMacd(macdString);
			assertEquals(macdString, cd.getMacd());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	//Test TenCd
	@Test
	public void TestTenCDNull() {
		String tencd = null ;
		try {
			cd.setTencd(tencd);
			assertEquals(tencd, cd.getTencd());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void TestTenCDDChuSo() {
		String tencd = "!@#&*^%$#(())" ;
		try {
			cd.setTencd(tencd);
			assertEquals(tencd, cd.getTencd());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void TestTenCD10() {
		String tencd = "phhhhjjjkhui" ;
		try {
			cd.setTencd(tencd);
			assertEquals(tencd, cd.getTencd());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	//Test HocPhi
	@Test
	public void TestHocPhiCDbe0() {
		double hocphi = -1.7 ;
		try {
			cd.setHocphi(hocphi);
			assertEquals(hocphi, cd.getHocphi());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void TestHocPhiCDKPSo() {
		String hocphi = "888";
		try {
			cd.setHocphi(Double.parseDouble(hocphi));
			assertEquals(Double.parseDouble(hocphi), cd.getHocphi());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void TestHocPhiCDKHL() {
		double hocphi = 4000 ;
		try {
			cd.setHocphi(hocphi);
			assertEquals(hocphi, cd.getHocphi());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	//Test ThoiLuong
	@Test
	public void TestThoiLuong0() {
		int thoiluong = -1 ;
		try {
			cd.setThoiluong(thoiluong);
			assertEquals(thoiluong, cd.getThoiluong());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
//	@Test
//	public void TestThoiLuongKPLSo() {
//		String thoiluong = "50" ;
//		try {
//			cd.setThoiluong(Integer.parseInt(thoiluong));
//			assertEquals(Integer.parseInt(thoiluong), cd.getThoiluong());
//			fail("Không bắt được ngoại lệ");
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
	
	//Test Hinh
	
//	public void TestHinhNull() {
//		String hinh = "88" ;
//		try {
//			cd.setHinh(hinh);
//			assertEquals(hinh, cd.getHinh());
//			fail("Không bắt được ngoại lệ");
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
	
	
	//Test mota
	@Test
	public void TestMotaNull() {
		String mota = null ;
		try {
			cd.setMota(mota);
			assertEquals(mota, cd.getMota());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void TestMota250() {
		String mota = "ghgjhkughjfthdjfhyufjhgydh" ;
		try {
			cd.setMota(mota);
			assertEquals(mota, cd.getMota());
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}