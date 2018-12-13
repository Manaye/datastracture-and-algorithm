package multibracketvalidation;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
       boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        char current, previous;
        for(int i = 0; i<input.length(); i++){
            current = input.charAt(i);
            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }else if(current == ')' || current == ']' || current == '}'){
                if(stack.isEmpty()){
                    result = false;
                }else{
                    previous = stack.peek();
                    if(
                               (current == ')' && previous == '(')
                            || (current == ']' && previous == '[')
                            || (current == '}' && previous == '{')
                    ){
                        stack.pop();
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            result = false;
        }
        return result;
    }


}
