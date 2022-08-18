import java.util.Scanner;

public class Main {
    public static void ToUpper() {
        char ch;
        String n, old;
        System.out.println("Enter your Statement : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String x[];
        str = str.toLowerCase();
        x = str.split(" ");
        for (String s : x) {
            ch = s.charAt(0);
            n = String.valueOf(ch);
            old = n;
            n = n.toUpperCase();
            System.out.print(s.replace(old, n) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        // way one
//        int check ;
//        Scanner in = new Scanner(System.in);
//        System.out.println("How many numbers Do u havev ? ");
//        check = in.nextInt();
//        for (int i = 0 ; i < check ; i++){
//            ToUpper();
//        }
        // way 2
        String check2;
        do {
            ToUpper();
            System.out.println("Do you have another statement ? (y/n) : ");
            Scanner in = new Scanner(System.in);
            check2 = in.nextLine();
        } while (check2.equals("y"));


    }
}