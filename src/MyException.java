public class MyException extends Exception {

    private String message;
    public MyException(String message){
        this.message = message;
    }


    public void printMessage() {
        System.out.println(message);

    }
}
