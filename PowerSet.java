import java.util.ArrayList;
import java.util.List;

public class PowerSet {
//     Given a string S, Find all the possible subsequences of the String in lexicographically-sorted order.

//     Example 1:
// Input : str = "abc"
// Output: a ab abc ac b bc c
// Explanation : There are 7 subsequences that 
// can be formed from abc.

public static void main(String[] args) {
    String s = "abc";
    List<String> result = new ArrayList<>();
    result = AllPossibleStrings(s,result);
    System.out.println(result);
}

private static List<String> AllPossibleStrings(String s,List<String> list) {
    String f = "";
    solve(0,s,f,list);
    return list;
}

private static void solve(int i, String s, String f,List<String> list) {
    if(i==s.length()){
        list.add(f);
        return;
    }

    solve(i+1, s, f+s.charAt(i), list);
    solve(i+1, s, f, list);
}

}
