package mx.utma.tiid.aifoundations.u1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Exercise04_LoginRule
 * <p>
 * This program simulates a simple rule-based decision system using
 * propositional logic.
 * <p>
 * The decision to allow or deny login is based on the following rule:
 * ALLOW_LOGIN = (hasAccount AND passwordCorrect) AND (NOT isBlocked)
 * <p>
 * The user provides boolean values for each condition, and the system
 * outputs a final decision.
 * <p>
 * This exercise connects propositional logic with rule-based Artificial
 * Intelligence systems.
 * <p>
 * Topic: Propositional Logic / Rule-Based Systems
 * Course: Fundamentals of Artificial Intelligence
 *
 * @author pabpalac.
 */

public class Exercise01LoginRule {

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
            out.print("hasAccount (true/false): ");
            final boolean hasAccount = Boolean.parseBoolean(sc.nextLine().trim());

            out.print("passwordCorrect (true/false): ");
            final boolean passwordCorrect = Boolean.parseBoolean(sc.nextLine().trim());

            out.print("isBlocked (true/false): ");
            final boolean isBlocked = Boolean.parseBoolean(sc.nextLine().trim());
            final boolean allowLogin = (hasAccount && passwordCorrect) && (!isBlocked);

            out.println("Decision: " + (allowLogin ? "ALLOW_LOGIN" : "DENY_LOGIN"));
        }
    }
}
