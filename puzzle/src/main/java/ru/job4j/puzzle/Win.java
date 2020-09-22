package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (1 == board[i][i]) {
                if (rowCheck(i, board) || columnCheck(i, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean columnCheck(int i, int[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (1 != board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean rowCheck(int i, int[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (1 != board[j][i]) {
                return false;
            }
        }
        return true;
    }
}
