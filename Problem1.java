import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        // list 입력 코드
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            list.add(num);
        }
        for (int i = 0; i < 5; i++) {
            double num = input.nextDouble();
            list.add(num);
        }

        sort(list);

        // list 출력 코드
        for (Number num : list) {
            System.out.print(num + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        // list 정렬 코드
        Collections.sort(list, new Comparator<Number>() {
            @Override
            public int compare(Number num1, Number num2) {
                return Double.compare(num1.doubleValue(), num2.doubleValue());
            }
        });
    }
}
