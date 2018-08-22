package sukumaar;

/**
 * @author sukumaar
 */
public class AsgardGreetService implements GreetService {
    private final static String whoIsAvailable = "God of Thunder: Thor";
    final static String shortName = "asgardThor";

    @Override
    public String greet(String s) {
        return "Hello " + s + " , I am " + whoIsAvailable;
    }

    @Override
    public boolean isAvailable(String s) {
        return s.equals(shortName);
    }
}
