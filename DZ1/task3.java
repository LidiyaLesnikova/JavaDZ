import java.util.Scanner;
import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        //Реализовать простой калькулятор
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the expression to be calculated '+-*/()': ");
        String expression = scanner.nextLine();
        expression = expression.replaceAll(" ", "");
        char[] numbers = new char[] {'0','1','2','3','4','5','6','7','8','9'};
        long chek = expression.chars().filter(ch -> ch!='/' && ch!='*' && ch!='+' && ch!='-' && ch!='(' && ch!=')' && 
                                              ch!='.' && ch!=',' && ch!=numbers[(int)ch-48]).count();
        if (chek>0){
            System.out.println("Неверный ввод выражения");
        } else {
            System.out.println(calculator(expression));           
        }
        scanner.close();
    }

    public static String calculator(String str) {
        String substr = "";
        String rez = "";
        if (str.contains("(") & str.contains(")")) {
            substr = str.substring(str.indexOf("(")+1, str.indexOf(")"));
            rez = getExpression(substr.split(""));
            str = str.replace(substr, rez).replace("(","").replace(")","");
        }

        long counte = str.chars().filter(ch -> ch == '/' || ch == '*' || ch == '+' || ch == '-').count();
        while (counte>=2) {
            counte = str.chars().filter(ch -> ch == '/' || ch == '*' || ch == '+' || ch == '-').count();
            if (counte>1) {
                char[] operations = str.toCharArray();
                ArrayList<Integer> indexAll = new ArrayList<Integer>();
                for (int i = 0; i < operations.length; i++) {
                    if (operations[i] == '/' || operations[i] == '*' || operations[i] == '+' || operations[i] == '-'){
                        indexAll.add(i);
                    }
                }
                int index = -1;
                for (int j = 0; j<operations.length & index==-1; j++) {
                    if (operations[j] == '/' || operations[j] == '*'){
                        index = j; //indexAll.add(i);
                    }
                }
                
                if (index==-1) {
                    substr = str.substring(0, indexAll.get(1));
                } else {
                    int a = indexAll.indexOf(index);
                    if (a==0){
                        substr = str.substring(0, indexAll.get(1));
                    } else if (a==indexAll.size()-1){
                        substr = str.substring(indexAll.get(a-1)+1, str.length());
                    } else {
                        substr = str.substring(indexAll.get(a-1)+1, indexAll.get(a+1));
                    }
                }
                rez = getExpression(substr.split(""));
                str = str.replace(substr, rez);
            } else {
                str = getExpression(str.split(""));
            }
        }
        return str;
    }

    public static String getExpression(String[] elements) {
        Double number1 = 0.0;
        Double number2 = 0.0;
        String strNumber = "";
        String operator = "";
        for (int i = 0; i < elements.length; i++) {
            if ((elements[i].charAt(0)=='.') || (elements[i].charAt(0)==',') || (Character.isDigit(elements[i].charAt(0))==true)) {
                strNumber += elements[i];
                if (i == elements.length-1){
                    number2 = Double.parseDouble(strNumber);
                }
            }
            else {
                number1 = Double.parseDouble(strNumber);
                strNumber = "";
                operator = elements[i];
            } 
        }
        return actions(operator, number1, number2).toString();
    }

    public static Double actions(String operator, Double num1, Double num2) {
        Double rezult = 0.0;
        switch (operator) {
            case "+":
                rezult = num1+num2;
                break;
            case "-":
                rezult = num1-num2;
                break;
            case "/":
                rezult = num1/num2;
                break;
            case "*":
                rezult = num1*num2;
                break;
            // default:
            //     break;
        }
        return rezult;
    }
}
