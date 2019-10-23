package org.zlasu.beans;

public class HelloWorld {

    private String message;

    public HelloWorld() {
        System.out.println("CREATE: HelloWorld()");
    }

    public HelloWorld(String message) {
        System.out.println("CREATE: HelloWorld(String message)");
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
