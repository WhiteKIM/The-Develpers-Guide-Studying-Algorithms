import java.util.Scanner;
/*
* 백준 24060문제
* 합병정렬에서 정렬되는 특정 번쨰 수 찾기
* */
public class p24060 {
    private static int count = 0;
    public static int answer = -1;
    public static boolean check = true;
    public static int list[];
    public static int sorted[];
    public static void merge(int arr[], int left, int mid, int right, int num) {
        int leftIndex, rightIndex, i, j;

        leftIndex = left;
        rightIndex = mid+1;
        i = left;

        while(leftIndex <= mid && rightIndex <= right) {
            if(arr[leftIndex] <= arr[rightIndex]) {
                sorted[i++] = arr[leftIndex++];
            }
            else {
                sorted[i++] = arr[rightIndex++];

            }
        }

        if(leftIndex > mid) {
            for(j = rightIndex; j <= right; j++)
                sorted[i++] = arr[j];
        } else {
            for(j = leftIndex; j <= mid; j++)
                sorted[i++] = arr[j];
        }

        for(j=left; j<=right; j++) {
            arr[j] = sorted[j];
            count++;
            if(count == num) {
                answer = arr[j];
                check = false;
                break;
            }
        }
    }

    public static void mergeSort(int arr[],int left,int right, int num){
        int mid = (left+right) /2;
        if(left < right && check) {
            mergeSort(arr, left, mid, num);
            mergeSort(arr, mid+1, right, num);
            merge(arr, left, mid, right, num);
        }
    }

    public static void main(String[] args) {
        int N, K = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        list = new int[N];
        sorted = new int[N];

        for(int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        mergeSort(list, 0, list.length-1, K);
        System.out.println(answer);
    }
}
