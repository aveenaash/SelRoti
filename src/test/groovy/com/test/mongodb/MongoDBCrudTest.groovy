package com.test.mongodb

import org.junit.Before
import org.junit.Ignore
import org.junit.Test

import com.mongodb.BasicDBObject
import com.mongodb.DB
import com.selroti.utils.DBUtils

class MongoDBCrudTest {

    DB db
    def dbcollection

    @Before
    public void setup() {
        db= DBUtils.getDatabase()
        dbcollection = db.getCollection("topics");
    }

    @Test
    @Ignore
    public void testInsert() {

        def doc = new BasicDBObject("title", "ASD").
                append("description", "Design").
                append("likes", 60).
                append("url", "http://www.abinash.com/asd/").
                append("by", "mum");
        dbcollection.insert(doc);
        System.out.println("Document inserted successfully");
    }

    @Test
    //@Ignore
    public void findAll() {

        def cursor = dbcollection.find()
        while(cursor.hasNext())
        {
            println cursor.next()
        }
    }
}
