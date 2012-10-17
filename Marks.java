import java.util.*;

public class Marks {
Scanner scanner = new Scanner(System.in);



    public void checkMarks() {
        int mark;
	int counter = 0;
	int countDist = 0;
	int countPass = 0;
	int countInvalid = 0;
	int countFail = 0;
	        do {
            System.out.println("Give me marks, -1 to finilize");
            mark = scanner.nextInt();
            counter++;
		if (mark>=70 && mark<=100) {
		countDist++;
		}
            	else if (mark>=50 && mark<=69) {
		countPass++;
		}
		else if (mark>=0 && mark<=49) {
		countFail++;
		}
		else  {
		countInvalid++;
		counter--;
		}
            
            
            
            }
        
       while (mark!=-1);
	
System.out.println("There are " +(counter) + " students : " +countDist + " distinctions, " +countPass + " pass, " + countFail + " fails, " +(countInvalid-1) + " invalid");
        
     }
    
   
    
 public static void main(String[] args) {

      Marks marks = new Marks();
      marks.checkMarks();

 }  
}
