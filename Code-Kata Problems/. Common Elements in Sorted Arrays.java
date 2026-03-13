import java.util.*;

public class CommonElementsInSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (a[i] == b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int x : result) System.out.print(x + " ");
        }
    }
}
