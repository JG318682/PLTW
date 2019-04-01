import java.util.Scanner;

public class RandomThingBrosiusIsAngeryAbout {

    public static void main(String[] args){
        int[] list = new int[5];
        Scanner keyboard = new Scanner(System.in);

        float total = 0;
        float mean = 0;

        for (int a = 0; a < list.length; ++a){
            System.out.print("Enter number " + (a + 1) + ">>> ");
            list[a] = keyboard.nextInt();
        }

        for(int m = 0; m < list.length; m++){

            total = total + list[m];
        }
        mean = total / list.length;

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");

        }
        int median = list[2];

        System.out.println("");
        System.out.println("The mean is " + mean);
        System.out.println("The median is " + median);

    }

}

//
//        for(int a = 0; a < list.length; a++) { total = total + list[a]; }
//
//        for(int m = 0; m < list.length; m++) { allAdded = allAdded + list[m]; }
//        mean = allAdded / list.length;
//
//        for (int i = 0; i < list.length; i++){ System.out.print(list[i] + " "); }
