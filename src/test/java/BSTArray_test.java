public class BSTArray_test {
    // somehow my junit aint working. Not wasting time. using objects.

    public static void  main(String atg[]) {
        BSTArray_test bstArray_test = new BSTArray_test();
        bstArray_test.test_BSTArray();
    }

    private void test_BSTArray (){
        BSTArray bst = new BSTArray();

        bst.insert(4);
        bst.insert(2);
        bst.insert(3);
        bst.insert(7);
        bst.insert(8);
//
//        for (int i : (bst.getBstArray())) {
//            System.out.print(i);
//        }

        System.out.println("4 is present in the BST : " +  bst.search(4) );
        System.out.println("1 is present in the BST : " +  bst.search(1) );

        System.out.println("Remove last element : " +  bst.remove() );
        System.out.println("To String : "+ bst.toString());

        System.out.println("\n Printing Inorder");
        bst.inOrderView(bst.getBstArray(), 0);
        System.out.println("\n Printing Pre Order");
        bst.preOrderView(bst.getBstArray(), 0);
        System.out.println("\n Printing Post Order");
        bst.postOrderView(bst.getBstArray(), 0);
    }
}
