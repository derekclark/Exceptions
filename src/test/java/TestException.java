import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class TestException {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowRuntimeException(){
        thrown.expect(IndexOutOfBoundsException.class);
        List<String> list=new ArrayList<String>();
        list.get(1);
    }

    //Calling Class throws Exception, so test should expect exception to be thrown
    @Test(expected=MyException.class)
    public void willThrowException() throws MyException{
        CallingClassThrowsException myclassThrowsException = new CallingClassThrowsException();
    }

    //Calling Class Catches Exception, so test should not expect exception
    @Test
    public void willNotThrowExceptionAsCallingClassCatchesIt() throws MyException{
        CallingClassCatchesException myclassCatchesException = new CallingClassCatchesException();
    }

    //called class throws exception, so test should expect exception
    @Test
    public void shouldThrowCheckedExceptionDetectUsingExpectedExceptionStyle() throws MyException{
        thrown.expect(MyException.class);
        CalledClassThrowsException myclassThrowsException = new CalledClassThrowsException(5);
    }

    //called class throws exception, so test should expect exception
    @Test(expected=MyException.class)
    public void shouldThrowCheckedExceptionDetectUsingJunitAnnotationStyle() throws MyException{
        CalledClassThrowsException myclassThrowsException = new CalledClassThrowsException(5);
    }

    //when calling class throws then rethrows the exception, test should expect exception
    @Test(expected = MyException.class)
    public void shouldThrowExceptionForClassWhichCatchesThenRethrowsException() throws MyException {
        CallingClassCatchesThenRethrowsException callingClassCatchesThenRethrowsException =
                new CallingClassCatchesThenRethrowsException();
    }
}
