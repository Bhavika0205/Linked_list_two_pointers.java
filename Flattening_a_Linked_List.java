Node merge(Node a, Node b)
    {
        Node temp = new Node(0);
        Node res = temp;
        while(a!=null && b!=null)
        {
            if(a.data<b.data)
            {
                temp.bottom = a;
                temp = a;
                a = a.bottom;
            }
            else{
                temp.bottom = b;
                temp = b;
                b = b.bottom;
            }
        }
        if(a==null) temp.bottom = b;
        else temp.bottom = a;
        return res.bottom;
    }
    Node flatten(Node root)
    {
	       if(root == null || root.next == null)
	       {
	           return root;
	       }
	       //recurion for linked lid=st on right
	       root.next = flatten(root.next);
	       //now merging two linked list
	       root = merge(root, root.next);
	       return root;
    }
