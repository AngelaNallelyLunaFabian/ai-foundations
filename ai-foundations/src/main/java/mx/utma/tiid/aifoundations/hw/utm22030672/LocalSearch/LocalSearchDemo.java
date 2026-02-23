package mx.utma.tiid.aifoundations.hw.utm22030672.LocalSearch;

/**
 * Demonstrates a simple Hill Climbing (local search) algorithm to maximize
 * the objective function f(x) = -x² + 6x in the discrete domain x ∈ {0, 1, 2, 3, 4, 5, 6}.
 * 
 * The algorithm starts from a given position and iteratively moves to a neighboring
 * value (x-1 or x+1, if within domain) only if it strictly improves the function value.
 * It stops when no better neighbor is available (local maximum reached).
 * 
 * Two runs are performed: starting from x=0 and starting from x=6.
 *
 * @author ANGELA
 */
public class LocalSearchDemo {

    private static final int MIN_X = 0;
    private static final int MAX_X = 6;

    /**
     * Evaluates the objective function f(x) = -x² + 6x.
     *
     * @param x the input value (integer in [0, 6])
     * @return the computed function value
     */
    public static int evaluate(int x) {
        return -(x * x) + (6 * x);
    }

    /**
     * Selects the best neighbor (x-1 or x+1) if it exists and provides a strictly better value.
     *
     * @param currentX the current position
     * @param currentValue the function value at currentX
     * @return the improved neighbor or currentX if no improvement
     */
    private static int selectBestNeighbor(int currentX, int currentValue) {
        int bestX = currentX;
        int bestValue = currentValue;

        if (currentX > MIN_X) {
            int leftValue = evaluate(currentX - 1);
            if (leftValue > bestValue) {
                bestX = currentX - 1;
                bestValue = leftValue;
            }
        }

        if (currentX < MAX_X) {
            int rightValue = evaluate(currentX + 1);
            if (rightValue > bestValue) {
                bestX = currentX + 1;
                bestValue = rightValue;
            }
        }

        return bestX;
    }

    /**
     * Runs hill climbing from a starting point and prints each step.
     *
     * @param startX starting position (0 or 6)
     */
    private static void runHillClimbing(int startX) {
        System.out.println("\nHill Climbing starting from x = " + startX);

        int currentX = startX;
        int currentValue = evaluate(currentX);
        int step = 0;

        System.out.printf("Step %d: x = %d, f(x) = %d%n", step, currentX, currentValue);

        while (true) {
            int nextX = selectBestNeighbor(currentX, currentValue);

            if (nextX == currentX) {
                System.out.println("No better neighbor found. Stopping.");
                break;
            }

            currentX = nextX;
            currentValue = evaluate(currentX);
            step++;

            System.out.printf("Step %d: Moved to x = %d, f(x) = %d%n", step, currentX, currentValue);
        }

        System.out.printf("Final: x = %d, f(x) = %d (theoretical max at x=3, f=9)%n", currentX, currentValue);
    }

    /**
     * Main method to execute two runs.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Hill Climbing Demo - Maximize f(x) = -x² + 6x");
        System.out.println("Domain: 0 to 6\n");

        runHillClimbing(0);
        runHillClimbing(6);
    }
}