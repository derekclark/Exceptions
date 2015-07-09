public class CalledClassThrowsException {

    public CalledClassThrowsException(int num) throws MyException{
        if (num == 5){
            throw new MyException("value=5");
        }
    }
}
