package store;

public class Store {
    static int findSum(int number)
    {
        int sum = 0;
        while (number != 0)
        {
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }
    public static boolean validateCreditCard(int[] arr){
        if(arr.length==16){
            for (int i :arr) {
                if(i<=0||i>=9) {
                    return false;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(i%2==0){
                    arr[i]=arr[i]*2;
                }
            }
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<10){
                    sum+=arr[i];
                }else{
                    sum+=findSum(arr[i]);
                }
            }
            if(sum%10!=0){
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
    public static boolean validateIsbn(String s){
        if(s.length()==10){
            String[] arr= s.split("");
            for (int i = 0; i < 9; i++) {
                    try{
                        int number = Integer.parseInt(arr[i]);
                        if(number<=0||number>=9){
                            return false;
                        }
                    }
                    catch (NumberFormatException ex){
                        ex.printStackTrace();
                        return false;
                }
            }
            String last=arr[arr.length-1];
            String regex = "\\d+";

            if(!(last.equals("X")||
                    (
                            last.matches(regex)&&
                            (Integer.parseInt(last)>=0&&Integer.parseInt(last)<=9)
                    )
            )){
                 return false;
            }
            int sum=0;
            for (int i = 0; i < 9; i++) {
                try{
                    int number = Integer.parseInt(arr[i]);
                    if(number%10==0){
                        sum=number*(10-i);
                    }
                }

                catch (NumberFormatException ex){
                    ex.printStackTrace();
                    return false;
                }
            }
            if(last.equals("X")){
                sum+=9;
            }
            if(last.matches(regex)){
                sum+=10;
            }
            if(sum%11!=0){
                return false;
            }
            return true;
        }else{
        return false;
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
        System.out.println(validateCreditCard(arr));
        System.out.println(validateIsbn("123456789X"));
    }
}
