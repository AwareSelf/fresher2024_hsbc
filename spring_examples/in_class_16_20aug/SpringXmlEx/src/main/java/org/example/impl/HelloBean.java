package org.example.impl;

import org.example.intf.HelloIntf;
import org.example.intf.IPerson;

public class HelloBean implements HelloIntf
{

    private String myname;

    private IPerson person;

    @Override
    public String greet(String name) {
        return "Hello "+name;
    }

    @Override
    public String greetByName(String greetstr) {
        return greetstr+","+ myname;
    }


    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public IPerson getPerson() {
        return person;
    }

    public void setPerson(IPerson person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "myname='" + myname + '\'' +
                ", person=" + person +
                '}';
    }
}
