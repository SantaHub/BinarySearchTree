import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BSTLinkedList {

    LinkedList<Integer> bstLinkedList = new LinkedList<>();

    public void insert(int data){
        bstLinkedList.add(data);
    }

    public int remove() {
        int returnData = bstLinkedList.remove(bstLinkedList.size()-1);
        return returnData;
    }

    public void clear() {
        bstLinkedList = new LinkedList<>();
    }

    public boolean search(int data) {
        boolean found = false;
        for(Integer item : bstLinkedList){
            if(item == data) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void preOrderView(List<Integer> bstLinkedList, int index){
        // Left Right Root
        if(index == bstLinkedList.size()-1) {
            System.out.print(bstLinkedList.get(index));
            return;
        } else if(bstLinkedList.get(index) > bstLinkedList.get(index+1)){ // Left
            System.out.print(bstLinkedList.get(index));
            preOrderView(bstLinkedList, index+1);
        } else if(bstLinkedList.get(index) <= bstLinkedList.get(index+1) ) { // Right
            preOrderView(bstLinkedList, index+1);
            System.out.print(bstLinkedList.get(index));
        }
    }


    public void inOrderView(List<Integer> bstLinkedList, int index){
        // Left Root Right
        if(index == bstLinkedList.size()-1) {
            System.out.print(bstLinkedList.get(index));
            return;
        }
        if (bstLinkedList.get(index) > bstLinkedList.get(index+1)) { // handling left side
            inOrderView(bstLinkedList, index+1);
            System.out.print(bstLinkedList.get(index));

        } else if(bstLinkedList.get(index) <= bstLinkedList.get( index+1)) { // handling right side
            System.out.print(bstLinkedList.get(index));
            inOrderView(bstLinkedList, index+1);
        }
    }

    public void postOrderView(List<Integer> bstLinkedList, int index){
        // Left Right Root
        if(index == bstLinkedList.size()-1) {
            System.out.print(bstLinkedList.get(index));
            return;
        } else if(bstLinkedList.get(index) > bstLinkedList.get(index+1)){ // Left
            postOrderView(bstLinkedList, index+1);
            System.out.print(bstLinkedList.get(index));
        } else if(bstLinkedList.get(index) <= bstLinkedList.get(index+1) ) { // Right
            postOrderView(bstLinkedList, index+1);
            System.out.print(bstLinkedList.get(index));
        }
    }

    public List<Integer> getBstAL(){
        return bstLinkedList;
    }

    public String toString(){
        String stringData = "";
        for(Integer elem : bstLinkedList){
            stringData += elem +" ";
        }
        return stringData;
    }


}
