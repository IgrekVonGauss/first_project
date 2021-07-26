package com.company;

public class Array1 {
/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */
  public boolean firstLast6(int[] nums) {
    return nums[0] == 6 || nums[nums.length-1] == 6;
  }

/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
 */
  public boolean sameFirstLast(int[] nums) {
    return nums.length >= 1 && nums[0] == nums[nums.length-1];
  }

/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

makePi() → [3, 1, 4]
 */
  public int[] makePi(int arrayLength) {
    int[] res = new int[arrayLength];
    int pi = (int)(Math.PI * Math.pow(10, arrayLength-1));
    for (int i=0; i<arrayLength; i++){
      res[arrayLength-(i+1)]=pi % 10;
      pi /= 10;
    }
    return res;
  }
/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */
  public boolean commonEnd(int[] a, int[] b) {
    return a[0] == b[0] || a[a.length-1] == b[b.length-1];
  }
/*
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */

  public int sum3(int[] nums) {
    int sum = 0;
    for (int i=0; i < nums.length; i++){
      sum += nums[i];
    }
    return sum;
  }
/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
  public int[] rotateLeft3(int[] nums) {
    int[] res = new int[3];
    for (int i=0; i < nums.length; i++) {
      if (i == nums.length - 1) {
        res[i] = nums[0];
      } else {
        res[i] = nums[i + 1];
      }
    }
    return res;
  }
/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */
  public int[] reverse3(int[] nums) {

  }













}
