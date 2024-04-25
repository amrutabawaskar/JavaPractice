import algoexpert.AddTwoNumbersLinkedList;
import algoexpert.ListNode;
import algoexpert.TwoNumberSum;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersLinkedListTest {
    @Test
    public void test(){
        AddTwoNumbersLinkedList solution = new AddTwoNumbersLinkedList();

        // Test case 1: 2 -> 4 -> 3 + 5 -> 6 -> 4 = 7 -> 0 -> 8
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        ListNode result = solution.addTwoNumbersLinkedList(l1, l2);
        System.out.println(result.val);
            ListNode prev = null;
            ListNode current = result;

            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
        System.out.println(current.val);
        assertListEquals(expected, current);
    }

    // Helper method to assert if two linked lists are equal
    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {

            Assert.assertEquals(expected.val, actual.val);
            expected=expected.next;
            actual = actual.next;
        }
       Assert.assertNull(expected);
        Assert.assertNull(actual);
    }}

