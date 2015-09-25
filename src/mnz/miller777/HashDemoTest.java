package mnz.miller777;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mille_000 on 26.09.2015.
 */
public class HashDemoTest extends Assert{

    @Test
    public void test(){
        HashTable table = new HashTable(100);
        String[] tests = {"test", "Hello", "group", "test"};

        for (String test : tests) {
            System.out.println("hash(\"" + test + "\") = " + table.hash(test));

        }

        table.add("test");

        assertEquals("test", table.get("test"));
        assertNull(table.get("test2"));

    }
}
