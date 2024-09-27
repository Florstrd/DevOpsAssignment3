import org.example.Person;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PersonTest {
    @Test
    public void testCorrectInput() {
        Person testPerson = new Person("Pete");
        Assert.assertEquals("[John, Emily, Michael, Sarah, David, Jessica, James, Sophia, Daniel, Olivia]", Arrays.toString(testPerson.getFriends("Pete")));
    }

    @Test
    public void testWrongInput() {
        Person testPerson = new Person("Pete");
        Assert.assertEquals("[No friends for that person]", Arrays.toString(testPerson.getFriends("Peter")));
    }

}
