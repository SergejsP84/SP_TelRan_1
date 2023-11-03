package Summary271023;
import java.util.LinkedList;
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    } // constructor
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode thisNode, ListNode nextNode) {
        thisNode.next = nextNode;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                " => " + '}';
    }
    public static void main(String[] args) {
        LinkedList<ListNode> list1 = new LinkedList<>();
        LinkedList<ListNode> list2 = new LinkedList<>();
        list1.add(new ListNode(2));
        list1.add(new ListNode(4));
        list1.add(new ListNode(3));
        list2.add(new ListNode(5));
        list2.add(new ListNode(6));
        list2.add(new ListNode(4));
        for (int i = 0; i < list1.size() - 1; i++) {
            list1.get(i).setNext(list1.get(i+1));
        }
        for (int i = 0; i < list2.size() - 1; i++) {
            list2.get(i).setNext(list2.get(i+1));
        }
        LinkedList<ListNode> resultList = new LinkedList<>();
        int actualNumberForList1 = 0;
        int actualNumberForList2 = 0;
        int larger = Math.max(list1.size(), list2.size());
        int carryover = 0;
        for (int i = 0; i < larger; i++) {
            if ((i == larger - 1) && (list1.get(i).getVal() + list2.get(i).getVal() + carryover > 9)) {
                resultList.add(new ListNode(list1.get(i).getVal() + list2.get(i).getVal() + carryover - 10));
                resultList.add(new ListNode(1));
            } else if (list1.get(i).getVal() + list2.get(i).getVal() + carryover > 9) {
                resultList.add(new ListNode(list1.get(i).getVal() + list2.get(i).getVal() + carryover - 10));
                carryover = 1;
            } else {
                resultList.add(new ListNode(list1.get(i).getVal() + list2.get(i).getVal() + carryover));
                carryover = 0;
            }
        }
        for (int i = 0; i < list2.size() - 1; i++) {
            resultList.get(i).setNext(resultList.get(i+1));
        }
        System.out.println(resultList);

//        for (int i = list1.size()-1; i >= 0; i--) {
//
//            actualNumberForList1 += list1.get(i).getVal() * Math.pow(10, i);
//        }
//        for (int i = list2.size()-1; i >= 0; i--) {
//            actualNumberForList2 += list2.get(i).getVal() * Math.pow(10, i);
//        }
//        int sum = actualNumberForList1 + actualNumberForList2;
//        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println("Actual number 1: " + actualNumberForList1);
//        System.out.println("Actual number 2: " + actualNumberForList2);
//        System.out.println("Sum thereof: " + sum);

    


//        int listSize = Math.max(list1.size(), list2.size());
//        int carryover = 0;
//        LinkedList<ListNode> resultList = new LinkedList<>();
//        int currentIndex = listSize + (Math.max(list1.size(), list2.size()) - Math.min(list1.size(), list2.size()));
//        for (int i = listSize - 1; i >= 0; i--) {
//            list1.
//        }
    }

}

