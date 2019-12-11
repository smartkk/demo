package com.example.demo.rpc.server;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }

    @Override
    public Person getPerson(String name) {
        Person p = new Person();
        p.setName(name);
        p.setAge(22);
        return p;
    }
}
