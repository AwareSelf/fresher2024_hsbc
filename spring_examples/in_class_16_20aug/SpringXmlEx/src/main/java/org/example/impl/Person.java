package org.example.impl;

import org.example.intf.IPerson;
import org.springframework.beans.factory.annotation.Value;

public class Person implements IPerson {

    @Value("xyz")
    String name;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
