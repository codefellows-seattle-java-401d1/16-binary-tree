public class BinaryTree {
    public class BinaryTree {
        private TreeNode root;

        public TreeNode getRoot() {
            return root;
        }

        public void add(int value) {
            if (this.root == null) {
                this.root = new TreeNode(value);
                return;
            }
            this.add(value, this.root);
        }

        private void add(int value, TreeNode current){
            if(current == null){
                new TreeNode(value);
            }
            while(current != null){
                if(current.left == null){
                    current.left = new TreeNode(value);
                    return;
                } else if(current.right == null){
                    current.right = new TreeNode(value);
                    return;
                }
                current = current.left;
            }
        }

        private StringBuilder inOrder(StringBuilder builder, TreeNode current){
            if (current == null) {
                return builder;
            }
            inOrder(builder, current.left);
            builder.append(current.data + " ");
            inOrder(builder, current.right);

            return builder;
        }

    }

}

