import java.util.List;
import java.util.ArrayList;

public class Classwork {
  public static List<String> makeAllWords(int k, int maxLetter) {
    List<String> words = new ArrayList<String>();
    wordsH(words, k, maxLetter, "");
    return words;
  }

  private static void wordsH(List<String> words, int k, int m, String word) {
    if (m == 0) {
      System.out.println(word);
      words.add(word);
    }
    else {
      wordsH(words, k, m-1, word);
      wordsH(words, k, m-1, word+((char)('a'-1+m)));
    }
  }

  public static void main(String[] args) {
    makeAllWords(1, 3);
  }
}
