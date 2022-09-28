import java.util.Arrays;
import java.util.LinkedList;
/*
3. ***** Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
 http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181 Вычислить запись если это возможно.
 */
public class H4T3 {
    public static void main(String[] args) {
        String expr = "4 + 5.5 * ( 2 - 1 + 2 - 6 ) / 2";
        LinkedList<String> prsstr = new LinkedList<>(Arrays.asList(expr.split(" ")));
        LinkedList<String> postExpr = PostfixConverter(prsstr);
        System.out.println("Converted expression: " + postExpr);
        double res = Calculator(postExpr);
        System.out.println("Result: " + res);
    }

    private static boolean isNumber(String n) throws NumberFormatException {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static LinkedList<String> PostfixConverter(LinkedList<String> expr) {
        LinkedList<String> Stack = new LinkedList<>();
        LinkedList<String> Queue = new LinkedList<>();
        for (String i: expr) {
            if (i.equals("(")) Stack.push(i);
            else if (i.equals(")")){
                if (Stack.peek() != null) {
                    while (!Stack.peek().equals("(")) {
                        Queue.offer(Stack.peek());
                        Stack.pop();
                        if (Stack.isEmpty()) {
                            System.out.println("error in expression");
                            break;
                        }
                    }
                    Stack.pop();
                }
            }
            else if (isNumber(i)) {
                Queue.offer(i);
            }
            if (i.equals("+") || i.equals("-")){
                if (!Stack.isEmpty() && (Stack.peek().equals("+") || Stack.peek().equals("-")
                        || Stack.peek().equals("*") || Stack.peek().equals("/"))) {
                    Queue.offer(Stack.peek());
                    Stack.pop();
                    Stack.push(i);
                }
                else Stack.push(i);
            }
            if (i.equals("*") || i.equals("/")){
                if (!Stack.isEmpty() && (Stack.peek().equals("*") || Stack.peek().equals("/"))) {
                    Queue.offer(Stack.peek());
                    Stack.pop();
                    Stack.push(i);
                }
                else Stack.push(i);
            }
        }
        while (!Stack.isEmpty()) {
            if (Stack.peek().equals("(")) {
                System.out.println("Error in expr. Missed -> )");
                break;
            }
            Queue.offer(Stack.peek());
            Stack.pop();
        }
        return Queue;
    }

    public static Double Calculator(LinkedList<String> expression) {
        LinkedList<Double> Stack = new LinkedList<>();
        double result = 0;
        for (String i: expression) {
            if (isNumber(i)) {
                double num = 0;
                num = Double.parseDouble(i);
                Stack.push(num);
            }
            else if (i.equals("+")) {
                result = Stack.get(1) + Stack.get(0);
                Stack.pop();
                Stack.pop();
                Stack.push(result);
            }
            else if (i.equals("-")) {
                result = Stack.get(1) - Stack.get(0);;
                Stack.pop();
                Stack.pop();
                Stack.push(result);
            }
            else if (i.equals("*")) {
                result = Stack.get(1) * Stack.get(0);;
                Stack.pop();
                Stack.pop();
                Stack.push(result);
            }
            else if (i.equals("/")) {
                result = Stack.get(1) / Stack.get(0);;
                Stack.pop();
                Stack.pop();
                Stack.push(result);
            }
        }
        return Stack.peek();
    }
}

