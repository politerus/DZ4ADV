package Task2;

public class deshefrator {
        public static void main(String[] args) {
            String str = "  1. За кілька годин почнеться вистава.\n" +
                         " 2. На моєму подвір'ї ростуть квіти.\n" +
                         " 3. Біля площі люди зібрались на мітинг.\n" +
                         " 4. Від моєї подружки ніколи не дочекаєшся ніжності.\n" +
                         " 5. Мій однокласник запросив мене у кіно.\n" +
                         " 6. З третьої до четвертої години у цій установі перерва.\n" +
                         "7. Після уроків ми збираємось погуляти з друзями.\n" +
                         " 8. Через річку розкинувся місточок. \n" +
                         " 9. Без ниток я не зможу зашити свою сукню.\n" +
                         "10.  Я дуже часто думала про нашу Батьківшину. " ;

            String[] arrStr = str.split("\\s");

            for (String elem : arrStr ) {
                if(elem.equalsIgnoreCase("за") || elem.equalsIgnoreCase("на") ||
                        elem.equalsIgnoreCase("біля")|| elem.equalsIgnoreCase("від") ||
                        elem.equalsIgnoreCase("у") || elem.equalsIgnoreCase("з") ||
                        elem.equalsIgnoreCase("до") || elem.equalsIgnoreCase("після") ||
                        elem.equalsIgnoreCase("через") || elem.equalsIgnoreCase("без") ||
                        elem.equalsIgnoreCase("про") ){
                    elem = " Java";
                }
                System.out.print(elem + "  ");
            }

        }
    }
/*    Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі
        могла б замінити всі прийменники слово «Java».
 */
