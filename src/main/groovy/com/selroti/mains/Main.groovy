package com.selroti.mains

import com.mongodb.BasicDBObject
import com.mongodb.DB
import com.mongodb.DBCollection
import com.selroti.utils.DBUtils

class Main {

    static main(String args) {

        DB db= DBUtils.getDatabase();
        //def col= db.get
        DBCollection coll = db.getCollection("selroti");
        System.out.println("Collection mycol selected successfully");

        BasicDBObject doc = new BasicDBObject("title", "Compiler").
                append("description", "database").
                append("likes", 60).
                append("url", "http://www.abinash.com/compiler/").
                append("by", "blogspot");
        coll.insert(doc);
        System.out.println("Document inserted successfully");
    }
}
