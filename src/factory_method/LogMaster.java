package factory_method;

public class LogMaster implements Logger {

    public void print(String string) {
        System.out.println("LogMaster-> " + string);
    }
}
