package task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringConcatenationTest {

    @ParameterizedTest
    @CsvSource({"Hello, World!, Hello World!",
            "JUnit, 5, JUnit 5",
            "Java, Programming, Java Programming"})
    public void testConcatenation(String str1, String str2, String expectedResult) {
        String result = StringConcatenation.concatenateStrings(str1, str2);
        assertEquals(expectedResult, result, "Некорректная конкатенация строк");
    }
}