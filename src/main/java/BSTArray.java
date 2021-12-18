public class BSTArray {
    int MAX_SIZE = 100;
    int[] bstArray = new int[MAX_SIZE];
    int size = 0;


    public void insert(int data){
        if (size == MAX_SIZE) {
            System.out.println("Reached insertion limit. Call Austin.");
        } else {
            bstArray[size] = data;
            size++;
        }
    }

    public int remove() {
        int returnData = bstArray[size-1];
        size--;
        return returnData;
    }

    public void clear() {
        size = 0;
    }

    public boolean search(int data) {
        boolean found = false;
        for(int i = 0 ; i< size; i++ ){
            if(bstArray[i] == data){
                found = true;
                break;
            }
        }
        return found;
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

    public String toString(){
        String stringData = "";
        for(int i = 0 ; i< size; i++ ){
            stringData += bstArray[i] + ", ";
        }
        return stringData;
    }


}

