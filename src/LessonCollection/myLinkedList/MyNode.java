package LessonCollection.myLinkedList;

/**
 * 链表中的节点
 */
public class MyNode {

    MyNode previous;    //上一个节点
    MyNode next;        //下一个节点
    Object element;     //元素数据

    public MyNode(MyNode previous, MyNode next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public MyNode(Object element) {
        this.element = element;
    }
}
