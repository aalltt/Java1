package Arrays;
// Найти максимальный и минимальынй элемент в массиве c помощью foreach
public class ArrayMinMaxWithForEach {
    public static void main(String[] args) {
        int[] arr = {4444, -1, 10, -5};
        int max = arr[0];
        int min = arr[0];
        for (int h : arr) {
            if (h > max) {
                max = h;
            }
            if (h < min) {
                min = h;
            }
        }
        System.out.println(max + " " + min);

// Найти максимальный и минимальынй элемент в массиве
//        for (int i = 0, j=0; i <arr.length  ; i++) {
//            if (arr[i] > max) {
//                max=arr[i];
//            }
//            if (arr[i] < min) {
//                min=arr[i];
//            }
//        }
//     System.out.println(max + " " + min);
    }
}
