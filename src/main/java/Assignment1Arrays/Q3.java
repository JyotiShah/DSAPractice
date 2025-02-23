package Assignment1Arrays;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Q3 {
    /*
    1.Find Duplicate Words in a String
 - Example: Input: `"Bread butter and bread"`, Output: `bread: 2`

2.Count Number of Words in a String

3.Count Occurrences of a Character Without Loops
 - Example: Input: `"Java is java again"`, character `'a'`, Output: `Number of occurrences of 'a': 5`

4.Reverse a String

5.Count Occurrences of Each Character in a String
 - Example: Input: `"Java J2EE Java JSP J2EE"`, Output: `J: 5, a: 4, 2: 2, E: 4`

6.Remove All Whitespaces from a String

7.Find Duplicate Characters in a String
 - Example: Input: `"Better Butter"`, Output: `t: 4, e: 3, r: 2, B: 2`

8.Check String Rotation

9.Check Anagram Strings

10.Reverse a String Preserving Space Positions
 - Example: Input: `"I Am Not String"`, Output: `"gni rtS toNmAI"`

11.Reverse Each Word in a String
 - Example: Input: `"Java Concept Of The Day"`, Output: `"avaJ tpecnoC fO ehT yaD"`

12.Convert String to Integer and Vice Versa

14.Prove Strings Are Immutable in Java

15.Longest Substring Without Repeating Characters
 - Example: Input: `"javaconceptoftheday"`, Output: `"oftheday"`, Length: `8`

16.Swap Two Strings Without a Temp Variable

17.Find All Permutations of a String

18.Find the First Repeated and Non-Repeated Character
 - Example: Input: `"JavaConceptOfTheDay"`, Output: `First repeated: 'a', First non-repeated: 'J'`

19.Append a String to a Text File

20.Count Characters, Words, and Lines in a File

21.Find the Most Repeated Word in a Text File

22.Sort a Text File

23.Palindrome String Programs in Java

24.Reverse a Sentence Word by Word
 - Example: Input: `"Java Concept Of The Day"`, Output: `"Day The Of Concept Java"`

25.Remove All Vowels from a String
 - Example: Input: `"Remove all vowels"`, Output: `"Rmv ll vwls"`

26.Replace a Specific String in a Text File

27.Print All Substrings of a String

28.Print Common Characters Between Two Strings in Alphabetical Order

29.Find the Most Repetitive Character in a String
 - Example: Input: `"Java Concept Of The Day"`, Output: `'a' occurs 3 times`
     */
    public static void main(String[] args) {
        countDuplicateWordInString("Big black bug bit a big black dog on his big black nose jyoti Jyoti");
    }
    public static void countDuplicateWordInString(String str){

        String[] words = str.toLowerCase().split(" ");

        for (int i = 0; i< words.length; i++) {
            int count =1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i] +" -count is - " +count);
            }
        }

    }
}
