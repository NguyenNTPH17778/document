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
public class KhoaHocTestNgoaiLe {


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

		//test thoiluong
		@Test
		public void Testthoiluong120() {
			try {
				int thoiluong = 130;
//				ex.expect(IllegalArgumentException.class);
				kh.setThoiLuong(thoiluong);
				assertEquals(thoiluong, kh.getThoiLuong());
				fail("Khong bat duoc ngoai le");
			} catch (Exception e) {
				System.out.println(e.getMessage());			
			}

		}
		
		//test hocphi
		@Test
		public void TestHocPhi50() {
			try {
				int hocphi = 60;
		//		ex.expect(IllegalArgumentException.class);
				kh.setHocPhi(hocphi);
				assertEquals(hocphi, kh.getHocPhi());
				fail("Khong bat duoc ngoai le");
			} catch (Exception e) {
				System.out.println(e.getMessage());
					
			}

		}

		//test soluongHV
		@Test
		public void TestHocVien25() {
			try {
				int sohv = 30;
				kh.setSoHV(sohv);
				assertEquals(sohv, kh.getSoHV());
				fail("Khong bat duoc ngoai le");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}


		//test maKH
		@Test
		public void TestMaKHNull() {
			try {
				String makh = null;
				kh.setMaKH(Integer.parseInt(makh));
				assertEquals(Integer.parseInt(makh), kh.getMaKH());
				fail("Khong bat duoc ngoai le");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		@Test
		public void TestMaKH0() {
			try {
				int makh = -1;
				kh.setMaKH(makh);
				assertEquals(makh, kh.getMaKH());
				fail("Khong bat duoc ngoai le");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		//test tenKH
		@Test
		public void TestTenKHNull() {
			try {
				String ten = null;
				kh.setTenKH(ten);
				assertEquals(ten, kh.getTenKH());
				fail("Khong bat duoc ngoai le");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		@Test
		public void TestTenKHKyTuDB() {
			try {
				String ten = "*(&^%$#@^%)";
				kh.setTenKH(ten);
				assertEquals(ten, kh.getTenKH());
				fail("Khong bat duoc ngoai le");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
}
