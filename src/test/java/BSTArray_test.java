public class BSTArray_test {
    // somehow my junit aint working. Not wasting time. using objects.

    public static void  main(String atg[]) {
        BSTArray_test bstArray_test = new BSTArray_test();
        bstArray_test.test_BSTArray();
    }

    private void test_BSTArray (){
        BSTArray bstArray = new BSTArray();

        bstArray.insert(4);
        bstArray.insert(2);
        bstArray.insert(3);
        bstArray.insert(7);
        bstArray.insert(8);
//
//        for (int i : (bstArray.getBstArray())) {
//            System.out.print(i);
//        }

        System.out.println("4 is present in the BST : " +  bstArray.search(4) );
        System.out.println("1 is present in the BST : " +  bstArray.search(1) );

        System.out.println("Remove last element : " +  bstArray.remove() );
        System.out.println("To String : "+ bstArray.toString());

        System.out.println("\n Printing Inorder");
        bstArray.inOrderView(bstArray.getBstArray(), 0);
        System.out.println("\n Printing Pre Order");
        bstArray.preOrderView(bstArray.getBstArray(), 0);
        System.out.println("\n Printing Post Order");
        bstArray.postOrderView(bstArray.getBstArray(), 0);
    }
}
