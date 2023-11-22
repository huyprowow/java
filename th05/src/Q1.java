import java.util.*;
public class Q1 {
    public static void printTypeOfChar(char c){
        if(c>=65&&c<=90) {
            System.out.println("UPPERCASE");
        }else if (c>=97&&c<=122){
            System.out.println("LOWERCASE");
        }else{
            System.out.println("SYMBOL");
        }

    }

    public static int countUppercase(String s){
        int upperCase=0;
        for (int k = 0; k < s.length(); k++) {

            if (Character.isUpperCase(s.charAt(k))) {
                upperCase++;
            }
        }
        return upperCase;

    }
    public static boolean isPrime(int num) {
        boolean flag = false;
        if(num<2){
            flag=true;

        }
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        return flag;
    }
    public static int[] firstPrimeNumbers(int n){
        List<Integer> list=new ArrayList<Integer>();
        int i=0;
        while(list.size()<n){
            i++;
            if(isPrime(i)){
                list.add(i);

            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
    public static int[] caculateFactors(int n){
        List<Integer> list=new ArrayList<Integer>();
            for (int j=1;j<=n;j++)
            {
                if (n%j==0) {
                    list.add(j);
                }
            }
        return list.stream().mapToInt(x->x).toArray();
    }
    public static void main(String[] args) {
        printTypeOfChar('Z');
        System.out.println(countUppercase("Huy"));
    }
}
