public class BSTDoublyLinkedList {

    DLLNode bst_root = null;

    //search
    private boolean search(int data ){
        DLLNode node = bst_root;
        boolean found = false;
        while(node !=null){
            if(node.data == data){
                found = true;
                break;
            }
        }
        return found;
    }

    //insert
    private void insert(int data){
        DLLNode newNode = new DLLNode(data);
        DLLNode node = bst_root;
        DLLNode insertNode = bst_root;
        while (node  != null) {
            if(node.data <= data){
                insertNode = node;
                node = node.right;
            } else{
                insertNode = node;
                node = node.left;
            }
        }
        if(data >= insertNode.data){
            insertNode.right = newNode;
        } else {
            insertNode.left = newNode;
        }
    }


    //remove

    private void remove(int data){
        DLLNode node = bst_root;
        DLLNode prevNode = null;
        while(node != null) {
            if(data == node.data) {
                break;
            } else if(data > node.data){
                prevNode = node;
                node = node.right;
            }  else if(data < node.data) {
                prevNode = node;
                node = node.left;
            }
        }
        if(prevNode != null) {
            if(prevNode.left == node){
                prevNode.left = node.right;
            } else {
                prevNode.right = node.left;
            }
        }
    }
    //clear
    private void clear(){
        bst_root = null;
    }

    //inOrder
    // LeRoRi



    //PreOrder
    //postOrder
    //toString

}
