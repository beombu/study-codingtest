package site.inflearn.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node4{
    int val;
    Node4 lt;
    Node4 rt;

    public Node4(int val) {
        this.val = val;
        this.lt = null;
        this.rt = null;
    }
}

public class Tree_말단_노드까지의_가장_짧은_경로2 {
    Node4 root;

    public int BFS(Node4 root){
        Queue<Node4> queue = new LinkedList<>();
        queue.add(root);
        int L = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();

            for(int i = 0; i < len; i++){
                Node4 nowNode = queue.poll();

                if(nowNode.lt == null && nowNode.rt == null){
                    return L;
                }
                if(nowNode.lt != null){
                    queue.add(nowNode.lt);
                }
                if(nowNode.rt != null){
                    queue.add(nowNode.rt);
                }

            }
            L++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Tree_말단_노드까지의_가장_짧은_경로2 tree = new Tree_말단_노드까지의_가장_짧은_경로2();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);

        System.out.println(tree.BFS(tree.root));
    }
}
