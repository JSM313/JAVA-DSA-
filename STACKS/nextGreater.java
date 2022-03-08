import java.io.*;
import java.util.*;

public class nextGreater {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }
    /*
     * public static int[] solve(int[] a) {
     * The main concept behind it is pop/ans/push
     * int[] nge = new int[a.length];
     * Stack<Integer> st = new Stack<>();
     * st.push(a[a.length] - 1);
     * nge[a.length - 1] = -1;
     * 
     * for (int i = a.length - 2; i >= 0; i--) {
     * while (st.size() > 0 && a[i] > st.peek()) {
     * st.pop();
     * }
     * if (st.size() == 0) {
     * nge[i] = -1;
     * } else {
     * nge[i] = st.peek();
     * }
     * st.push(a[i]);
     * }
     * return nge;
     * }
     */

    // ! ALTERNATIVE APPROACH

    public static int[] solve(int[] a) {
        int[] nge = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < a.length; i++) {
            while (st.size() > 0 && a[i] > st.peek()) {
                int pos = st.peek();
                nge[pos] = a[i];
                st.pop();
            }
            st.push(i);

        }

        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }

}