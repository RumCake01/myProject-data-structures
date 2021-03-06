import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree() {
    }
    public MyTree(Node root) {
        this.root = root;
    }
    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {// if we find a place to add a new node, then we will break the loop
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            }
            // else if means my current value greater
            else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    // end insert

// PreOrder Traversal of Tree root-left-right
    public void preOrderTraverse(Node root) {
        if (root == null) return;
        System.out.print(root.value+ ", ");
        preOrderTraverse(root.leftChild);
        preOrderTraverse(root.rightChild);
    }


    // In-Order Traversal of Tree root-left-right
    public void inOrderTraverse(Node root) {
        if (root == null) return;
        inOrderTraverse(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraverse(root.rightChild);
    }

    // Post-Order Traversal of Tree root-left-right
        public void postOrderTraverse(Node root) {
            if (root == null) return;
            postOrderTraverse(root.leftChild);
            postOrderTraverse(root.rightChild);
            System.out.print(root.value + ", ");

        }

        // Breadth First logic level order using Queue data structures.

    public void breadthFirstTraversalOrder(Node root){

        if(root==null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node toVisit= queue.poll();
            System.out.print(toVisit.value+ ", ");

            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }



    } // end levelOrder

}


