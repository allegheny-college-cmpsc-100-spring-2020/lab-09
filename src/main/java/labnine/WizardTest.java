package labnine;

/** Creates a WizardTest object.
 *
 * @author Solutions Repository
 */
public class WizardTest {

  private final String name;
  private final String magicWords;
  private final String potions;
  private final String style;
  private final int total;
  private boolean isPassing = false;

  /** Constructor.
   *
   * @param name Name of test taker
   * @param magicWords Letter score of the "Magic Words" portion
   * @param potions Letter score of the "Potions" portion
   * @param style Letter score of the "Style" portion
   */
  public WizardTest(String name, String magicWords, String potions, String style) {
    this.name = name;
    this.magicWords = magicWords;
    this.potions = potions;
    this.style = style;
    this.total = getNumericScore(magicWords) 
                 + getNumericScore(potions) 
                 + getNumericScore(style);
  }
  
  /** Converts letters scores to numeric scores.
   *
   * @param score Letter score of a given test section
   */
  private int getNumericScore(String score) {
    int numericScore;
    /* 
     * TODO: Write a switch statement to convert
     *       letter scores to numeric scores.
     */
    return numericScore;
  }
  
  /** Grades the exam based on letter score -> numeric score total.
   *
   */
  public void grade() {
    double average = (double)this.total / 3;
    /*
     * TODO: Write the correct if statement to assess if a score
     *       is passing or not, assign to instance variable isPassing.
     */
  }
  
  /** Creates String representation of object.
   *
   */
  public String toString() {
    String score;
    score = "Name: " + this.name + "\n\n";
    score += "Magic Words:\t" + this.magicWords + "\n";
    score += "Potions:\t" + this.potions + "\n";
    score += "Style:\t\t" + this.style + "\n";
    score += "\n";
    /*
     * TODO: Use instance variable isPassing to determine whether
     *       to append "PASSED" or "FAILED" to score.
     */
    return score;
  }
}