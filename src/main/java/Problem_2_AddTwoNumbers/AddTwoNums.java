package Problem_2_AddTwoNumbers;

import java.math.BigInteger;

public class AddTwoNums {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String revNum1 = "";
        while (l1.next != null) {
            revNum1 += l1.val;
            l1 = l1.next;
        }
        revNum1 += l1.val;

        String revNum2 = "";
        while (l2.next != null) {
            revNum2 += l2.val;
            l2 = l2.next;
        }
        revNum2 += l2.val;

        BigInteger bi1 = new BigInteger(new StringBuilder(revNum1).reverse().toString());
        BigInteger bi2 = new BigInteger(new StringBuilder(revNum2).reverse().toString());
        BigInteger sum = bi1.add(bi2);

        String sumStr = sum.toString();
        String res = new StringBuilder(sumStr).reverse().toString();

        String[] resArr = res.split("");
        ListNode l3 = null;
        for (int i = resArr.length-1; i >= 0; i--) {
            ListNode tmp = l3;
            l3 = new ListNode(Integer.parseInt(resArr[i]));
            l3.next = tmp;
        }

        return l3;
    }
}
