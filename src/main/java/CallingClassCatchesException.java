public class CallingClassCatchesException {

    CalledClassThrowsException calledClassThrowsException;

    public CallingClassCatchesException() throws MyException{
        try {
            calledClassThrowsException = new CalledClassThrowsException(5);
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
