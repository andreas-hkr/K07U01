import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Ett tal? ");
        String t = scan.nextLine();
        boolean ok = true;
        for (int i=0; i < t.length(); i++)
            if (t.charAt(i) < '0' ||t.charAt(i) > '9') {
                ok = false;
                break;
            }
        if (ok)
            System.out.println("Talet är OK");
        else
            System.out.println("Inget tal");
    }
}