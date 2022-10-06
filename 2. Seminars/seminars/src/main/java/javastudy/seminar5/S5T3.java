package javastudy.seminar5;

import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/*
    Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */
public class S5T3 {
    public static Map<Character, Character> braketsMap = Map.of(
            '(',')',
            '[',']',
            '{','}',
            '<','>');
    public static void main(String[] args) {
        LinkedList<Character> Stack = new LinkedList<>();
        String str = "(a+1*3";
        for(char c : str.toCharArray()) {
            if (braketsMap.containsKey(c)) {
                Stack.push(c);
            }
            else {
                if (Stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                if (braketsMap.containsValue(c)) {
                    if (!Stack.peek().equals(Stack.pop())) {
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        System.out.println(Stack.isEmpty());
    }


}
