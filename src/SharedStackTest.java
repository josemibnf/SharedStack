/*
JoséMiguel Avellana
Bogdan Dragan
 */

import static org.junit.Assert.*;


public class SharedStackTest {


    @org.junit.Test
    public void Push() throws StackError {
        SharedStack<Integer> test = new SharedStack<>();
        test =test.push(6);
        assertTrue(test.top() == 6);

    }


    @org.junit.Test
    public void pop() throws StackError {
        SharedStack<Integer> test = new SharedStack<>();
        test =test.push(6);
        test =test.push(4);
        test =test.pop();
        assertTrue(test.top() == 6);
    }

    @org.junit.Test
    public void top() throws StackError {
        SharedStack<Integer> test = new SharedStack<>();
        SharedStack<Integer> testpush =test.push(7);
        int actual = testpush.top();
        int espera = 7;
        assertEquals(actual, espera);

    }

    @org.junit.Test
    public void isEmpty(){
        SharedStack<Integer> empty = new SharedStack<>();
        assertTrue(empty.isEmpty());
        SharedStack<Integer> notEmpty = new SharedStack<>();
        notEmpty =notEmpty.push(6);
        assertFalse(notEmpty.isEmpty());

    }
}