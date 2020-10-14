package test;

import com.pa.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetName(){
        Person p1 = new Person(1,"aaa");
        assertEquals(p1.getName(), "aaa");

    }
}
