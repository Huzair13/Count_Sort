import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Count_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array !!!");
        int size = scanner.nextInt();

        System.out.println("Enter the array Elements !!!");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(countSort(array,size));

    }

    private static List<Integer> countSort(int[] array, int size) {

        List<Integer> list=new ArrayList<Integer>();
        int maxEle=Arrays.stream(array).max().getAsInt();
        int counter[]=new int[maxEle+1];

        for(int iterator=0;iterator<size;iterator++){
            counter[array[iterator]]++;
        }
        for(int iterator=0;iterator<=maxEle;iterator++){
            for(int j=0;j<counter[iterator];j++){
                list.add(iterator);
            }
        }
        return list;
    }

}