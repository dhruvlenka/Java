//Searching character in the String
public class SearchInString {
    public static void main(String[] args) {
        String name = "DhruvLenka";
        char target = 'v';
        System.out.println(search(name,target));

    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i <= str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
