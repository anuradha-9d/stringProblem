package com.anuradha.stringProblem;



import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class stringRemoveUsingReplaceTest {
   
	@Test(groups = "removeCharacterInStringUsingReplace")
   public void testRemoveMultipleOccurencesFromString() {
      String str = "Anuradha";
      assertEquals("Anurdh", stringRemove.removeCharacterInStringUsingReplace(str, 'a'));
   }
	
	@Test(groups = "removeCharacterInStringUsingReplace")
	   public void testsingleFromString() {
	      String str = "apple";
	      assertEquals("pple", stringRemove.removeCharacterInStringUsingReplace(str, 'a'));
	   }
	
	@Test(groups = "removeCharacterInStringUsingReplace")
	   public void testRemoveWhiteSpace() {
	      String str = "I worked for apple";
	      assertEquals("Iworkedforapple", stringRemove.removeCharacterInStringUsingReplace(str, ' '));
	   }
	
	@Test(groups = "removeCharacterInStringUsingReplace")
	   public void testRemoveMultipleWhiteSpaces() {
	      String str = "I     worked for apple";
	      assertEquals("Iworkedforapple", stringRemove.removeCharacterInStringUsingReplace(str, ' '));
	   }
	
	@Test(groups = "removeCharacterInStringUsingReplace")
	   public void testRemoveNumber() {
	      String str = "I'm gr8 at sql";
	      assertEquals("I'm gr at sql", stringRemove.removeCharacterInStringUsingReplace(str, '8'));
	   }
	
	@Test(groups = "removeCharacterInStringUsingReplace")
	   public void testRemoveSpecialCharacter() {
	      String str = "I'm gr8 at sql";
	      assertEquals("Im gr8 at sql", stringRemove.removeCharacterInStringUsingReplace(str, '\''));
	   }
	
	@Test(groups = "removeCharacterInStringUsingReplace")
	   public void testRemoveNotMatchingCharacter() {
	      String str = "TestNG is great";
	      assertEquals("TestNG is great", stringRemove.removeCharacterInStringUsingReplace(str, 'Z'));
	   }
	
	@Test(groups = "removeCharacterInStringUsingReplace")
	   public void testRemoveCaseSensivity() {
	      String str = "TestNG is great";
	      assertEquals("TestNG is great", stringRemove.removeCharacterInStringUsingReplace(str, 'n'));
	   }
	
}

