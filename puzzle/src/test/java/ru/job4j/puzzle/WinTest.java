package ru.job4j.puzzle;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class WinTest {
    @Test
    public void whenVerticalWin1() {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        assertThat(Win.check(board), is(true));
    }

    @Test
    public void whenHorizontalWin2() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        assertThat(Win.check(board), is(true));
    }

    @Test
    public void whenNotWin3() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        assertThat(Win.check(board), is(true));
    }

    @Test
    public void whenNotWinL() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
        };
        assertThat(Win.check(board), is(false));
    }

    @Test
    public void whenVerticalWin5() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(true));
    }

    @Test
    public void whenHorizontalWin6() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(true));
    }

    @Test
    public void whenNotWin7() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {1, 1, 0, 1, 1},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }

    @Test
    public void whenNotWinTwo8() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }

    @Test
    public void whenNotWinThree9() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 1},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }

    @Test
    public void whenNotWin10() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }

    @Test
    public void whenNotWin11() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 1, 0},
                        {1, 0, 0, 0, 0},
                };
            }
        };
        assertThat(logic.isWin(), is(false));
    }
}

