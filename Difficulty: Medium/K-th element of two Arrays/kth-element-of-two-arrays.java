class Solution {
    public int kthElement(int a[], int b[], int k) {

        int arr[] = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++)
            arr[index++] = a[i];

        for (int i = 0; i < b.length; i++)
            arr[index++] = b[i];

        Arrays.sort(arr);

        return arr[k - 1];
    }
}
    