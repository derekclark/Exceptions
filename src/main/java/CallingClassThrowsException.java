public class CallingClassThrowsException {
    CalledClassThrowsException calledClassThrowsException;

    public CallingClassThrowsException() throws MyException{
//        try {
            calledClassThrowsException = new CalledClassThrowsException(5);
//        }catch(MyException e){
//            System.out.println(e);
//        }
    }
}
