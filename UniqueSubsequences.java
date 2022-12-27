import java.util.HashSet;

public class UniqueSubsequences{
    public static void unqSubsequences(String str, int idx, String newString,HashSet set){

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        unqSubsequences(str,idx+1,newString+currChar,set);

        unqSubsequences(str,idx+1,newString,set);


    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        unqSubsequences(str,0,"",set);
    }
}
