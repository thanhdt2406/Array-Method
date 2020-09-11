import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Enter character: ");
        char c = scanner.next().charAt(0);
        int count=0;
        for(int i=0;i<inputStr.length();i++){
            if(inputStr.charAt(i)== c){
                count++;
            }
        }
        System.out.println("The letter '"+c+"' appears "+count+" times");
    }
}
