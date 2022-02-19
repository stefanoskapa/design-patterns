package factory_method;

public class DBClient {

    /*
    * Factory method that can be overriden
    * by a different DBClient implementation
    * */
    public Logger setLogger() {
        return new JLog();
    }
}
