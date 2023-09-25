package medium;

import dsa.tree.BinaryNode;
import dsa.tree.BinaryTree;

/**
 * @Question : 98
 */
public class ValidBST {

    public static boolean isValid(BinaryNode root, long min, long max) {

        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        boolean left = isValid(root.left, min, root.val);
        boolean right = isValid(root.right, root.val, max);
        return left && right;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Integer[] testcase1 = {5, 4, 6, null, null, 3, 7};
        BinaryNode root = tree.createTreeFromArray(testcase1);

        System.out.println(isValid(root, Long.MIN_VALUE, Long.MAX_VALUE));
        BinaryTree.printTree(root);
    }
}
