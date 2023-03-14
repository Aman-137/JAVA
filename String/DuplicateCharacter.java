package String;

public class DuplicateCharacter {

    public static void main(String[] args) {
        String str = "geeks for geeks";

        char string[] = str.toCharArray();

        for (int i = 0; i < string.length; i++) {
            int count = 1;

            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;

                    string[j] = '0';
                }

            }
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}
