public class Main {

    public static void main(String[] args) {
        try{
            throw new Exception("Task1 Message");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("it is proof that this block was run");
        }


        try{
            throw new MyException("Task2.1 myexception message test");

        }catch (MyException e){
            e.printMessage();
        }

        try{
            MyTest myTest = new MyTest();
            myTest.test();

        }catch (MyException e){
            e.printMessage();
        }
    }
}
