package store;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddToCart.class, TestCategory.class, TestCheckOut.class, TestLog.class, TestPro.class,
		TestSearch.class })
public class TestSuiteAllTests {

}
