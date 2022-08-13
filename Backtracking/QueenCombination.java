package Backtracking;

public class QueenCombination {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenCombination(new boolean[5],0,2," ",-1);
	}
	public static void QueenCombination(boolean[] boxes,int qpsf,int tq,String ans,int lastBoxUSed) {
		if(qpsf==tq) {
			count++;
			System.out.println(count+"."+ans);
			return;
		}
		for(int i=lastBoxUSed+1;i<boxes.length;i++) {
			if(boxes[i]==false) {
				boxes[i]=true;
				QueenCombination(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+ i+" ", i);
				boxes[i]=false;//undo step(used for backtracking)
			}

}}}