// public class RomanToInt {
//   public static int roman(char r) {
//     if (r == 'I') {
//       return 1;
//     } else if (r == 'V') {
//       return 5;
//     } else if (r == 'X') {
//       return 10;
//     }
//     return 0;
//   }

//   public static void main(String[] args) {
//     String s = "XXX";
//     int val = 0;
//     for (int i = 0; i < s.length(); i++) {
//       char val1, val2;
//       for (int j = i + 1; j <= s.length(); j++) {
//         val1 = s.charAt(i);
//         val2 = s.charAt(j);
//         if (roman(val1) < roman(val2)) {
//           val = roman(val2) - roman(val1);
//           break;
//         } else if (roman(val1) > roman(val2)) {
//           val = roman(val1) + roman(val2);
//           break;
//         } else {
//           val = roman(val1) + roman(val2);
//           break;
//         }
//       }
//       // char temp = s.charAt(i);
//       // val = val + roman(temp);

//     }
//     System.out.println(val);
//   }
// }

/**
 * RomanToInt
 */
public class RomanToInt {
  public static int roman(char r) {
    if (r == 'I') {
      return 1;
    } else if (r == 'V') {
      return 5;
    } else if (r == 'X') {
      return 10;
    } else if (r == 'L') {
      return 50;
    } else if (r == 'C') {
      return 100;
    } else if (r == 'M') {
      return 1000;
    } else if (r == 'D') {
      return 500;
    }
    return 0;
  }

  public static void main(String[] args) {
    String s = "MDCCCLXXXIV";
    int val = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      if (roman(s.charAt(i)) < roman(s.charAt(i + 1))) {
        val = val - roman(s.charAt(i));

      } else if (roman(s.charAt(i)) > roman(s.charAt(i + 1)) || roman(s.charAt(i)) == roman(s.charAt(i + 1))) {
        val = val + roman(s.charAt(i));

      }
      if (i == s.length() - 2) {
        val = val + roman(s.charAt(s.length() - 1));

      }
      // val = val + roman(s.charAt(i));

    }
    if (s.length() == 1) {
      val = val + roman(s.charAt(0));
    }
    System.out.println(val);
  }
}

// class Solution {
// public int romanToInt(String s) {
// int ans = 0, num = 0,num1=0,num3=0;
// for (int i = 0; i<s.length()-1 ; i++) {
// switch(s.charAt(i)) {
// case 'I': num = 1; break;
// case 'V': num = 5; break;
// case 'X': num = 10; break;
// case 'L': num = 50; break;
// case 'C': num = 100; break;
// case 'D': num = 500; break;
// case 'M': num = 1000; break;
// }

// switch(s.charAt(i+1)) {
// case 'I': num1 = 1; break;
// case 'V': num1 = 5; break;
// case 'X': num1 = 10; break;
// case 'L': num1 = 50; break;
// case 'C': num1 = 100; break;
// case 'D': num1 = 500; break;
// case 'M': num1 = 1000; break;
// }

// if(num<num1){
// ans=ans-num;

// }else if(num> num1 || num == num1){
// ans=ans+num1;

// }
// if(i == s.length()-2){
// switch(s.charAt(s.length()-1)) {
// case 'I': num3 = 1; break;
// case 'V': num3 = 5; break;
// case 'X': num3 = 10; break;
// case 'L': num3 = 50; break;
// case 'C': num3 = 100; break;
// case 'D': num3 = 500; break;
// case 'M': num3 = 1000; break;
// }
// ans=ans+num3;

// }

// }
// return ans;
// }

// }