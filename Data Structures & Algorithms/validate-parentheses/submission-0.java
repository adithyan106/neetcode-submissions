class Solution {
    public boolean isValid(String s) {
      Stack<Character> s1 = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                s1.push(ch);
            } else {

                if (s1.isEmpty()) {
                    return false;
                }

                if (ch == ')') {
                    if (s1.peek() == '(') {
                        s1.pop();
                    } else {
                        return false;
                    }
                }

                if (ch == '}') {
                    if (s1.peek() == '{') {
                        s1.pop();
                    } else {
                        return false;
                    }
                }

                if (ch == ']') {
                    if (s1.peek() == '[') {
                        s1.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return s1.isEmpty();
    }
    }

