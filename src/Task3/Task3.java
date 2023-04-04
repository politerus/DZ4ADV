package Task3;

import java.util.GregorianCalendar;


public class Task3 {

    public static void birthday(GregorianCalendar birthday){

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        int years = 0;
        int month = 0;
        int days = 0;
        int hours = gregorianCalendar.get(gregorianCalendar.HOUR_OF_DAY);
        int minutes = gregorianCalendar.get(gregorianCalendar.MINUTE);
        int seconds = gregorianCalendar.get(gregorianCalendar.SECOND);

        if((gregorianCalendar.get(gregorianCalendar.DAY_OF_YEAR)) >= (birthday.get(birthday.DAY_OF_YEAR))) {
            years = gregorianCalendar.get(gregorianCalendar.YEAR) - birthday.get(birthday.YEAR);
            month = gregorianCalendar.get(gregorianCalendar.MONTH) - birthday.get(birthday.MONTH);
        }
        else{
            years = gregorianCalendar.get(gregorianCalendar.YEAR) - birthday.get(birthday.YEAR) - 1;
            month = 12 - (birthday.get(birthday.MONTH));
        }

        if(gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH) < birthday.get(birthday.DAY_OF_MONTH)){
            days = gregorianCalendar.getActualMaximum(gregorianCalendar.DAY_OF_MONTH) - (birthday.get(birthday.DAY_OF_MONTH)
                    - gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH));
        }
        else {
            days = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH) - birthday.get(birthday.DAY_OF_MONTH);
        }

        System.out.println("Вам виповнилося :"+ "\n"
                +  years + " років, " +  month + " місяців, "
                +   days + " днів; " + "\n" + hours + " годин, "
                + minutes + " хвилин,"  + seconds + " секунд.");

    }

    public static void main(String[] args) {

           int year = 1992;
           int month = 1;
           int day = 20;



        GregorianCalendar myBirthday = new GregorianCalendar(year,month-1,day);
        birthday(myBirthday);
    }
}
/*
Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
За допомогою цього методи виведіть у консоль,
скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді,
 наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».
 */

