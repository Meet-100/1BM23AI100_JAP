public class String_Functions {


    public static boolean compareStrings(String s1,String s2){
        return s1.equals(s2);
    }


    public static String copyString(String original){
        return new String(original);
    }

    public static String concatenateString(String s1, String s2){
        return s1 + s2;
    }

    public static void main(String[] args){
        String Str1="Messi";
        String Str2="Ronaldo";

        System.out.println(compareStrings(Str1,Str2));
        System.out.println(copyString("Passion"));
        System.out.println(concatenateString("Ronaldo hates ", "Messi"));
    }
}