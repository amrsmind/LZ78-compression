
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.util.Pair; 

/////////////////////////////////////////////////composition 


public class Lz78 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		String str = In.nextLine();
		//System.out.println(str);
		In.close(); 
		ArrayList<String> tbl = new ArrayList<String>(1);
		tbl.add("");
		//HashMap<Integer,Character> tags = new HashMap();
		ArrayList<Pair<Integer,Character>> tags = new ArrayList<Pair<Integer,Character>>(1);
		int strlen = str.length();
        int i=0;
        String temp = "";
        int tempnumber=0;
        while(i<strlen) {
           temp+=str.charAt(i);
           if(tbl.contains(temp)){
        	   i++;
               tempnumber = tbl.indexOf(temp);
               if(i==strlen) {
                   //tags.add(tempnumber, str.charAt(i-1));
            	   Pair<Integer,Character> pairtemp = new Pair<Integer,Character>(tempnumber,' ');
            	   tags.add(pairtemp);
                   break;
               }
        	   continue;
           }
    	   Pair<Integer,Character> pairtemp = new Pair<Integer,Character>(tempnumber, str.charAt(i));
    	   tags.add(pairtemp);           
           tbl.add(temp);
           temp = "";
           i++;
        }
  
        for (Pair<Integer,Character> p: tags){ 
            System.out.println(p.getKey() + " " + p.getValue());
	}
        /////////////////////////////////////////////////composition 
        
        

}
	
	
}
