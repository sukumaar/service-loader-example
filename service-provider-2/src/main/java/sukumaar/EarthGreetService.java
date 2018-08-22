package sukumaar;

/**
 * @author sukumaar
 */
public class EarthGreetService implements GreetService {
    final static String whoIsAvailable = "Thor (without power of the Mjolnir)";
    final static String shortName = "earthThor";

    @Override
    public String greet(String s) {
        return "Hello " + s + " , I am " + whoIsAvailable;
    }

    @Override
    public boolean isAvailable(String s) {
        return s.equals(shortName);
    }
}
