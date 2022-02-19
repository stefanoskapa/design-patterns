package factory_method;

/*
* FACTORY METHOD PATTERN
*
* Defer the creation of an object to subclasses
*
* */

public class Main {
    public static void main(String[] args) {

        DBClient default_client = new DBClient();
        default_client.setLogger().print("Initializing Client");

        DBClient other_client = new MongoClient();
        other_client.setLogger().print("Initializing Client");
    }
}
