import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();
        int squares = rows * cols;

        if(squares % 2 == 0) {
            System.out.print(squares / 2); 
        }
        else{
            System.out.print((squares - 1) / 2);
        }

        input.close();
    }
}