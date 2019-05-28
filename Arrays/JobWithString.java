package OtherTasks;/*
Дана строка: Предложение    один      Предложение два      Предложение           три
Убрать лишние пробелы, расставить точки и т.д. (привести строку к обычному "книжному" виду)
*/

public class JobWithString {

    public static void main(String[] args) {
        String ss = "Предложение    один      Предложение два      Предложение           три";
        String ss1 = ss.replaceAll(" +", " ");
        StringBuilder ss2 = new StringBuilder(ss1);

        for (int i = 1; i < ss1.length(); i++) {
            if (ss1.charAt(i) >= 'А' && ss1.charAt(i) <= 'Я') {
                ss2.setCharAt(i - 1, '.');
            }
        }

        for (int i = ss1.length() - 1; i > 0; i--) {
            if (ss1.charAt(i) >= 'А' && ss1.charAt(i) <= 'Я') {
                ss2.insert(i, ' ');
            }
        }
        ss2.append('.');

        System.out.println(ss2.toString());
    }
}
