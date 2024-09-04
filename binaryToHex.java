import java.util.Scanner;

class binaryToHex {
    public static void main(String[] args){
        //char[] a = {'A','B','C','D','E','F'};
        String a = "ABCDEF"; // or using ASCII values 'A' - 65 = 1, 'B' - 65 = 2
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        //int decimal = 450;
        String Hexad = "";

        int quo = decimal/16;
        int rem = decimal%16;

        Hexad += rem; //using arith to avoid type conversionn error
        if(rem>9){
            Hexad += a.charAt(rem-10); //indexing
        }

        while(quo>0){
            rem = quo%16;
            quo = quo/16;
            if(rem>9){
                Hexad += a.charAt(rem-10);
            }
            else{
                Hexad += rem;
            }
        }

        for(int i=Hexad.length()-1;i>=0;i--){
            System.out.print(Hexad.charAt(i));
        }
    }

}