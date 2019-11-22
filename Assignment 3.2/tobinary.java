import java.util.Scanner;
class tobinary{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = "";
        while(num >0){
            int x = num%2;
            num = num/2;
            ans = x + ans;

        }
        System.out.println (ans);
    }

}
