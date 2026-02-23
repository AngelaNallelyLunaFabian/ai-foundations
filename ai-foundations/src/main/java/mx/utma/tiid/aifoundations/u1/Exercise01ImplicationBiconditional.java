package mx.utma.tiid.aifoundations.u1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Exercise01ImplicationBiconditional
 * <p>
 * This program evaluates implication and biconditional logical operators
 * using their equivalent logical expressions:
 * <p>
 * Implication (A -> B) is evaluated as (!A OR B)
 * Biconditional (A <-> B) is evaluated as (A AND B) OR (!A AND !B)
 * <p>
 * The user provides boolean values for propositions A and B.
 * <p>
 * This exercise demonstrates how complex logical operators can be expressed
 * using basic logical operators.
 * <p>
 * Topic: Propositional Logic
 * Course: Fundamentals of Artificial Intelligence
 *
 * @author pabpalac.
 */
public class Exercise01ImplicationBiconditional {

    /**
     * Main method.
     *
     * @param args program args.
     */
    public static void main(String[] args) {
        try (
            final Scanner sc = new Scanner(System.in);
            final PrintStream out = System.out
        ) {
            out.print("A (true/false): ");
            final boolean A = Boolean.parseBoolean(sc.nextLine().trim());

            out.print("B (true/false): ");
            final boolean B = Boolean.parseBoolean(sc.nextLine().trim());

            out.println("A -> B : " + ((!A) || B));
            out.println("A <-> B: " + ((A && B) || (!A && !B)));
        }
    }
}
