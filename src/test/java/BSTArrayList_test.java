public class BSTArrayList_test {
        // somehow my junit aint working. Not wasting time. using objects.

        public static void  main(String atg[]) {
            BSTArrayList_test BSTArrayList_test = new BSTArrayList_test();
            BSTArrayList_test.test_BSTArrayList();
        }

        private void test_BSTArrayList (){
            BSTArrayList bst = new BSTArrayList();

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
            System.out.println("To String : "+ bst);

            System.out.println("Remove last element : " +  bst.remove() );
            System.out.println("To String : "+ bst);

            System.out.println("\n Printing Inorder");
            bst.inOrderView(bst.getBstAL(), 0);
            System.out.println("\n Printing Pre Order");
            bst.preOrderView(bst.getBstAL(), 0);
            System.out.println("\n Printing Post Order");
            bst.postOrderView(bst.getBstAL(), 0);
        }
}
