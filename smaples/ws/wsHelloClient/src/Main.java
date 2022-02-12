import client.HelloWorldServiceLocator;
import client.HelloWorld_PortType;

public class Main {

    public static void main(String[] args) {
        try {
            HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
            HelloWorld_PortType service = locator.getHelloWorld();
            System.out.println(service.sayHelloWorldFrom("eddy"));
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
