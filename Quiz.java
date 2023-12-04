import java.util.Scanner;
import java.util.Random;
public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();

        char menu = 'y';
        do{
            int number = rand.nextInt(10) + 1;
            boolean succes = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                succes = (answer == number);

                if (!succes) {
                    System.out.println(answer < number ? "Lebih besar!" : "Lebih kecil");
                }

            }while(!succes);
            System.out.print("Apakah anda ingin mengulang permainan (Y/T)");
            menu = input.next().charAt(0);
            input.nextInt();
        }while (menu == 'Y' || menu == 'y');
        System.out.println("Terima kasih telah bermain!");
    }
}