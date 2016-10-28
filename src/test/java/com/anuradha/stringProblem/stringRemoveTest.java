package com.anuradha.stringProblem;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class stringRemoveTest {
   
	@Test(groups = "removeCharacterInString")
   public void testRemoveMultipleOccurencesFromString() {
      String str = "Anuradha";
      assertEquals("Anurdh", stringRemove.removeCharacterInString(str, 'a'));
   }
	
	@Test(groups = "removeCharacterInString")
	   public void testsingleFromString() {
	      String str = "apple";
	      assertEquals("pple", stringRemove.removeCharacterInString(str, 'a'));
	   }
	
	@Test(groups = "removeCharacterInString")
	   public void testRemoveWhiteSpace() {
	      String str = "I worked for apple";
	      assertEquals("Iworkedforapple", stringRemove.removeCharacterInString(str, ' '));
	   }
	
	@Test(groups = "removeCharacterInString")
	   public void testRemoveMultipleWhiteSpaces() {
	      String str = "I     worked for apple";
	      assertEquals("Iworkedforapple", stringRemove.removeCharacterInString(str, ' '));
	   }
	
	@Test(groups = "removeCharacterInString")
	   public void testRemoveNumber() {
	      String str = "I'm gr8 at sql";
	      assertEquals("I'm gr at sql", stringRemove.removeCharacterInString(str, '8'));
	   }
	
	@Test(groups = "removeCharacterInString")
	   public void testRemoveSpecialCharacter() {
	      String str = "I'm gr8 at sql";
	      assertEquals("Im gr8 at sql", stringRemove.removeCharacterInString(str, '\''));
	   }
	
	@Test(groups = "removeCharacterInString")
	   public void testRemoveNotMatchingCharacter() {
	      String str = "TestNG is great";
	      assertEquals("TestNG is great", stringRemove.removeCharacterInString(str, 'Z'));
	   }
	
	@Test(groups = "removeCharacterInString")
	   public void testRemoveCaseSensivity() {
	      String str = "TestNG is great";
	      assertEquals("TestNG is great", stringRemove.removeCharacterInString(str, 'n'));
	   }
	
}
