package factory_method;

public class MongoClient extends DBClient{

    /*
    * Custom implementation of the factory method
    * */
    @Override
    public Logger setLogger() {
        return new LogMaster();
    }
}
