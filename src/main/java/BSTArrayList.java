import java.util.ArrayList;
import java.util.List;

public class BSTArrayList {

    List<Integer> bstAL = new ArrayList<>();

    public void insert(int data){
        bstAL.add(data);
    }

    public int remove() {
        int returnData = bstAL.remove(bstAL.size()-1);
        return returnData;
    }

    public void clear() {
        bstAL = new ArrayList<>();
    }

    public boolean search(int data) {
        boolean found = false;
        for(Integer item : bstAL){
            if(item == data) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void preOrderView(List<Integer> bstArrayList, int index){
        // Left Right Root
        if(index == bstArrayList.size()-1) {
            System.out.print(bstArrayList.get(index));
            return;
        } else if(bstArrayList.get(index) > bstArrayList.get(index+1)){ // Left
            System.out.print(bstArrayList.get(index));
            preOrderView(bstArrayList, index+1);
        } else if(bstArrayList.get(index) <= bstArrayList.get(index+1) ) { // Right
            preOrderView(bstArrayList, index+1);
            System.out.print(bstArrayList.get(index));
        }
    }


    public void inOrderView(List<Integer> bstArrayList, int index){
        // Left Root Right
        if(index == bstArrayList.size()-1) {
            System.out.print(bstArrayList.get(index));
            return;
        }
        if (bstArrayList.get(index) > bstArrayList.get(index+1)) { // handling left side
            inOrderView(bstArrayList, index+1);
            System.out.print(bstArrayList.get(index));

        } else if(bstArrayList.get(index) <= bstArrayList.get( index+1)) { // handling right side
            System.out.print(bstArrayList.get(index));
            inOrderView(bstArrayList, index+1);
        }
    }

    public void postOrderView(List<Integer> bstArrayList, int index){
        // Left Right Root
        if(index == bstArrayList.size()-1) {
            System.out.print(bstArrayList.get(index));
            return;
        } else if(bstArrayList.get(index) > bstArrayList.get(index+1)){ // Left
            postOrderView(bstArrayList, index+1);
            System.out.print(bstArrayList.get(index));
        } else if(bstArrayList.get(index) <= bstArrayList.get(index+1) ) { // Right
            postOrderView(bstArrayList, index+1);
            System.out.print(bstArrayList.get(index));
        }
    }

    public List<Integer> getBstAL(){
        return bstAL;
    }

    public String toString(){
        String stringData = "";
        for(Integer elem : bstAL){
            stringData += elem +" ";
        }
        return stringData;
    }


}
