package Arrays;

//Шилдт. Сортировка пузырьком (для просмотра работы алгоритма в Debug и выполнения задания BubbleString)

public class BubbleShildt {
    public static void main(String[] args) {
        int arr[] = {-2, 3, 10, -1};
        int a;
        for (int i = 1; i <arr.length ; i++) {
            for (int j = arr.length-1; j >=i ; j--) {
                if(arr[j-1]>arr[j]){
                    a=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=a;
               }
            }
        }
        for (int f = 0; f < arr.length; f++) {
            System.out.print(arr[f] + " ");
        }
    }
}

