import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: loanmyers
 * Date: 26/04/14
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */

public class App {

    public static void main(String[] args) {
        try{
            MongoClient client = new MongoClient("localhost");
            DB db = client.getDB("books");
            DBCollection collection = db.getCollection("books");

            System.out.print(collection);

        } catch(UnknownHostException e){
            e.printStackTrace();
        }
    }



}
