import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int n  = myInput.nextInt();
		ArrayList<Queue> listQueue = new ArrayList<Queue>();
		ArrayList<Integer> patience = new ArrayList<Integer>();
		for(int i=0; i <=n;i++) {
			String path = myInput.nextLine();

			if(i!=0) {
				Queue<Integer> q = new LinkedList<>(); 
				String[] a = path.split(" ");
				for(int j = 1; j<=Integer.parseInt(a[0]);j++) {
					q.add(Integer.parseInt(a[j]));
					patience.add(Integer.parseInt(a[j]));
				}
				listQueue.add(q);
			}
		}
		int time = 0;
		Collections.sort(patience);
		Iterator<Integer> it = patience.iterator();
		while(it.hasNext()) {
			int serve = it.next();
			for(int i=0;i<listQueue.size();i++) {
				boolean hasBreak = false;
				if(listQueue.get(i).contains(serve)) {
					int size = listQueue.get(i).size();
					for(int j=0;j<size;j++) {
						if(!listQueue.get(i).isEmpty()) {
							int head = (int) listQueue.get(i).peek();
							if(head==serve && head>time) {
								listQueue.get(i).remove();
								time++;
								hasBreak = true;
								break;
							}else if(head>time) {
								listQueue.get(i).remove();
								time++;
							}else {
								hasBreak = true;
								break;
							}
						}else {break;}
					}

					//listQueue.get(i).remove();
					//time++;
					if(hasBreak) {
						break;
					}
				}
			}
		}
		System.out.println(time);
	}

}
