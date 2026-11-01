import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int problems = input.nextInt();
        int solutions = 0;
        
        for(int i = 0; i < problems; i++) {
            int person1 = input.nextInt();
            int person2 = input.nextInt();
            int person3 = input.nextInt();
            
            int sureCount = 0;
            if(person1 == 1) {
                sureCount++;
            }
            if(person2 == 1) {
                sureCount++;
            }
            if (person3 == 1) {
                sureCount++;
            }

            if(sureCount > 1) {
                solutions++;
            }
        }

        System.out.print(solutions);
        
        input.close();
    }
}