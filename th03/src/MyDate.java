public class MyDate {
    private int year;
    private int month;
    private int day;

    private static String[] strMoths={
            "Jan","Feb","Mar","Apr","May","Jun",
            "Jul","Aug","Sep","Oct","Nov","Dec"
    };
    private static String[] strDays={
            "Sunday","Monday","Tuesday","Wednesday",
            "Thursday","Friday","Saturday"
    };
    private static int[] daysInMoths={
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1&&year<=1999){
            this.year = year;
        }else{
            System.out.println("nam k hop le");
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>=1&&month<=12) {
            this.month = month;
        }else{
            System.out.println("thang k hop le");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1&&day<=31) {
            if (month == 2&&day==29&&!MyDate.isLeadYear(year)) {
                System.out.println("ngay k hop le");
            } else if(month==2&&day>29) {
                System.out.println("ngay k hop le");
            }else{
                this.day=day;
            }

            if(day>30&&(month == 4 || month == 6 || month == 9 || month == 11)){
                System.out.println("ngay k hop le");
            }else{
                this.day=day;
            }

        }
    }
    public static boolean isLeadYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public static boolean isValidDate(int year,int month,int day){
        if((year>=1&&year<=1999)&&(month>=1&&month<=12)&&(day>=1&&day<=31)){
            if (month == 2&&day==29&&!MyDate.isLeadYear(year)) {
                System.out.println("ngay k hop le");
            } else if(month==2&&day>29) {
                System.out.println("ngay k hop le");
            }else{
                return true;
            }

            if(day>30&&(month == 4 || month == 6 || month == 9 || month == 11)){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
    public static int getDayOfWeek(int year,int month,int day){
//        First determine the day-of-week d1 of 1 January.
//                For a Gregorian calendar, the weekday is {\displaystyle (1+5((A-1)\%4)+4((A-1)\%100)+6((A-1)\%400))\%7}{\displaystyle (1+5((A-1)\%4)+4((A-1)\%100)+6((A-1)\%400))\%7}.[6] Alternatively, set C = A \ 100, Y = A % 100, and the value is {\displaystyle (1+5((Y-1)\%4)+3(Y-1)+5(C\%4))\%7}{\displaystyle (1+5((Y-1)\%4)+3(Y-1)+5(C\%4))\%7}.
//        For a Julian calendar, the weekday is {\displaystyle R(6+5R(A-1,4)+3(A-1),7)}{\displaystyle R(6+5R(A-1,4)+3(A-1),7)} or {\displaystyle R(6+5R(Y-1,4)+3(Y-1)+6C,7)}{\displaystyle R(6+5R(Y-1,4)+3(Y-1)+6C,7)}.
//        Now determine the month-related offset m by using the lookup table with M.
//                Return d = (d1 + m + D) % 7.
    }

}
