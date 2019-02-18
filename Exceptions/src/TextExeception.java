
import java.io.IOException;
import java.lang.IllegalArgumentException;

public class TextExeception {

    public TextExeception() {
    }

    public void testCatch() {

        try {
            testError(1);
        }catch (IOException e){
            e.printStackTrace();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("TestCatch is done");
    }
    private void testError(int val) throws IOException{
        if (val > 5){

            throw new IOException("This is an IO error");
        }
        if (val < 2){
            throw  new IllegalArgumentException("This is an IA error");
        }
    }

    public static void main(String[] args) {
        TextExeception teh = new TextExeception();
        teh.testCatch();
        System.out.println("Program done");

    }
}


