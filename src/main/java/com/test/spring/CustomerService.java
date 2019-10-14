package com.test.spring;

public class CustomerService {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "url='" + url + '\'' +
                '}';
    }
    public void printURL(){
        System.out.println("customer url "+this.url);
    }
    public void printName(){
        System.out.println("customer name"+this.name);
    }
    public void printThrowException(){
        throw new IllegalArgumentException();
    }
}
