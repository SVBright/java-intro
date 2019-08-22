package lesson2;

public class ChartAtEx {
    public static void main(String args[]){
        //Set your values here:
        String str = "Welcome";
        int n = 1;
        String finalResult = eachNth(str, n);
        System.out.println(finalResult);

    }
    private static String eachNth(String str, int n){
        String strR = "";
        int strL = str.length();

        for (int i = 0; i <= strL-1; i = i+n) {
            strR = strR + str.charAt(i);
        }

        return strR;
    }
}