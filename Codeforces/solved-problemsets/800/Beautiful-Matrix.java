import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int row = 0;
        int col = 0;

        for(row = 1; row <= 5; row++) {
            boolean found = false;

            for(col = 1; col <= 5; col++) {
                if(read.nextInt() == 1) {
                    found = true;
                    break;
                }
            }

            if(found) {
                break;
            }
        }
        
        System.out.print(Math.abs(row - 3) + Math.abs(col - 3));

        read.close();
    }
}
