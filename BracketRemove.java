import java.util.*;

class BracketRemove{
    public static void main(String[] args){
        //String a = "a+((b-c)+d)";
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String output = "";

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='(' && a.charAt(i)!=')'){ //if OR is used any one condition will be satisfied
                // Example : a[i] = '(' - a.charAt(i)!='(' || a.charAt(i)!=')' => here a.charAt(i)!=')' this is satisfied.
                output += a.charAt(i);
            }
        }

        for(int i=0;i<output.length();i++){
            System.out.print(output.charAt(i));
        }
        
    }
}