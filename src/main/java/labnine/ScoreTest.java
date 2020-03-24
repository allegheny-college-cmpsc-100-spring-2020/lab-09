package labnine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Scores a three-part wizard test.
 *
 * @author Solutions Repository
 */
public class ScoreTest {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create Scanner to read file
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/test.scores");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    /*
     * TODO: Use Scanner instance to read the first line from the file
     *       the value of which represents the test-taker's name.
     */
    
    /*
     * TODO: Use Scanner instance to read the next three lines of the file, which represent:
     *       - score on "magic words" section
     *       - score on "potions" section
     *       - score on "style" section
     */
    
    /*
     * TODO: Create a new instance of WizardTest with the values read above
     */
    
    /*
     * TODO: Use the appropriate method of WizardTest to grade the instance created above
     */
    
    /*
     * TODO: Print the results of the WizardTest using the toString method of WizardTest
     */
  }
}