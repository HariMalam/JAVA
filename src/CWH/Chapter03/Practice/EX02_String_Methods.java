package CWH.Chapter03.Practice;

public class EX02_String_Methods {
    public static void main(String[] args) {
        String name = "Hari";
        System.out.println(name);

        // Returns length of string name
        int value = name.length();
        System.out.println(value);

        // Returns new String which has all the Lowercase characters from the string name
        String LowerString = name.toLowerCase();
        System.out.println(LowerString);

        // Returns new String which has all the Uppercase characters from the string name
        String UpperString = name.toUpperCase();
        System.out.println(UpperString);

        String nonTrimmedString = "     Hari       ";
        System.out.println(nonTrimmedString);

        // Returns a new string after removing all the leading and trading spaces from the original string
        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

        // Returns a substring from start to the end substring(2) -> Returns "ri"
        System.out.println(name.substring(2));

        // Returns a substring from start index to the end index. start index is included and end is excluded
        System.out.println(name.substring(1,3));

        // Returns a new string after replacing i with y. Hary is returned in this case.
        System.out.println(name.replace('i','y'));
        System.out.println(name.replace("ri","ir"));
        System.out.println(name.replace("i","ry"));

        // Returns true if name starts with string "Ha". true in this case.
        System.out.println(name.startsWith("Ha"));

        // Returns true if name ends with string "ri". true in this case.
        System.out.println(name.endsWith("ri"));

        // Returns character at a given index position. r in this case.
        System.out.println(name.charAt(2));

        // Returns the index of the given string. 2 is returned in this case.
        System.out.println(name.indexOf("ri"));

        String new_name = "harrirri";

        // Returns the index of the given string from the index 4(int). 5 is returned in this case.
        System.out.println(new_name.indexOf("rri",4));

        // Returns the last index of the given string. 2 is returned in this case.
        System.out.println(new_name.lastIndexOf("rri"));

        // Returns the last index of the given string before index 4.
        System.out.println(new_name.lastIndexOf("rri",4));

        // Returns true if the given string is equal to "Hari". true is returned in this case.
        System.out.println(name.equals("Hari"));

        // Returns true if two strings are equal ignoring the case of characters. true is returned in this case.
        System.out.println(name.equalsIgnoreCase("hari"));
    }
}
