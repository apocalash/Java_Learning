import java.util.Arrays;

public class Stringchecks {
    public boolean checkIsogram(String string){
        string = string.toLowerCase();
        int len = string.length();
        char[] characterArray = string.toCharArray();
        Arrays.sort(characterArray);
        for(int i=0; i<len-1;i++){
            if(characterArray[i] == characterArray[i+1])
                return false;
        }
        return true;
    }
    public boolean checkPanagram(String string){
        string = string.toLowerCase();
        boolean is_all_alphabet_present = true;
        for(char ch = 'a'; ch<='z';ch++){
            if(!string.contains(String.valueOf(ch))){
                is_all_alphabet_present = false;
                break;
            }
        }
        return is_all_alphabet_present;
    }
    public boolean checkAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int len1 = str1.length();
        int len2 = str2.length();
        if(len2 != len1)
            return false;
        char[] characterArray_1 = str1.toCharArray();
        char[] characterArray_2 = str2.toCharArray();
        Arrays.sort(characterArray_1);
        Arrays.sort(characterArray_2);
        for(int i =0; i<len1; i++){
            if(characterArray_1[i] != characterArray_2[i])
                return false;
        }
        return true;
    }

}
