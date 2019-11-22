import java.util.Scanner;
class palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String string ="";
        boolean isRight = true;
        for(int i = 0; i<str.length();i++){
            if(Character.isLetter(str.charAt(i))==true){
                string += str.charAt(i);
            } 
        }
        for(int i = 0; i<=(string.length()/2);i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                isRight = false;
            }
        }
        System.out.println (isRight);

    }
}
