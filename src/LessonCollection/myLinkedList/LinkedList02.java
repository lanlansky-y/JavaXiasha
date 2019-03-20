package LessonCollection.myLinkedList;

/**
 * 增加get()
 */
public class LinkedList02 {

    private MyNode first;
    private MyNode last;

    private int size;

    public void add(Object obj) {
        MyNode myNode = new MyNode(obj);

        if (first == null) {
            //myNode.previous = null;
            //myNode.next = null;
            first = myNode;
            last = myNode;
        } else {
            myNode.previous = last;
            myNode.next = null;
            last.next = myNode;
            last = myNode;
        }
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引不合法：" + index);
        }

        MyNode temp = null;
        if (index <= (size >> 1)) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
        }
        return temp.element;
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
        LinkedList02 myLinkedList01 = new LinkedList02();

        myLinkedList01.add("a");
        myLinkedList01.add("b");
        myLinkedList01.add("c");
        myLinkedList01.add("d");
        myLinkedList01.add("e");
        myLinkedList01.add("f");

        System.out.println(myLinkedList01);

        System.out.println(myLinkedList01.get(5));
    }
}
