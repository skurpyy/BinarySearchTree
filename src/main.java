public class main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70); //these are not working because insert method hasn't been initialzed yet.

        System.out.println("Tree in ordered order is ");
        tree.printInOrder();
    }
}
