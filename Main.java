// PARTNER NAME: Blake Luna-Beltran 
// CS111 SECTION #: 111 3033
// DATE:2024/02/26

public class Main
    {
        public static void main (String[] args)
        {
            //DECLARATION + INITIALIZATION
            int month = 0;
            int day = 0;
            int year = 0;
            int jdnDate = 0;


            //INPUT SECTION


            //CALCULATION SECTION
           month = 03;
           day = 03;
           year = 2020;
           jdnDate = Main.calcJulianDate(month, day, year);


            //OUTPUT SECTION
            System.out.println("The calcluated Julian Date is:" + jdnDate);

           month = 8;
           day = 26;
           year = 1918;
          
            jdnDate = Main.calcJulianDate(month, day, year);
            System.out.println("The Calculated Julian Date for Katherine Jonshon's birthday is: " + jdnDate);

            month = 11;
           day = 22;
           year = 1996;
          
            jdnDate = Main.calcJulianDate(month, day, year);
            System.out.println("The Calculated Julian Date for my birthday is: " + jdnDate);



        }

        //DESCRIPTION: calculate julian date given month day and year
        //PRECONDITION: valid integers for month day and year, month < 12
        //POSTCONDITION: return an integer representing julian date
        public static int calcJulianDate(int month, int day, int  year)
        {
            int a = 0;
            int m = 0;
            int y = 0;
            int jdnToday = 0;

            a = (14- month) / 12;
            m = month +12 * a - 3;
            y = year + 4800 - a;
            jdnToday = day + (153 * m +2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

            return jdnToday;


        }
    }

