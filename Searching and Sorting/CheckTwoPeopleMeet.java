import java.util.Scanner;
public class CheckTwoPeopleMeet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if (x1 < x2 && v1 <= v2) 
            System.out.println("NO");
        else if (x1 > x2 && v1 >= v2)
            System.out.println("NO");
        else {
            if (Math.abs(x1 - x2) % Math.abs(v1 - v2) == 0)  
                System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}