package verf;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

import simple.HelloWorldCommand;
import simple.HelloWorldTest;

public class HelloTest {
	@Test
	public void test() throws Exception {
		HelloWorldCommand helloWorldCommand = new HelloWorldCommand(" World");
		assertEquals("Hello World", helloWorldCommand.execute());
		
		HelloWorldTest ts= new HelloWorldTest();
		ts.testASync();
		ts.testObservable();
		
	}
}
