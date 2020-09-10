package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            boolean rowCheck = true;
            boolean columnCheck = true;
            for (int j = 0; j < board.length; j++) {
                if ((columnCheck) && (1 != board[i][j])) {
                    columnCheck = false;
                }
                if ((rowCheck) && (1 != board[j][i])) {
                    rowCheck = false;
                }
                if (!rowCheck && !columnCheck) {
                    break;
                }
            }
            if (rowCheck || columnCheck) {
                result = true;
                break;
            }
        }
        return result;
    }
}
