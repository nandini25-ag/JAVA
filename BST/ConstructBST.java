package BST;

public class ConstructBST {

	private class Node{
		int data;
		Node left;
		Node right;
		
	}
	private Node root;
		public ConstructBST(int[] arr) {

			this.root = construct(arr, 0, arr.length - 1);
		}

		private Node construct(int[] arr, int lo, int hi) {

			if (lo > hi) {
				return null;
			}

			// mid
			int mid = (lo + hi) / 2;

			// create a new node
			Node nn = new Node();
			nn.data = arr[mid];

			nn.left = construct(arr, lo, mid - 1);
			nn.right = construct(arr, mid + 1, hi);

			return nn;
		}
	}
	

