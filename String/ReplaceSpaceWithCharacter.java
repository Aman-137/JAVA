package String;

public class ReplaceSpaceWithCharacter {
    public static void main(String[] args) {
        String str = "Once in a blue moon";
        char ch = '-';

        str = str.replace(' ', ch);

        System.out.println("The replaced string is = " + str);
    }
}
