import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")
public class MocHocTestNgoaiLe {

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
		
		
		//Test ThoiLuong	
		public void TestThoiLuongAm() {
			try {
				int tl = -1; 
				mh.setThoiLuong(tl);
				assertEquals(tl, mh.getThoiLuong());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void TestThoiLuong90() {
			try {
				int  tl = 100;
				mh.setThoiLuong(tl);
				assertEquals(tl, mh.getThoiLuong());
				fail("Khong bat duoc ngoai le");	
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		

		//Test HocPhi
				public void TestHocPhi20() {
					try {
						int  hp = 30;
						mh.setHocPhi(hp);
						assertEquals(hp, mh.getHocPhi());
						fail("Khong bat duoc ngoai le");	
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
				}
				
			//Test SoHV
			public void TestSoHV() {
					try {
						int  sohv = 30;
						mh.setSoHV(sohv);
						assertEquals(sohv, mh.getSoHV());
						fail("Khong bat duoc ngoai le");	
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
				}

		
		//Test ma
		@Test
		public void TestMa0() {
			try {
				int ma = -1;
				mh.setMaMH(ma);
				assertEquals(ma, mh.getMaMH());
				fail("Khong bat duoc ngoai le");	
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		@Test
		public void TestMaNull() {
			try {
				String  ma = null;
				mh.setMaMH(Integer.parseInt(ma));
				assertEquals(Integer.parseInt(ma), mh.getMaMH());
				fail("Khong bat duoc ngoai le");	
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		//Test Ten
		@Test
		public void TestTenNull() {
			try {
				String  ten = null;
				mh.setTenMH(ten);
				assertEquals(ten, mh.getTenMH());
				fail("Khong bat duoc ngoai le");	
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test
		public void TestTenKTDB() {
			try {
				String  ten = "*&^%()*$#@";
				mh.setTenMH(ten);
				assertEquals(ten, mh.getTenMH());
				fail("Khong bat duoc ngoai le");	
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
	

}

