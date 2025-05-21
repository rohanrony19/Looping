package Arrays;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        boolean[] visited = new boolean[arr.length];

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
