package org.selenium.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FindElementByClass.class, FindElementByCSS.class,
		FindElementByID.class, FindElementByName.class,
		FindElementByXpath.class })
public class AllTests {

}
