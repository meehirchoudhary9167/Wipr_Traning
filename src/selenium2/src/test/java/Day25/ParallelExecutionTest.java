package Day25;

import org.testng.annotations.Test;

public class ParallelExecutionTest {
	@Test(invocationCount=5, threadPoolSize=3)
	public void executeTest() throws InterruptedException {
		System.out.println("Start of thread:"+ Thread.currentThread().getId());
		Thread.sleep(2000);
		System.out.println("End of thread:"+Thread.currentThread().getId());
		}

}
