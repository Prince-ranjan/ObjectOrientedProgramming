import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(12);
        stack.push(25);

        System.out.println(isParenthesesBalanced("(())"));

        System.out.println(isParenthesesBalanced("((()"));

        System.out.println(isParenthesesBalanced("((()))))"));
//        System.out.println("Stack = " + stack);
//
//        System.out.println("Is Empty =" + stack.empty());
//
//        System.out.println("Top Element = " + stack.peek());
//
//        System.out.println("Popped Element = " + stack.pop()) ;
//
//        System.out.println("Top Element = " + stack.peek());
//
//        System.out.println("Popped Element = " + stack.pop()) ;
//
//        System.out.println("Top Element = " + stack.peek());
//
//        System.out.println("Popped Element = " + stack.pop()) ;
//
//        System.out.println("Is Empty =" + stack.empty());
    }

    static boolean isParenthesesBalanced(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                st.push(c);
            }
            else if(c == ')' && !st.empty()){
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.empty();
    }
}

/*

"(())"

st =
 */