// cd Documents\Code\VsCode\cp-Workspace\Codeforces\work-spaces

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int participantCount = input.nextInt();
        int position = input.nextInt();
        int[] participants = new int[participantCount];

        for(int i = 0; i < participantCount; i++) {
            participants[i] = input.nextInt();
        }

        int passedCount = 0;

        for(int i = 0; i < position; i++) {
            if(participants[i] > 0) {
                passedCount++;
            }
        }
        
        for(int i = position; i < participantCount; i++) {
            if(participants[position - 1] == participants[i] && participants[i] > 0) {
                passedCount++;
            }
        }

        System.out.print(passedCount);

        input.close();
    }
}
