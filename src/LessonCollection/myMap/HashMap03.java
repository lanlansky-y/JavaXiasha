package LessonCollection.myMap;

/**
 * @Description: 增加get()方法
 * @author: Yang Yuzhou
 * @date: 2019/3/20
 */
public class HashMap03 {
    Node2[] table;
    int size;

    public HashMap03() {
        table = new Node2[16];//默认一个长度为16的数组，一般是2的整数次幂
    }

    /**
     * put()
     *
     * @param key:键
     * @param value:值
     */
    public void put(Object key, Object value) {
        //定义新节点
        Node2 node = new Node2();
        node.hash = myHash(key.hashCode(), table.length);
        node.key = key;
        node.value = value;
        node.next = null;
        Node2 temp = table[node.hash];
        Node2 lastOne = null;
        boolean keyRepeat = false;//默认一开始key值没有重复


        if (temp == null) {
            //如果此处数组元素为空，则放入新节点
            table[node.hash] = node;
            size++;
        } else {
            //如果不为空
            while (temp != null) {
                //如果传入的元素键值已存在，则覆盖掉原来的元素
                if (temp.key.equals(key)) {
                    keyRepeat = true;
                    temp.value = value;
                    break;
                } else {
                    //键值如果没有重复，则把新元素放在链表的最后
                    lastOne = temp;
                    temp = temp.next;
                }
            }
            if (!keyRepeat) {
                //如果key值没有重复，则新节点添加在最后
                lastOne.next = node;
                size++;
            }
        }


    }

    public Object get(Object key) {
        Object value = null;
        int hash = myHash(key.hashCode(), table.length);
        Node2 temp = table[hash];
        while (temp != null) {
            if (temp.key.equals(key)) {
                value = temp.value;
                break;
            } else {
                temp = temp.next;
            }
        }

        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < table.length; i++) {
            Node2 temp = table[i];
            while (temp != null) {
                sb.append("(" + temp.key + ":" + temp.value + ")" + ",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length() - 1, '}');

        return sb.toString();
    }

    private static int myHash(int k, int length) {
//        System.out.println(k % length);
//        System.out.println(k & length - 1);
        return k & length - 1;
    }

    public static void main(String[] args) {
        HashMap03 m1 = new HashMap03();

        m1.put(10, "aa");
        m1.put(20, "bb");
        m1.put(20, "ee");
        m1.put(30, "cc");
        m1.put(36, "dd");
        m1.put(52, "ff");

        System.out.println(m1.get(20));
    }
}
