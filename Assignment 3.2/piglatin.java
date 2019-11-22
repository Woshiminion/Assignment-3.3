import java.util.Scanner;
import java.util.*;
public class piglatin
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str + " ";
        ArrayList<String> strs = new ArrayList<String>();
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == ' '){
                String temp = str.substring(0,1);
                strs.add(temp);
                str =str.substring(i+1);
            }
        }
        for(int i = 0; i< strs.size();i++){
            if(strs.get(i).length()>2){
                String temp = strs.get(i);
                String ch = temp.substring(0,1);
                temp = temp.substring(1);
                temp = temp + ch + "ay";
                System.out.println(temp+" ");
            }else if (strs.get(i).length()<=2){
                System.out.println(strs.get(i)+ " ");
            }
        }
    }
}