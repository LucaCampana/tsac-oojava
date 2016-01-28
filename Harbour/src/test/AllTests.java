package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import campana.luca.harbour.Sottomarino;

@RunWith(Suite.class)
@SuiteClasses({AereoTest.class, SottomarinoTest.class, GiocoTest.class})
public class AllTests {

}
