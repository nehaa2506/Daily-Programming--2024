import java.util.Scanner;

public class Sort0s1s2s {
    int[] ans;

    public Sort0s1s2s(int[] ans){
        this.ans = ans;
    }

    public void sort0s1s2s() {
        int low = 0;
        int mid = 0;
        int high = ans.length - 1;

        while(mid <= high){
            switch(ans[mid]){
                case 0:
                    swap(low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid, high--);
                    break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = ans[i];
        ans[i] = ans[j];
        ans[j] = temp;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] ans = new int[n];
        System.out.println("Enter array of 0's, 1's, and 2's only: ");
        for(int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
        }
        Sort0s1s2s obj = new Sort0s1s2s(ans);
        obj.sort0s1s2s();
        for(int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
