package code.java.RandomStringChooser;

import java.lang.Math;
import java.util.ArrayList;

class RandomStringChooser {

  private ArrayList<String> words = new ArrayList<String>();

  public RandomStringChooser(String[] wordArray) {
    for (String word : wordArray) {
      words.add(word);
    }
  }

  public String getNext() {
    if (words.size() == 0) {
      return "NONE";
    }

    int idx = (int)Math.floor(Math.random() * words.size());
    String word = words.get(idx);
    words.remove(idx);

    return word;
  }

}
