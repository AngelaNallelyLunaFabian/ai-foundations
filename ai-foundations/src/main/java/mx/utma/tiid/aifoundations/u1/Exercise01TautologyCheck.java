package mx.utma.tiid.aifoundations.u1;

import java.io.PrintStream;

/**
 * Exercise05_TautologyCheck
 * <p>
 * This program evaluates whether a propositional logic expression is a
 * tautology, contradiction, or contingency.
 * <p>
 * The example expression evaluated is:
 * A OR NOT A
 * <p>
 * The program checks the result for all possible truth values of A and
 * classifies the expression accordingly.
 * <p>
 * This exercise introduces logical classification using truth tables.
 * <p>
 * Topic: Propositional Logic
 * Course: Fundamentals of Artificial Intelligence
 *
 * @author pabpalac.
 */
public class Exercise01TautologyCheck {

    /**
     * Main method.
     *
     * @param args program args.
     */
    public static void main(String[] args) {
        boolean allTrue = true;
        boolean allFalse = true;

        try(final PrintStream out = System.out) {
            for (final boolean A : new Boolean[] {false, true}) {
                final boolean result = A || (!A);
                allTrue &= result;
                allFalse &= !result;
                out.println("A=" + A + " => " + result);
            }
            if (allTrue) out.println("Classification: TAUTOLOGY");
            else if (allFalse) out.println("Classification: CONTRADICTION");
            else out.println("Classification: CONTINGENCY");
        }

    }
}
