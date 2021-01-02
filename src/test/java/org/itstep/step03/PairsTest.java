package org.itstep.step03;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


class PairsTest {

    @Test
    public void testPairsAddThenIterateWithinCapacity() {
        fail("Раскомментируйте тест после реализации класса Pairs");
//        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
//        for (int i = 0; i < 10; i++) {
//            pairs.addPair("A" + i, i);
//        }
//
//        int i = 0;
//        for (Pair<String, Integer> pair : pairs) {
//            assertEquals(pair.getFirst(), "A" + i);
//            assertEquals(pair.getSecond(), Integer.valueOf(i));
//            i++;
//        }
    }

    @Test
    public void testPairsAddBeyondCapacity() {
        fail("Раскомментируйте тест после реализации класса Pairs");
//        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
//        for (int i = 0; i < 10; i++) {
//            assertTrue(pairs.addPair("A" + i, i));
//        }
//
//        assertFalse(pairs.addPair("B", 20));
//
//        int i = 0;
//        for (Pair<String, Integer> pair : pairs) {
//            assertEquals(pair.getFirst(), "A" + i);
//            assertEquals(pair.getSecond(), Integer.valueOf(i));
//            i++;
//        }
//        assertEquals(10, i);
    }

    @Test
    public void testPairsRemove() {
        fail("Раскомментируйте тест после реализации класса Pairs");
//        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
//        for (int i = 0; i < 10; i++) {
//            assertTrue(pairs.addPair("A" + i, i));
//        }
//
//        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
//        while (iterator.hasNext()) {
//            Pair<String, Integer> pair = iterator.next();
//            /* Remove any with an even second value */
//            if ((pair.getSecond() % 2) == 0) {
//                iterator.remove();
//            }
//        }
//
//        int i = 1;
//        for (Pair<String, Integer> pair : pairs) {
//            assertEquals(pair.getFirst(), "A" + i);
//            assertEquals(pair.getSecond(), Integer.valueOf(i));
//            i += 2;
//        }
//        assertEquals(11, i);
    }


    @Test
    public void testPairsDoubleRemoveThrowsException() {
        fail("Раскомментируйте тест после реализации класса Pairs");
//        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
//        for (int i = 0; i < 15; i++) {
//            pairs.addPair("A" + i, i);
//        }
//
//        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
//        iterator.next();
//        iterator.remove();
//        assertTrue(true); // fail if we don't get this far.
//        assertThrows(IllegalStateException.class, () -> iterator.remove());

    }

    @Test
    public void testPairsExceptionIfNextCalledWithNoMoreElements() {
        fail("Раскомментируйте тест после реализации класса Pairs");
//        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
//
//        pairs.addPair("A", 1);
//
//        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
//        iterator.next();
//        assertTrue(true); // fail if we don't get this far.
//        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }

}
