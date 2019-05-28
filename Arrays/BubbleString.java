package Arrays;

//Отсортировать(пузырьком) слова по длине символов

public class BubbleString {
    public static void main(String[] args) {
        String arr[] = {"aaaaaaaaa", "bbb", "cccccccc", "ddddd"};
        String a;
        for (int i = 1; i <arr.length ; i++) {
            for (int j = arr.length-1; j >=i ; j--) {
                if(arr[j-1].length()>arr[j].length()){
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