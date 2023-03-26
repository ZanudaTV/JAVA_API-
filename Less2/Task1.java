package Less2;



public class Task1 {
    // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
    // используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    public static void main(String[] args) {
        String enterString = "select * from students where ";
        StringBuilder strResult = new StringBuilder();
        String inputStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String newStr = inputStr.replaceAll("[\"{}]","");
        System.out.println(newStr);
        String[] strArr = newStr.split(",");
//
        for (String item : strArr) {
            if (!item.contains("null")){
                strResult.append(enterString + item.strip().replace(":"," = ")+ "\n");
            }
        }
        System.out.println(strResult);


    }
}