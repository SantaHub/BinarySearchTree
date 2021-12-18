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
        int returnData = bstArray[size];
        size--;
        return returnData;
    }

    public void clear() {
        size = 0;
    }

    public void inOrderView(){
        // Left Root Right
    }

    private int getInsertIndex(int data){
        int index = 0;
        for(int elem : bstArray) {
            if(elem)
        }
        return index;
    }
}

