package factory_method;

public class JLog implements Logger {

    public void print(String string){
        System.out.println("JLog: " + string);

    }
}
