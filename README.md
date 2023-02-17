Convert an array to reduced form following Clean Code Principles


Description: Given an array with N distinct elements, convert the given array to a reduced form where all elements are in range from 0 to N-1. 
The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is placed for second smallest element, N-1 is placed for largest element.

Example:
Input:
Array = {5, 10, 40, 30, 20}
Output: 0 1 4 3 2
Explanation: As 5 is smallest element, it's replaced by 0. Then 10 is 2nd smallest element, so it's replaced by 1. Then 20 is 3rd smallest element, so it's replaced by 2. And so on.
