package mx.utma.tiid.aifoundations.u1;

import java.io.PrintStream;

/**
 * Exercise01TruthTable
 * <p>
 * This program generates and displays the truth table for the propositional
 * logic expression:
 * (A OR B) AND (NOT A OR C).
 * <p>
 * All possible combinations of truth values for propositions A, B, and C
 * are evaluated and printed.
 * <p>
 * This exercise helps students understand how truth tables work and how
 * logical expressions behave under different input conditions.
 * <p>
 * Topic: Propositional Logic
 * Course: Fundamentals of Artificial Intelligence
 *
 * @author pabpalac.
 */
public class Exercise01TruthTable {

    /**
     * Main method.
     *
     * @param args program args.
     */
    public static void main(final String... args) {
        try (final PrintStream out = System.out) {
            out.println("Truth Table: (A OR B) AND (NOT A OR C)");
            out.println("A\t\tB\t\tC\t\tRESULT");
            final boolean[] values = {false, true};
            for (final boolean A : values)
                for (final boolean B : values)
                    for (final boolean C : values)
                        out.println(A + "\t" + B + "\t" + C + "\t" + ((A || B) && ((!A) || C)));
        }
    }
}
