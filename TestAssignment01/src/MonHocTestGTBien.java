import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

@Generated(value = "org.junit-tools-1.1.0")

public class MonHocTestGTBien {


		MonHoc mh;

		@Before
		public void Init() {
			mh = new MonHoc();
		}

		@After
		public void Destroy() {
			mh = null;
		}

		@Rule
		public ExpectedException ex = ExpectedException.none();
		
		@Test 
		public void TestThoiLuong() {
			ex.expect(IllegalArgumentException.class);
			mh.setThoiLuong(0);
			mh.setThoiLuong(1);
			mh.setThoiLuong(-1);
			mh.setThoiLuong(120);
			mh.setThoiLuong(121);
		}
		
		@Test 
		public void TestHocPhi() {
			ex.expect(IllegalArgumentException.class);
			mh.setThoiLuong(0);
			mh.setThoiLuong(1);
			mh.setThoiLuong(-1);
			mh.setThoiLuong(50);
			mh.setThoiLuong(51);
		}
		@Test 
		public void TestSoLuongHV() {
			ex.expect(IllegalArgumentException.class);
			mh.setSoHV(0);
			mh.setSoHV(1);
			mh.setSoHV(25);
			mh.setSoHV(26);
		}
		
		@Test 
		public void TestTenMH() {
			String ten = "hi";
			try {
				mh.setTenMH(ten);
				fail("Không bắt được ngoại lệ");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		@Test 
		public void TestMaMH0() {
			ex.expect(IllegalArgumentException.class);
			mh.setMaMH(-1);
			mh.setMaMH(0);

			
		}
}

	
