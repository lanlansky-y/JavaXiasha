package LessonCollection.myLinkedList;

/**
 * 手动创建一个链表
 */
public class LinkedList01 {

    private MyNode first;
    private MyNode last;

    private int size;

    public void add(Object obj){
        MyNode myNode = new MyNode(obj);

        if(first == null){
            //myNode.previous = null;
            //myNode.next = null;
            first = myNode;
            last = myNode;
        }else {
            myNode.previous = last;
            myNode.next = null;
            last.next = myNode;
            last = myNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        //如果集合为空，则输出[]
        if(first==null){
            sb.append("]");
            return sb.toString();
        }
        //[a,b,c]  first:a      last:c

        MyNode temp = first;
        while (temp!=null){
            sb.append(temp.element+",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList01 myLinkedList01=new LinkedList01();

        myLinkedList01.add("a");
        myLinkedList01.add("b");
        myLinkedList01.add("c");

        System.out.println(myLinkedList01);
    }
}
