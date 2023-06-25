import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

    String s ="name\":Ivanov\", \"country\": \"Russia\", \"city\":\"Moscow\", \"age\":\"null";
        
      String s1 = s
      .replaceAll("\\p{P}", " ")
      .replace(",", " ")
      .replace("null", " ")
      .replaceAll("\\s", " ");
      System.out.println(s1);
      String [] arr = s1.split("   ");
      System.out.println(Arrays.toString(arr));              
    
      String s2 = "фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
      String s3 = s2
      .replaceAll("\\p{P}", " ")
      .replace(",", " ")
        .replace("}{", " ")
      .replace("null", " ")
      .replaceAll("\\s", " ");
      System.out.println(s3);
      String[] arr2 = s3.split("   ");
      System.out.println(Arrays.toString(arr2));
        
        
    }
}
   
 