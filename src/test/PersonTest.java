package test;

import com.pa.Group;
import com.pa.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetName(){
        Person p1 = new Person(1,"aaa");
        assertEquals(p1.getName(), "aaa");
    }

    @Test
    public void testGetId(){
        Person p1 = new Person(1,"Nuno");
        assertEquals(p1.getId(),1);
    }

    @Test
    public void testAddMember(){
        Person p1 = new Person(1,"Nuno");
        Person p2 = new Person(2,"Maria");

        Group g1 = new Group(p2);
        g1.addMember(p1);
        g1.addMember(p2);
    }

    @Test
    public void testDeleteMember(){
        Person p1 = new Person(1, "Nuno");
        Person p2 = new Person(2, "Maria");

        Group g1 = new Group(p1);
        g1.deleteMember(p2);
    }

    @Test
    public void changeChief(){
        Person p1 = new Person(1, "Nuno");
        Person p2 = new Person(2, "Maria");

        Group g1 = new Group(p1);
        g1.addMember(p2);
        g1.changeChief(p2);

    }


}
