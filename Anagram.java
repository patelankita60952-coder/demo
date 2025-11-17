import java.util.Arrays;
class Anagram {
    public static void main(String[] args){
        String str ="hello";
        String str1="lleoh";
        char ch1[]=str.toCharArray();
        char ch2[]=str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str3=new String(ch1);
        String str2=new String(ch2);
        if(str3.equals(str2)){
            System.out.println("annagram");
        }
        else{
            System.out.println("not annagram");
        }
        }
    }