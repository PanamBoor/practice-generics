package org.itstep.step01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectPairDriverTest {

	@Test
	  public void testObjectPairDriverLargestStadiumLargestAtEnd() {
	    ObjectPair[] stadiums = new ObjectPair[3];
	    stadiums[0] = new ObjectPair("A", 1);
	    stadiums[1] = new ObjectPair("B", 2);
	    stadiums[2] = new ObjectPair("C", 3);
	    assertEquals("C", ObjectPairDriver.largestStadium(stadiums));
	  }

	  @Test
	  public void testObjectPairDriverLargestStadiumLargestAtStart() {
	    ObjectPair[] stadiums = new ObjectPair[3];
	    stadiums[0] = new ObjectPair("A", 3);
	    stadiums[1] = new ObjectPair("B", 2);
	    stadiums[2] = new ObjectPair("C", 1);
	    assertEquals("A", ObjectPairDriver.largestStadium(stadiums));
	  }

	  @Test
	  public void testObjectPairDriverLargestStadiumLargestInMiddle() {
	    ObjectPair[] stadiums = new ObjectPair[3];
	    stadiums[0] = new ObjectPair("A", 3);
	    stadiums[1] = new ObjectPair("B", 1);
	    stadiums[2] = new ObjectPair("C", 2);
	    assertEquals("A", ObjectPairDriver.largestStadium(stadiums));
	  }

}
