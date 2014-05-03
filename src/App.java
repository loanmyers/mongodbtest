import com.mongodb.*;
import org.bson.types.ObjectId;

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

//            BasicDBObject dbObject = new BasicDBObject("name", "Design Patterns").append("author", "Loan Myers").append("location", "Room 7");
//            collection.insert(dbObject);

            System.out.println(collection.getCount());
            BasicDBObject query = new BasicDBObject("author", "Loan Myers");
            ObjectId id = (ObjectId) query.get("{id");

            DBCursor cursor = collection.find();
            try {
              while (cursor.hasNext()) {
                    System.out.println(cursor.next());
              }
            } finally {
                cursor.close();
            }


        } catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
