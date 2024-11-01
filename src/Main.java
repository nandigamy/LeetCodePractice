import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        Duplicate d  = new Duplicate();
        System.out.println("duplciate value "+ d.hasDuplicate( new int[] {1,2,3,4,1}));

        DuplicateSorting ds = new DuplicateSorting();
        System.out.println("duplciate sorting value "+ ds.hasDuplicateSorting( new int[] {1,2,3,4}));

        ConcatenationOfArray coa = new ConcatenationOfArray();
      int[ ] result= coa.getConcatenation( new int[] {1,2,3,4});
      for ( int n: result){
          System.out.print(" "+ n);
      }

        ReplaceGreatestRight rgr = new ReplaceGreatestRight();
        System.out.println("rgr. "+ Arrays.toString(rgr.replaceElements(new int[]{1, 2, 3, 4})));


    }
}