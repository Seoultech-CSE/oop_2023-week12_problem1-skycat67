import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");
        
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            list.add(num);
        }
        for (int i = 0; i < 5; i++) {
            double num = input.nextDouble();
            list.add(num);
        }

        sort(list);

        for (Number num : list) {
            System.out.print(num + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {

         Collections.sort(list);

    }
}
