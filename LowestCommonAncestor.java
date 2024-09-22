class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinaryTreeLCA {

    // Method to find the LCA of two nodes in a binary tree
    public static TreeNode findLCA(TreeNode root, TreeNode n1, TreeNode n2) {
        // Base case: if the root is null or either n1 or n2, return root
        if (root == null || root == n1 || root == n2) {
            return root;
        }

        // Recurse on left and right subtrees
        TreeNode leftLCA = findLCA(root.left, n1, n2);
        TreeNode rightLCA = findLCA(root.right, n1, n2);

        // If n1 and n2 are found in left and right subtrees, root is the LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // If both are on the left, return leftLCA. If both are on the right, return rightLCA
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static void main(String[] args) {
        // Creating the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeNode n1 = root.left.left;  // Node 4
        TreeNode n2 = root.left.right; // Node 5

        // Find LCA of nodes 4 and 5
        TreeNode lca = findLCA(root, n1, n2);

        if (lca != null) {
            System.out.println("LCA of " + n1.value + " and " + n2.value + " is: " + lca.value);
        } else {
            System.out.println("LCA does not exist.");
        }
    }
}
