
import java.util.Scanner;

class Node {
    public int data;
    public Node left;
    public Node right;
}

class BST {
    public Node root;
    public int cnt;

    public BST() {
        root = null;
        cnt = 0;
    }

    public void insert() {
        Node new_node, temp;
        int flag = 0;
        new_node = new Node();
        new_node.left = null;
        new_node.right = null;
        System.out.print("Enter data : ");
        Scanner scanner = new Scanner(System.in);
        new_node.data = scanner.nextInt();
        if (root == null) {
            root = new_node;
        } else {
            temp = root;
            while (flag == 0) {
                if (new_node.data < temp.data) {
                    if (temp.left == null) {
                        temp.left = new_node;
                        flag = 1;
                    } else {
                        temp = temp.left;
                    }
                } else if (new_node.data > temp.data) {
                    if (temp.right == null) {
                        temp.right = new_node;
                        flag = 1;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    System.out.println("\nData is already exist in the Tree");
                    flag++;
                }
            }
        }
    }

    public void inorder(Node temp) {
        if (temp != null) {
            inorder(temp.left);
            System.out.print(" " + temp.data);
            cnt++;
            inorder(temp.right);
        }
    }

    public void smallest() {
        Node temp;
        temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        System.out.println("\nSmallest node in the tree is : " + temp.data);
    }

    public void largest() {
        Node temp;
        temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        System.out.println("\nLargest node in the tree is : " + temp.data);
    }

    public int search(int key) {
        Node temp;
        temp = root;
        while (true) {
            if (key < temp.data) {
                if (temp.left != null) {
                    temp = temp.left;
                } else {
                    return 0;
                }
            } else if (key > temp.data) {
                if (temp.right != null) {
                    temp = temp.right;
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        }
    }

    public void mirror(Node r) {
        Node temp;
        if (r != null) {
            temp = r.left;
            r.left = r.right;
            r.right = temp;
            mirror(r.left);
            mirror(r.right);
        }
    }

    public int height(Node r) {
        int leftHeight, rightHeight;
        if (r == null) {
            return 0;
        }
        if (r.left == null && r.right == null) {
            return 0;
        }
        leftHeight = height(r.left);
        rightHeight = height(r.right);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }
}

public class BSTcode {
    public static void main(String[] args) {
        int ch;
        BST B = new BST();
        do {
            System.out.println("\n Menu");
            System.out.println("1. Insert");
            System.out.println("2. Inorder");
            System.out.println("3. Smallest number");
            System.out.println("4. Largest number");
            System.out.println("5. Search");
            System.out.println("6. Mirror");
            System.out.println("7. Height of the tree");
            System.out.println("8. Exit");
            System.out.print("Enter your choice : ");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    B.insert();
                    break;
                case 2:
                    B.inorder(B.root);
                    System.out.println("\nCnt = " + B.cnt);
                    break;
                case 3:
                    B.smallest();
                    break;
                case 4:
                    B.largest();
                    break;
                case 5:
                    System.out.print("Enter number to Search : ");
                    int key = scanner.nextInt();
                    if (B.search(key) == 1) {
                        System.out.println("Number is found");
                    } else {
                        System.out.println("Number is not found");
                    }
                    break;
                case 6:
                    B.mirror(B.root);
                    break;
                case 7:
                    System.out.println("Height of the BST is " + B.height(B.root));
                    break;
                default:
                    System.out.println("\nEnter correct choice ");
                    break;
            }
        } while (ch != 8);
    }
}


