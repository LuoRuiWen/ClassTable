package com.luo.utils;

import org.bson.types.ObjectId;

import java.util.UUID;

public class IdUtils {

    public static String nextId(){

        ObjectId id = new ObjectId();
        return id.toString();
    }
}
