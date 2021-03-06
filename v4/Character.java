import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Character{

  String _name;
  int _confidence;
  int _intelligence;
  int _kindness;

//  Stack<String> _dialogue;
  Scanner fileReader;

  public Character(String name) {
      _name = name;
      _dialogue = new Stack<String>();
      _confidence = 0;
      _intelligence = 0;
      _kindness = 0;
  }

 /*
  public void addLine(String line) {
      _dialogue.push(line);
  }

  public void addLines(File lines) {
      try {
        fileReader = new Scanner(lines);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
      readBackwards();
  }

  //bug fix in v2: was previously printing "" when the file reader had no next line
  public void readBackwards() {
    if (!fileReader.hasNextLine()) {
        return;
    }
    String line = fileReader.nextLine();
    readBackwards();
    addLine(line);
  }

  public String sayLine() {
      System.out.println(_name + ": " + _dialogue.peek());
      return _dialogue.pop();
  }
  */

  public int getConfidence() {
      return _confidence;
  }

  public int getIntelligence() {
      return _intelligence;
  }

  public int getKindness() {
      return _kindness;
  }

  public String getName() {
      return _name;
  }

  //New addition in v2
  // public Stack<String> getDialogue() {
  //     return _dialogue;
  // }

  public void setConfidence(int confidence) {
      _confidence = confidence;
  }

  public void setIntelligence(int intelligence) {
      _intelligence = intelligence;
  }

  public void setKindness(int kindness) {
      _kindness = kindness;
  }


}
