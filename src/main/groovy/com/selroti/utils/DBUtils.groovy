package com.selroti.utils

import com.mongodb.DB
import com.mongodb.MongoClient


class DBUtils {

    static def mongodb;

    static def getDatabase() {
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 )
        // Now connect to your databases
        DB db = mongoClient.getDB("selroti")
        db
    }
}
