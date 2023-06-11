package com.nogayhusrev;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '{', '[');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', '{', ']');

    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (isLeftBracket(c))
                stack.push(c);

            if (isRightBracket(c)) {
                if (stack.isEmpty())
                    return false;

                var top = stack.pop();
                if (!bracketsMatch(top, c))
                    return false;
            }
        }


        return stack.isEmpty();
    }

    private boolean bracketsMatch(char left, char right) {

        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

    private boolean isRightBracket(char c) {
        return rightBrackets.contains(c);
    }

    private boolean isLeftBracket(char c) {
        return leftBrackets.contains(c);
    }
}
