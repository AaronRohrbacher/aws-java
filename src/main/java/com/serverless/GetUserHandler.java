package com.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import java.util.Collections;
import java.util.Map;

import com.serverless.dal.Product;

public class GetUserHandler implements RequestHandler {
    public static String sMethod() {
        return "FUCK";
    }

    // public static void main(String[] args) {
    //     String s = sMethod();
    //     return s;
    // }
}
