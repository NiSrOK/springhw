package springhw.beans;

public class Factory {

    public HelloBean createBean(String message) {
        return new HelloBean(message);
    }

}
