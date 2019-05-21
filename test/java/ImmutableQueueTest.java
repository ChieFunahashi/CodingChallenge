import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableQueueTest {

    @Test
    public void enQueue01() {
        Queue<String> immutableQueue = new ImmutableQueue<>();
        immutableQueue.enQueue("test1");
        assertEquals(null,immutableQueue.head());
    }

    @Test
    public void enQueue02() {
        Queue<String> immutableQueue = new ImmutableQueue<>();
        immutableQueue = immutableQueue.enQueue("test1");
        assertEquals("test1",immutableQueue.head());
    }

    @Test
    public void deQueue() {
        Queue<String> immutableQueue = new ImmutableQueue<>();
        immutableQueue = immutableQueue.enQueue("test1");
        immutableQueue = immutableQueue.enQueue("test2");
        assertEquals("test1", immutableQueue.head());
        assertEquals("test2", immutableQueue.deQueue().head());
    }

    @Test
    public void headTest01() {
        Queue<String> immutableQueue = new ImmutableQueue<>();
        assertEquals(null, immutableQueue.head());
    }

    @Test
    public void headTest02() {
        Queue<String> immutableQueue = new ImmutableQueue<>();
        immutableQueue = immutableQueue.enQueue("test1");
        assertEquals("test1", immutableQueue.head());
    }

    @Test
    public void isEmptyTest01() {
        Queue<String> immutableQueue = new ImmutableQueue<>();
        assertEquals(true, immutableQueue.isEmpty());
    }

    @Test
    public void isEmptyTest02() {
        Queue<String> immutableQueue = new ImmutableQueue<>();
        immutableQueue = immutableQueue.enQueue("test1");
        assertEquals(false, immutableQueue.isEmpty());
    }
}