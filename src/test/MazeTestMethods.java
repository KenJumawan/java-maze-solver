package edu.commonwealthu.mrodriguez.cmsc230.mazelab.test;

import edu.commonwealthu.mrodriguez.cmsc230.mazelab.Maze;

import static edu.commonwealthu.mrodriguez.cmsc230.test.Assert.assertEquals;

/**
 * A class containing unit test methods for MazeLab.
 * Only contains a few, to serve as examples.
 */
class MazeTestMethods {
    public static final String SMALL_MAZE = String.join(System.lineSeparator(),
            "#####",
            "#S#F#",
            "# # #",
            "#   #",
            "#####");

    public static final String BIG_MAZE = String.join(System.lineSeparator(),
            "###########",
            "#     #   #",
            "# #   # # #",
            "F #     # #",
            "# ##### # #",
            "# # #   # #",
            "#   # #   #",
            "##### #   #",
            "# #S# #   #",
            "#     #   #",
            "###########");

    public static final String NO_SOLUTION_MAZE = String.join(System.lineSeparator(),
            "#########",
            "#   #   #",
            "# S # F #",
            "#   #   #",
            "#########");

    public static final String TWO_SOLUTION_MAZE = String.join(System.lineSeparator(),
            "####",
            "#S #",
            "# F#",
            "####");

    static void solveSmallMaze() {
        Maze m = new Maze(SMALL_MAZE);
        int solutions = m.solve();
        assertEquals(1, solutions);
    }

    static void solveNoSolutionMaze() {
        Maze m = new Maze(NO_SOLUTION_MAZE);
        int solutions = m.solve();
        assertEquals(0, solutions);
    }

    static void solveTwoSolutionMaze() {
        Maze m = new Maze(TWO_SOLUTION_MAZE);
        int solutions = m.solve();
        assertEquals(2, solutions);
    }

    // STUDENTS: I suggest writing more test methods here, then adding them to the TestSuite.
}
