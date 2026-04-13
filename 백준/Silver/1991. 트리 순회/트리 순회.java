import java.util.*;
import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Tree tree = new Tree();

		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String root = st.nextToken();
			String left = st.nextToken();
			String right = st.nextToken();

			tree.insert(root, left, right);
		}

		tree.preOrder(tree.root);
		sb.append("\n");
		tree.inOrder(tree.root);
		sb.append("\n");
		tree.postOrder(tree.root);
		System.out.println(sb);
	}

	static class TreeNode {
		String val;
		TreeNode left;
		TreeNode right;

		public TreeNode(String val){
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	static class Tree {
		TreeNode root;

		void insert(String thisNode, String left, String right){
			if(root == null){
				root = new TreeNode(thisNode);
				if(!left.equals(".")){
					root.left = new TreeNode(left);
				}
				if(!right.equals(".")){
					root.right = new TreeNode(right);
				}
			} else {
				search(root, thisNode, left, right);
			}
		}

		void search(TreeNode root, String parent, String left, String right){
			if(root == null){
				return;
			}

			if(root.val.equals(parent)){
				if(!left.equals(".")){
					root.left = new TreeNode(left);
				}
				if(!right.equals(".")){
					root.right = new TreeNode(right);
				}
			} else {
				search(root.left, parent, left, right);
				search(root.right, parent, left, right);
			}
		}

		public void preOrder(TreeNode root){
			sb.append(root.val);
			if(root.left != null){
				preOrder(root.left);
			}
			if(root.right != null){
				preOrder(root.right);
			}
		}

		public void inOrder(TreeNode root){
			if(root.left != null){
				inOrder(root.left);
			}
			sb.append(root.val);
			if(root.right != null){
				inOrder(root.right);
			}
		}

		public void postOrder(TreeNode root){
			if(root.left != null){
				postOrder(root.left);
			}
			if(root.right != null){
				postOrder(root.right);
			}
			sb.append(root.val);
		}
	}
}
