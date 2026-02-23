package mx.utma.tiid.aifoundations.u1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Exercise01FixedFormula
 * <p>
 * This program evaluates a fixed propositional logic expression:
 * (A AND B) OR (NOT C).
 * <p>
 * The user provides boolean values for propositions A, B, and C.
 * The program then computes and displays the result of the expression
 * along with partial evaluations.
 * <p>
 * This exercise reinforces the use of logical operators AND, OR, and NOT
 * and demonstrates how propositional logic can be implemented in Java.
 * <p>
 * Topic: Propositional Logic
 * Course: Fundamentals of Artificial Intelligence
 *
 * @author pabpalac.
 */
public class Exercise01FixedFormula {

    /**
     * Main method.
     *
     * @param args program args.
     */
    public static void main(final String... args) {
        try (
            final Scanner sc = new Scanner(System.in);
            final PrintStream out = System.out
        ) {
            out.print("A (true/false): ");
            final boolean A = Boolean.parseBoolean(sc.nextLine().trim());

            out.print("B (true/false): ");
            final boolean B = Boolean.parseBoolean(sc.nextLine().trim());

            out.print("C (true/false): ");
            final boolean C = Boolean.parseBoolean(sc.nextLine().trim());
            final boolean result = (A && B) || (!C);

            out.println("Result: " + result);
            out.println("A AND B = " + (A && B));
            out.println("NOT C = " + (!C));
        }
    }
}
