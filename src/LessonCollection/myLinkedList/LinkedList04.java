package LessonCollection.myLinkedList;

//增加insert()
public class LinkedList04 {
    private MyNode first;
    private MyNode last;

    private int size;

    public void add(Object obj) {
        MyNode node = new MyNode(obj);

        if (first == null) {
            first = node;
            last = node;
        } else {
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;

        }
        size++;
    }

    //    ["a","b","c","d","e"]
    public Object get(int index) {
        MyNode temp = getNode(index);
        return temp != null ? temp.element : null;
    }

    public MyNode getNode(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法：" + index);
        }
        MyNode temp = null;
        if (index <= size / 2) {
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
        return temp;
    }

    public void remove(int index) {
        MyNode temp = getNode(index);
        if (temp != null) {
            MyNode up = temp.previous;
            MyNode down = temp.next;

            if (up != null) {
                up.next = down;
            }
            if (down != null) {

                down.previous = up;
            }
            //当要删除第一个节点时
            if (index == 0) {
                first = down;
            }
            //当要删除最后一个节点时
            if (index == size - 1) {
                last = up;
            }
        }
        size--;
    }

    public void insert(int index, Object obj) {
        MyNode node = new MyNode(obj);
        MyNode temp = getNode(index);

        if (temp != null) {
            if (index == 0) {
                first = node;
                node.next = temp;
                temp.previous = node;
            } else if (index == size - 1) {
                last = node;
                node.previous = temp;
                temp.next = node;
            } else {
                MyNode up = temp.previous;
                temp.previous = node;
                node.next = temp;
                up.next = node;
                node.previous = up;
            }
        }
        size++;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        MyNode temp = first;
        while (temp != null) {
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1, ']');

        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList05 list01 = new LinkedList05();
        list01.add("a");
        list01.add("b");
        list01.add("c");
        list01.add("d");
        list01.add("e");

        System.out.println(list01);
        list01.insert(0, "f");
        System.out.println(list01);
        list01.insert(5, "g");
        System.out.println(list01);
        list01.insert(3, "h");
        System.out.println(list01);
    }
}
