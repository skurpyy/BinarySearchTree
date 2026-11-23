public class BinarySearchTree{

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
        }
    }




    //Deletion Method
    public void delete(int value){
        root=delete(root, value);
    }

    //deletion helper method
    private Node delete(Node node, int value){
        if(node==null){
            return null;
        }
        if(value < node.value){
            node.left=delete(node.left, value);

        } else if (value>node.value) {
            node.right=delete(node.right, value);

        }else{
            //zero or one child
            if(node.left==null){
                return node.right;
            }

            if(node.right==null){
                return node.left;
            }
            //two children case
            Node successor=node.right;
            while(successor.left !=null){
                successor=successor.left;
            }

            node.value=successor.value;
            node.right=delete(node.right,successor.value);
        }
return node;
    }

//print inorder (prints the BST in the inorder format)

    public void printInOrder(){
        printInOrder(root);
        System.out.println();
    }
    //Print inorder helper methods
    private void printInOrder(Node node){
        if(node != null){
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }



}