import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n= 3;
        List<String> result = new ArrayList<>();
        findAll("(", 1, 0, result, n);
        System.out.println(result);
    }
    private static void findAll(String current,int o,int c , List<String> result,int n){
        if(current.length()==2*n){
            result.add(current);
            return;
        }

        if(o<n)findAll(current+"(", o+1, c, result, n);
        if(c<o)findAll(current+")", o, c+1, result, n);
    }
}
