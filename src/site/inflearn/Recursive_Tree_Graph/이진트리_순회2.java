package site.inflearn.Recursive_Tree_Graph;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}

public class 이진트리_순회2 {
    Node root;
    public void DFS(Node root){
        if(root==null)
            return;
        else{
            //순서를 바꿔서 전위, 중위, 후위 순회 실행
			DFS(root.lt);
			System.out.print(root.data+" ");
			DFS(root.rt);
		}
    }

    public static void main(String[] args) {
        이진트리_순회2 tree = new 이진트리_순회2();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
		tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}
