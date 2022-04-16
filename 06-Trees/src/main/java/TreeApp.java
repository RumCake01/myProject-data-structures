import jdk.swing.interop.SwingInterOpUtils;

public class TreeApp {
    public static void main(String[] args) {

        MyTree mytree=new MyTree();
        int[] numbers=new int[] {10, 5, 12, 3, 6, 11, 13, 2};
        for (int i = 0; i <8; i++) {
            mytree.insert(numbers[i]);
        }
        VisualizeTree.printTree(mytree.root, null,false);

        System.out.println("Pre-Order Traversal");
        mytree.preOrderTraverse(mytree.root);
        System.out.println();
        System.out.println("In-Order Traversal");
        mytree.inOrderTraverse(mytree.root);
        System.out.println();
        System.out.println("Post-Order Traversal");
        mytree.postOrderTraverse(mytree.root);
        System.out.println();
        System.out.println("Bread-first Traversal");
        mytree.breadthFirstTraversalOrder(mytree.root);
        System.out.println();
        System.out.println("Contains method in BST");
        System.out.println(mytree.contains(100));

        System.out.println();
        System.out.println("Print Leaves of The Tree");
        mytree.printLeaves(mytree.root);

        System.out.println();
        System.out.println("Print number of Leaves of The Tree is " + mytree.countOfLeaves(mytree.root));

        System.out.println();
        System.out.println("Print the sum of Leaf values of The Tree is " + mytree.findSumOfLeafValues(mytree.root));


    }
}
