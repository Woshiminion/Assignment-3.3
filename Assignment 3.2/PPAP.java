import java.util.Scanner;
class PPAP{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String firstword = sentence.substring(9,sentence.indexOf(","));
        String secondword = sentence.substring(sentence.lastIndexOf(" ")+1, sentence.length()-1);
        secondword = secondword.substring(0,1).toUpperCase() + secondword.substring(1);
        System.out.println("Uh, " + secondword + " " + firstword);
    }
}