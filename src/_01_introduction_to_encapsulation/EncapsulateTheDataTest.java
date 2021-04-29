package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {

	@Test
	void test() {
		EncapsulateTheData.setItemsReceived(0);
		assertEquals(0, EncapsulateTheData .getItemsReceived());
		EncapsulateTheData.setItemsReceived(-1);
		assertNotEquals(-1, EncapsulateTheData .getItemsReceived());
		EncapsulateTheData.setItemsReceived(-10);
		assertEquals(0, EncapsulateTheData .getItemsReceived());
	}
	@Test
	void test2(){
		EncapsulateTheData.setdegreesTurned(0);
		assertEquals(0, EncapsulateTheData .getdegreesTurned());
		EncapsulateTheData.setdegreesTurned(360);
		assertEquals(360, EncapsulateTheData .getdegreesTurned());
		EncapsulateTheData.setdegreesTurned(-10);
		assertNotEquals(-10, EncapsulateTheData .getdegreesTurned());
		EncapsulateTheData.setdegreesTurned(400);
		assertNotEquals(400, EncapsulateTheData .getdegreesTurned());
	}

	@Test
	void test3(){
		EncapsulateTheData.setnomenclature("Hello");
		assertEquals("Hello", EncapsulateTheData.getnomenclature());
		EncapsulateTheData.setnomenclature(" ");
		assertEquals(" ", EncapsulateTheData.getnomenclature());
		EncapsulateTheData.setnomenclature("");
		assertEquals(" ", EncapsulateTheData.getnomenclature());
	}
	
	@Test
	void test4(){
		EncapsulateTheData.setmemberObj(1);
		assertEquals(1, EncapsulateTheData.getmemberObj());
		EncapsulateTheData.setmemberObj(true);
		assertEquals(true, EncapsulateTheData.getmemberObj());
		EncapsulateTheData.setmemberObj("");
		Object newObj = EncapsulateTheData.getmemberObj();
		assertTrue(newObj instanceof Object);
		EncapsulateTheData.setmemberObj("Hello");
		Object newObj2 = EncapsulateTheData.getmemberObj();
		assertTrue(newObj2 instanceof Object);
		
	}
}
