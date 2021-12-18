public class BSTArray {
    int MAX_SIZE = 100;
    int[] bstArray = new int[MAX_SIZE];
    int size = 0;

    public static void main(String args[]){
        BSTArray bstArray = new BSTArray();
        bstArray.insert(4);
        bstArray.insert(2);
        bstArray.insert(3);
        bstArray.insert(7);
        for (int i : (bstArray.getBstArray())) {
            System.out.print(i);
        }

        System.out.println("\n Printing Inorder");
        bstArray.inOrderView(bstArray.getBstArray(), 0);
        System.out.println("\n Printing Pre Order");
        bstArray.preOrderView(bstArray.getBstArray(), 0);
        System.out.println("\n Printing Post Order");
        bstArray.postOrderView(bstArray.getBstArray(), 0);

    }

    public void insert(int data){
        if (size == MAX_SIZE) {
            System.out.println("Reached insertion limit. Call Austin.");
        } else {
            bstArray[size] = data;
            size++;
        }
    }

    public int remove() {
        int returnData = bstArray[size];
        size--;
        return returnData;
    }

    public void clear() {
        size = 0;
    }

    public void preOrderView(int[] bstArraySegment, int rootIndex){
        // Left Right Root
        if(rootIndex == size) {
            return;
        } else if(bstArraySegment[rootIndex] > bstArraySegment[rootIndex+1]){ // Left
            System.out.print(bstArraySegment[rootIndex]);
            preOrderView(bstArraySegment, rootIndex+1);
        } else if(bstArraySegment[rootIndex] <= bstArraySegment[rootIndex+1] ) { // Right
            preOrderView(bstArraySegment, rootIndex+1);
            System.out.print(bstArraySegment[rootIndex]);
        }
    }


    public void inOrderView(int[] bstArraySegment, int rootIndex){
        // Left Root Right
        if(rootIndex == size) {
            return;
        }
        if (bstArraySegment[rootIndex] > bstArraySegment[rootIndex +1 ]) { // handling left side
            inOrderView(bstArraySegment, rootIndex+1);
            System.out.print(bstArraySegment[rootIndex]);

        } else if(bstArraySegment[rootIndex] <= bstArraySegment[rootIndex + 1]) { // handling right side
            System.out.print(bstArraySegment[rootIndex]);
            inOrderView(bstArraySegment, rootIndex+1);
        }
    }

    public void postOrderView(int[] bstArraySegment, int rootIndex){
        // Left Right Root
        if(rootIndex == size) {
            return;
        } else if(bstArraySegment[rootIndex] > bstArraySegment[rootIndex+1]){ // Left
            postOrderView(bstArraySegment, rootIndex+1);
            System.out.print(bstArraySegment[rootIndex]);
        } else if(bstArraySegment[rootIndex] <= bstArraySegment[rootIndex+1] ) { // Right
            postOrderView(bstArraySegment, rootIndex+1);
            System.out.print(bstArraySegment[rootIndex]);
        }
    }

    public int[] getBstArray(){
        return bstArray;
    }

}

