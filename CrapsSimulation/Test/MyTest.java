



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MyTest
{
	 
	@Test
	 void Dietest1()
	{
		assertEquals("Die.testStatic()", Die.testStatic());
		Die test1 = new Die();
		
	}
	@Test
	 void CrookedDie1test2()
	{
		assertEquals("CrookedDie1.testStatic()", CrookedDie1.testStatic());
		Die test2 = new CrookedDie1();
	}


}
