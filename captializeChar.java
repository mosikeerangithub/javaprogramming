import java.util.Scanner;

class captializeChar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        //String a = "eyes are red since you were dry running dynamic programming";
        String output = "";
        char firstChar = Character.toUpperCase(a.charAt(0));
        String FirstAndlastChar = "";

        output = String.valueOf(firstChar);

        int i = 1;
        while(i<a.length()-1){
            if(a.charAt(i+1)==' '){
                FirstAndlastChar = a.charAt(i) + " " + a.charAt(i+2);
                // firstChar = a.charAt(i+1);
                // output = output + Character.toUpperCase(lastChar) + " " + Character.toUpperCase(firstChar);
                output = output + FirstAndlastChar.toUpperCase();
                i = i+3; // since I don't want firstChar as it added and current i == space
            }
            else{
                output += a.charAt(i);
                i++;
            }
        }

        FirstAndlastChar = String.valueOf(Character.toUpperCase(a.charAt(a.length()-1)));
        output += FirstAndlastChar;

        System.out.println(output);
    }
}