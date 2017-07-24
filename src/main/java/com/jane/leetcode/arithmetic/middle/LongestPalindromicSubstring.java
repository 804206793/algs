package com.jane.leetcode.arithmetic.middle;

import java.util.*;

/**
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 * Created by wang_gkun on 2017/7/22.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        System.out.println( R - L - 1);
        return R - L - 1;
    }

//    public String longestPalindrome(String s) {
//        String longStr = "",temp;
//        int len=0,tlen=0;
//        if (s.length() == 0) return longStr;
//        if (s.length() == 1) return s;
//        if (isPalindromicStr(s)) return s;
//        String tempStr = s.replaceAll("(?s)(.)(?=.*\\1)", ""); //去重复
//        String[] arr = tempStr.split("");
//        for (String s1 : arr) {
//            temp = getLongestStr(s,s1,tlen);
//            tlen =  temp.length();
//            if (temp.length()>len){
//                longStr=temp;
//                len =tlen;
//            }
//        }
//        return longStr;
//
//    }
//
//
//
//
//    private boolean isPalindromicStr(String string) {
//        boolean isPalStr = true;
//        for (int i = 0, len = string.length() - 1; i <= len / 2; i++) {
//            if (string.charAt(i) != string.charAt(len - i)) {
//                isPalStr = false;
//                break;
//            }
//        }
//        return isPalStr;
//    }
//
//    private String getLongestStr(String str, String c,int len){
//        String result ="",tempStr,tempStr1 ;
//        int fi,li=0;
//        while (true){
//            fi = str.indexOf(c, li);
//            li = getNextIndex(str,c, fi,fi);
////            if (li-fi+1<=len)continue;
//            tempStr = getBinaryStr(str,c,fi,li,c);
//            result = result.length()>tempStr.length()?result:tempStr;
//            if (str.indexOf(c, li+1)==-1) break;
//        }
//      return result;
//    }
//
//
//    private String getBinaryStr(String str, String c, int firstIndex, int lastIndex,String curStr){
//        int fi = str.lastIndexOf(c, firstIndex);
//        int finext = str.lastIndexOf(c, fi-1);
//        int li = str.indexOf(c, lastIndex);
//        int linext = str.indexOf(c, li+1);
//        String temp1;
//        if (li ==-1||fi==-1) {
//            if (lastIndex+1 <= str.length()-1) {
//                temp1 = str.substring(firstIndex,lastIndex+1);
//                if (isPalindromicStr(temp1)) {
//                    return getBinaryStr(str,temp1.substring(0,1),firstIndex-2,lastIndex+3,temp1);
//                }
//            }
//            return curStr;
//        }
//        String temp = str.substring(fi,li+1);
//        if(li-fi==1)return getBinaryStr(str,c,fi,li+1,temp);
//        if (!isPalindromicStr(temp)){
//            return curStr;
//        }
//        else if (finext == -1&&linext !=-1) return getBinaryStr(str,c,fi,linext,temp);
//        else if (finext != -1&&linext ==-1) return getBinaryStr(str,c,finext,li,temp);
//        else if (fi == 0 || li == str.length()) return temp;
//        else  return getBinaryStr(str,c,fi-1,li+1,temp);
//    }
//
//    private int getNextIndex(String str,String c,int li,int li1){
//        int linext = str.indexOf(c, li1+1);
//        if (linext == -1) return li1;
//        if (linext-li1 !=1&&li!=li1) return li1;
//        if (linext-li1 !=1&&li==li1) return linext;
//        else return getNextIndex(str,c,li,linext);
//    }





    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
//        String str = "mwwfjysbkebpdjyabcfkgprtxpwvhglddhmvaprcvrnuxifcrjpdgnktvmggmguiiquibmtviwjsqwtchkqgxqwljouunurcdtoeygdqmijdympcamawnlzsxucbpqtuwkjfqnzvvvigifyvymfhtppqamlgjozvebygkxawcbwtouaankxsjrteeijpuzbsfsjwxejtfrancoekxgfyangvzjkdskhssdjvkvdskjtiybqgsmpxmghvvicmjxqtxdowkjhmlnfcpbtwvtmjhnzntxyfxyinmqzivxkwigkondghzmbioelmepgfttczskvqfejfiibxjcuyevvpawybcvvxtxycrfbcnpvkzryrqujqaqhoagdmofgdcbhvlwgwmsmhomknbanvntspvvhvccedzzngdywuccxrnzbtchisdwsrfdqpcwknwqvalczznilujdrlevncdsyuhnpmheukottewtkuzhookcsvctsqwwdvfjxifpfsqxpmpwospndozcdbfhselfdltmpujlnhfzjcgnbgprvopxklmlgrlbldzpnkhvhkybpgtzipzotrgzkdrqntnuaqyaplcybqyvidwcfcuxinchretgvfaepmgilbrtxgqoddzyjmmupkjqcypdpfhpkhitfegickfszermqhkwmffdizeoprmnlzbjcwfnqyvmhtdekmfhqwaftlyydirjnojbrieutjhymfpflsfemkqsoewbojwluqdckmzixwxufrdpqnwvwpbavosnvjqxqbosctttxvsbmqpnolfmapywtpfaotzmyjwnd";
        String str = "babad";
        String a = longestPalindromicSubstring.longestPalindrome(str);
        System.out.println(a);


    }

}
