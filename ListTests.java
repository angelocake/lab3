import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests{
    @Test 
    public void TestFilter(){
        List<String> str= new ArrayList<String>{"A","B","C","D"};
        List<String> answer= new ArrayList<String>{"A","B","C","D"};
        assertArrayEquals(answer, ListExamples.filter(str, new StringChecker()));
    }
    @Test 
    public void TestFilter2(){
        List<String> str= new ArrayList<String>{"B","C","A","D"};
        List<String> answer= new ArrayList<String>{"A","B","C","D"};
        assertArrayEquals(answer, ListExamples.filter(str, new StringChecker()));
    }
}