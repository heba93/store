package store;

import org.junit.*;

public class TestSearch {
	serche start = new serche();

	@Before
	public void goToPage(){
		start.GoToPage();
	}


	@After
	public void closeDriver(){
		start.closeDriver();
	}

	@Test
	public void Search1()throws InterruptedException{
		start.Search1();

	}

}
