package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2 + string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
        	sb.append(' ');
        }
        return sb.toString();
    }

    public String loudAndClear(String string) {
    	return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length;i++) {
            if (array[i]  >= 'A' && array[i] <= 'Z' ) {
                array[i] = (char)(array[i] + 32);
            }
            else if (array[i]  >= 'a' && array[i] <= 'z' ) {
                array[i] = (char)(array[i] - 32);
            }
        }
        return new String(array);
    }

    public String oneAtATime(String string1, String string2) {
        if (string1 == null || string1.length() == 0) {
        	return string2;
        }
        if (string2 == null || string1.length() == 0) {
        	return string1;
        }
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        while (left < string1.length() && right  <string2.length()) {
        	sb.append(string1.charAt(left++)).append(string2.charAt(right++));
        }
        while (left < string1.length()) {
        	sb.append(string1.charAt(left++));
        }
        while (right < string2.length()) {
        	sb.append(string2.charAt(right++));
        }
        return sb.toString();
        
    }
}
