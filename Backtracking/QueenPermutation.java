package Backtracking;

public class QueenPermutation {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
QueenPermutations(new boolean[4],0,2," ");
	}
public static void QueenPermutations(boolean[] boxes,int qpsf,int tq,String ans) {
	if(qpsf==tq) {
		count++;
		System.out.println(count+"."+ans);
		return;
	}
	for(int i=0;i<boxes.length;i++) {
		if(boxes[i]==false) {
			boxes[i]=true;
			QueenPermutations(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i+"");
			boxes[i]=false;//undo step(used for backtracking)
		}
	}
}
}
