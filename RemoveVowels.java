import java.util.Scanner;

class RemoveVowels{
    public static void main(String[] args) {
        //String a = "abeiouc";
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String output = "";

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='a' && a.charAt(i)!='e' && a.charAt(i)!='i' && a.charAt(i)!='u' && a.charAt(i)!='o'
            && a.charAt(i)!='A' && a.charAt(i)!='E' && a.charAt(i)!='I' && a.charAt(i)!='U' && a.charAt(i)!='O'){
                output += a.charAt(i);
            }
        }

        System.out.println(output);
    }
}