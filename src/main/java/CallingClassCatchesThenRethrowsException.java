public class CallingClassCatchesThenRethrowsException {

    CalledClassThrowsException calledClassThrowsException;

    public CallingClassCatchesThenRethrowsException() throws MyException{
        try {
            calledClassThrowsException = new CalledClassThrowsException(5);
        }catch(MyException e){
            System.out.println(e);
            throw new MyException("thrown exception");
        }
    }

}
