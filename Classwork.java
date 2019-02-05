import java.util.List;
import java.util.ArrayList;

public class Classwork {
  public static List<String> makeAllWords(int k, int maxLetter) {
    List<String> words = new ArrayList<String>();
    wordsH(words, k, maxLetter, "");
    return words;
  }

  private static void wordsH(List<String> words, int k, int m, String word) {
  	if (k == 0) {
  		words.add(word);
  		//System.out.println(word);
  	}
  	else {
  		for (int i = 0; i < m; i++) {
  			wordsH(words, k-1, m, (word+(char)('a'+i)));
  		}
  	}
  }

  public static String printList(List<String> x) {
        String s = "[";
        for (int i = 0; i < x.size(); i++) {
            s+= x.get(i);
            if (i < x.size()-1) {
                s+=", ";
            }
        }
        s+="]";
        return s;
    }

  public static void main(String[] args) {
    System.out.println(printList(makeAllWords(1,26)));
    System.out.println(printList(makeAllWords(2,26)));
    System.out.println(printList(makeAllWords(3,3)));
    System.out.println(printList(makeAllWords(4,2)));
  }
}
