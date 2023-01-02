int h=treeHeight(node);

        int arr[]=new int[h];

        checkMax(arr, node, 0);

        ArrayList<Integer> list=new ArrayList<>();

        for(int a:arr) {

            list.add(a);

        }

        return list;

    }

    int treeHeight(Node root) {

        if(root==null) {

            return 0;

        }

        int leftHeight=treeHeight(root.left);

        int rightHeight=treeHeight(root.right);

        int maxHeight=Math.max(leftHeight, rightHeight)+1;

        return maxHeight;

    }

    void checkMax(int arr[], Node root, int level) {

        if(root==null) {

            return;

        }

        if(arr[level]<root.data) {

            arr[level]=root.data;

        }

        checkMax(arr, root.left, level+1);

        checkMax(arr, root.right, level+1);
