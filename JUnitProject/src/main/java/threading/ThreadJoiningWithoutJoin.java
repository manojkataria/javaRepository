package main.java.threading;
public class ThreadJoiningWithoutJoin {

	public static void main(String[] args) {
		final JoinTask task = new JoinTask();

		Thread A = new Thread(){
			public void run(){
				task.doJob(1, "JOB A DONE...");
			}
		};

		Thread B = new Thread(){
			public void run(){
				task.doJob(2, "JOB B DONE...");
			}
		};

		Thread C = new Thread(){
			public void run(){
				task.doJob(3, "JOB C DONE...");
			}
		};

		C.start();
		B.start();
		A.start();

	}

}

// Shared Class or Object 
class JoinTask {

	private int currentRank = 1;

	public void doJob(int rank, String msg) {
		synchronized(this) {
			while (rank != currentRank) {
				try {
					wait();
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			System.out.println("Job:" + currentRank + " : " + msg );
			currentRank++;
			notifyAll();
		}
	}
}