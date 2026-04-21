package edu.commonwealthu.mrodriguez.cmsc230.mazelab;

public class Maze {

    private char[][] grid;
    private int startRow, startCol;

    public Maze(String maze) {
        // Convert the input string to a usable internal representation
        String[] rows = maze.split("\\r?\\n");
        grid = new char[rows.length][rows[0].length()];

        for (int r = 0; r < rows.length; r++) {
            for (int c = 0; c < rows[r].length(); c++) {
                grid[r][c] = rows[r].charAt(c);
                if (grid[r][c] == 'S') {
                    startRow = r;
                    startCol = c;
                }
            }
        }
    }

    public int solve() {
        // Use recursive backtracking to count how many solutions the maze has
        return backtrack(startRow, startCol);
    }
    private int backtrack(int r, int c) {
        // out of bounds or wall or visited
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) return 0;
        if (grid[r][c] == '#' || grid[r][c] == '.') return 0;
        if (grid[r][c] == 'F') return 1;

        // mark visited
        char temp = grid[r][c];
        grid[r][c] = '.';

        int paths = 0;
        paths += backtrack(r+1, c);
        paths += backtrack(r-1, c);
        paths += backtrack(r, c+1);
        paths += backtrack(r, c-1);

        // unmark for backtracking
        grid[r][c] = temp;

        return paths;
    }
}