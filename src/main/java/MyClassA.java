public class MyClassA {
    CallingClassThrowsException myclassThrowsException;

    public MyClassA() throws MyException{
        myclassThrowsException = new CallingClassThrowsException();
    }
}
