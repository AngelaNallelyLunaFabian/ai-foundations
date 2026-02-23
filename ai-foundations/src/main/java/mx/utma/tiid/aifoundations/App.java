package mx.utma.tiid.aifoundations;

import java.io.PrintStream;

/**
 * Main app.
 *
 * @author pabpalac.
 */
public class App {

    /**
     * Main method.
     *
     * @param args program args.
     */
    public static void main(final String... args) {
        try (final PrintStream out = System.out) {
            out.println("AI Foundations - TIID");
            out.println("Java 11 + Maven");
            out.println("Project base for the semester");
        }
    }
}
