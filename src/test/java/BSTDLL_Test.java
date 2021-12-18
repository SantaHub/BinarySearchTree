public class BSTDLL_Test {

    public static void main(String[] args) {
        BSTDoublyLinkedList bst = new BSTDoublyLinkedList();

        bst.insert(4);
        bst.insert(2);
        bst.insert(3);
        bst.insert(7);
        bst.insert(8);

        System.out.println("4 is present in the BST : " +  bst.search(4) );
        System.out.println("1 is present in the BST : " +  bst.search(1) );

//        System.out.println("Remove last element : " +  bst.remove(8) );
        System.out.println("To String : "+ bst.toString());

        System.out.println("\n Printing Inorder");
        bst.inOrder(bst.getBst_root());
        System.out.println("\n Printing Pre Order");
        bst.preOrder(bst.getBst_root());
        System.out.println("\n Printing Post Order");
        bst.postOrder(bst.getBst_root());


    }


}
