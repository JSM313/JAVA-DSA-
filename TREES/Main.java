import java.io.*;
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    static class Bpair {
        boolean isBst;
        int max;
        int min;
        Node root;
        int size;
    }

    public static Bpair isBst(Node node) {
        if (node == null) {
            Bpair bp = new Bpair();
            bp.isBst = true;
            bp.max = Integer.MIN_VALUE;
            bp.min = Integer.MAX_VALUE;
            bp.root = null;
            bp.size = 0;
            return bp;
        }

        Bpair lp = isBst(node.left);
        Bpair rp = isBst(node.right);

        Bpair mp = new Bpair();

        mp.isBst = lp.isBst && rp.isBst && node.data >= lp.max && node.data <= rp.min;
        mp.max = Math.max(node.data, (Math.max(lp.max, rp.max)));
        mp.min = Math.min(node.data, (Math.min(lp.min, rp.min)));

        if (mp.isBst) {
            mp.root = node;
            mp.size = lp.size + rp.size + 1;
        } else if (lp.size > rp.size) {
            mp.root = lp.root;
            mp.size = lp.size;
        } else {
            mp.root = rp.root;
            mp.size = rp.size;
        }

        return mp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        // write your code here
        Bpair bp = isBst(root);
        System.out.println(bp.root.data + "@" + bp.size);
    }

}