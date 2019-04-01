import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        display(names);



    }
    public static void display(ArrayList<String> names){

        System.out.println("The size of the list is " + names.size());
        for (int i = 0; i < names.size(); i++){
            System.out.println();
        }
    }
}
