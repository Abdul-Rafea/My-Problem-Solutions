import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        int x = 0;

        for(int i = 0; i < lines; i++) {
            String line = input.nextLine();
            boolean isPlus = false;

            for(int j = 0; j < 3; j++) {
                if(line.charAt(j) == '+') {
                    isPlus = true;
                    break;
                }
                else if(line.charAt(j) == '-') {
                    isPlus = false;
                    break;
                }
            }

            if(isPlus) {
                x++;
            }
            else {
                x--;
            }
        }

        System.out.print(x);
        
        input.close();
    }
}
