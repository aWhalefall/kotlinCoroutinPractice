package proxy;


public class Car implements IVehical {

    @Override
    public void run(String value) {
        System.out.println("Car会跑");
    }

    @Override
    public void helloWorld() {

    }
}