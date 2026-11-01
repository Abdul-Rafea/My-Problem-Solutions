import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int words = input.nextInt();
        input.nextLine();
        
        String[] strings = new String[words];
        
        for(int i = 0; i < words; i++) {
            String string = input.nextLine();
            int letters = string.length();
            if(letters > 10) {
                String lettersCount = String.valueOf(letters - 2);
                strings[i] = string.charAt(0) + lettersCount + string.charAt(letters - 1);
            }
            else {
                strings[i] = string;
            }
        }

        for(int i = 0; i < words; i++) {
            System.out.print(strings[i]);
            if(i != words - 1) {
                System.out.print("\n");
            }
        }

        input.close();
    }
}