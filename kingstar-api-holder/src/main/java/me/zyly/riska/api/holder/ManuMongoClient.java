package me.zyly.riska.api.holder;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.bson.Document;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class ManuMongoClient {
    public static final List<Document> list = new ArrayList<>();
    private static class MongoClientHolder {
        static MongoClient mongoClient = null;
        static {
//            Boot.MongoDBConfig config = Boot.getMongoDBConfig();
//            try {
//                mongoClient = new MongoClient(new MongoClientURI(String.format("mongodb://%s:%s@%s:%s/%s",
//                        config.getUsername(), URLEncoder.encode(config.getPassword(), "UTF-8"),
//                        config.getHost(), config.getPort(), config.getDatabase())));
//            } catch (Exception e) {
////                never arrive here
////                e.printStackTrace();
//            }
        }
    }

    public static MongoClient getMongoClient() {
        return MongoClientHolder.mongoClient;
    }

}
