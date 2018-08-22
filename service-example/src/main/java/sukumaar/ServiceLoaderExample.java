package sukumaar;

import java.util.ServiceLoader;


/**
 * @author sukumaar
 */
public class ServiceLoaderExample {
    public static void main(String[] args) {
        ServiceLoader<GreetService> greetServiceServiceLoader = ServiceLoader.load(GreetService.class);
        if (args.length < 2) {
            System.out.println("parameter missing, we need 2 params");
            System.out.println("1nd : who should greet");
            System.out.println("2st : to whom");
        }
        GreetService g = null;
        for (GreetService knownGreeter : greetServiceServiceLoader) {
            if (knownGreeter.isAvailable(args[0])) {
                g = knownGreeter;
            }
        }
        if (g != null) {
            System.out.println(g.greet(args[1]));
        } else {
            System.out.println("No1 is actually greeting");

        }
    }
}
