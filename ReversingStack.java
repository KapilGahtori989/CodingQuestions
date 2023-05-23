import java.util.Collections;
import java.util.Stack;

public class ReversingStack{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Collections.addAll(s, 11,2,32,3,41);
        System.out.println(s);
        sortStack(s);
        System.out.println(s);
    }

    public static void sortStack(Stack<Integer> s)
	{
		//add code here.
		if(s.size()==1){
            return;
        }
        int temp = s.pop();
        sortStack(s);
        insert(s,temp);
        return;
	}

    static void insert(Stack<Integer> s ,int temp){
        if(s.size()==0 || s.get(s.size()-1)<=temp){
            s.push(temp);
            return;
        }
        int val = s.pop();
        insert(s, temp);
        s.push(val);
    }
}