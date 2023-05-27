import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    //finding subsets of String in java
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        list = getList(str,"",0,list);
        System.out.println(list);
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare( String o1, String o2) {
                
                return o1.compareTo(o2);
            }
            
        };
        Collections.sort(list, comparator);
        System.out.println(list);
    }


    private static List<String> getList(String str,String ans,int i,List<String> list){
       
        if(i==str.length()){
            if(ans!=""){
                list.add(ans);
                
            }
            return list;
        }
        
        getList(str, ans+str.charAt(i), i+1, list);

        getList(str, ans, i+1, list);
        return list;
    }
}
