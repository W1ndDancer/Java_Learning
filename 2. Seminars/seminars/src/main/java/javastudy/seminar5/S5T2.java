package javastudy.seminar5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */
public class S5T2 {
    public static void main(String[] args) {
        System.out.println(IsIsomorphic("foo","bar"));
        System.out.println(IsIsomorphic("paper","title"));
        System.out.println(IsIsomorphic("add","egg"));
        System.out.println(IsIsomorphic("note","code"));

    }

    public static boolean IsIsomorphic (String str1, String str2) {
        Map<Character, Character> characterMap = new HashMap<>();
        Set<Character> characterSet = new HashSet<>();
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (characterMap.containsKey(c1)) {
                if (characterMap.get(c1) != c2) return false;
            }
            else {
                if (characterSet.contains(c2)) return false;
                characterMap.put(c1, c2);
                characterSet.add(c2);
            }
        }
        return true;
    }
}
