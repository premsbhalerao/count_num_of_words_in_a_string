public class count_num_words_in_a_string {
  public static void main(String[] args) {
    String words = "prem siddharth bhalerao";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
  }
}
