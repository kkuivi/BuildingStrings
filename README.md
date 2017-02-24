# BuildingStrings

Problem Statement
The score of a string is its length multiplied by the number of different characters in the string. For example, the score of "abbcdxc" is 7 * 5 = 35. This is because the length of this string is 7 and there are five different characters: a, b, c, d, x.


Bear Limak wants to find a sequence of strings satisfying the following conditions:

There number of strings is between 1 and 50, inclusive.
The length of each string is between 1 and 50, inclusive.
The sum of scores of the strings is exactly K.
Each character in each string is a lowercase English letter ('a' - 'z').
You are given the K. Compute and return any sequence of strings with the above properties. If there are multiple solutions, you may return any one of them.


#Notes
- The answer exists for every value of K allowed by the constraints.

#Constraints
- K will be between 1 and 50,000, inclusive.

#Examples
0)
49
Returns: {"little", "limak" }
The length of "little" is 6 and the number of different characters in "little" is 4. The length of "limak" is 5 and the number of different characters in "limak" is 5. Thus, the total score of the output shown above is 6*4 + 5*5 = 24 + 25 = 49.

1)
15
Returns: {"azz", "xyz" }
3 * 2 + 3 * 3 = 15

2)
704
Returns: {"aaaaaaaaaa", "abcdefghijklmnopqrstuvwxyz", "aabbcc" }
10 * 1 + 26 * 26 + 6 * 3 = 10 + 676 + 18 = 704

3)
37521
Returns: {"aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy", "abcd", "aa", "a", "a", "a" }

4)
1
Returns: {"a" }
