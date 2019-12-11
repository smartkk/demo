package com.example.demo.rpc.server;

public interface HelloService {

    String sayHello(String name);
    Person getPerson(String name);
}
