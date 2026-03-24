import java.util.Scanner;

public class prog1 {

    public static int sub(int x,int y) {
        return x - y;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();

        int answer=sub(x,y);
        System.out.println(ans);

    }
}