public class BSTDoublyLinkedList {

    DLLNode bst_root = null;

    //search
    public boolean search(int data ){
        DLLNode node = bst_root;
        boolean found = false;
        while(node !=null){
            if(node.data == data){
                found = true;
                break;
            } else if (data >= node.data ){
                node  = node.right;
            } else if (data < node.data) {
                node = node.left;
            }
        }
        return found;
    }

    //insert
    public void insert(int data){
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
        if(bst_root == null) {
            bst_root = newNode;
        }
        else if(data >= insertNode.data){
            insertNode.right = newNode;
        } else {
            insertNode.left = newNode;
        }
    }


    //remove

    public int remove(int data){
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
        return data;
    }
    //clear
    public void clear(){
        bst_root = null;
    }

    //inOrder
    // LeRoRi
    public void inOrder(DLLNode rootNode){
        if(rootNode == null) {return;}
        inOrder(rootNode.left);
        System.out.print(rootNode.data);
        inOrder(rootNode.right);
    }


    //PreOrder
    //RoLeRi
    public void preOrder(DLLNode rootNode){
        if(rootNode == null) {return;}
        System.out.print(rootNode.data);
        inOrder(rootNode.left);
        inOrder(rootNode.right);
    }

    //postOrder
    //LeRiRo
    public void postOrder(DLLNode rootNode){
        if(rootNode == null) {return;}
        inOrder(rootNode.left);
        inOrder(rootNode.right);
        System.out.print(rootNode.data);
    }

    //toString
    public String toString(){
        return getChildData(bst_root);
    }

    private String getChildData(DLLNode node){
        String data = "";
        if(node != null ) {
            data += getChildData(node.left) + " " + node.data + " " + getChildData(node.right);
        }
        return data;
    }

    public DLLNode getBst_root(){
        return bst_root;
    }
}
