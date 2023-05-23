import java.util.Collections;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Collections.addAll(s, 5,4,3,2,1);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
    private static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverseStack(s);
        insertAtBottom(s,temp);
    }
    private static void insertAtBottom(Stack<Integer> s,int target) {
        if(s.isEmpty()){
            s.push(target);
            return;
        }
        int temp = s.pop();
        insertAtBottom(s, target);
        s.push(temp);
    }
}
