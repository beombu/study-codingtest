package site.inflearn.Recursive_Tree_Graph;

public class Tree {
    int count;

    public Tree() {
        count = 0;
    }

    public class Node {
        int val;
        Node lt;
        Node rt;

        public Node(int val) {
            this.val = val;
            lt = null;
            rt = null;
        }

        public void addLeft(Node node) {
            lt = node;
            count++;
        }

        public void addRight(Node node) {
            rt = node;
            count++;
        }

        public void deleteLeft() {
            lt = null;
            count--;
        }

        public void deleteRight() {
            rt = null;
            count--;
        }
    }

    public Node addNode(int val) {
        Node n = new Node(val);
        return n;
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        preOrder(node.lt);
        preOrder(node.rt);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.lt);
        System.out.print(node.val + " ");
        inOrder(node.rt);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.lt);
        postOrder(node.rt);
        System.out.print(node.val + " ");
    }
}
