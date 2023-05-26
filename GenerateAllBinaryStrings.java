import java.util.*;
public class GenerateAllBinaryStrings {
   public static void main(String[] args) {
    int n =3;
    List<String> list = new ArrayList<>();
    list =  solve(n,"",0,list);
    System.out.println(list);
   }
   private static List<String> solve(int num,String ans,int ind,List<String> list){
      
    if(ind==num){
        list.add(ans);
        return list;
    }
    if(ind!=0 && ans.charAt(ind-1)=='1'){
        solve(num,ans+'0',ind+1,list);
    }else{
        solve(num,ans+'0',ind+1,list);
        solve(num,ans+'1',ind+1,list);
    }
    return list;
}   
}
