package LessonCollection.myMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 增加泛型, remove()方法(未完成，没有实现删除元素)
 * @author: Yang Yuzhou
 * @date: 2019/3/20
 */
public class HashMap04<K, V> {
    Node3[] table;
    int size;

    public HashMap04() {
        table = new Node3[16];//默认一个长度为16的数组，一般是2的整数次幂
    }

    /**
     * put()
     *
     * @param key:键
     * @param value:值
     */
    public void put(K key, V value) {
        //定义新节点
        Node3 node = new Node3();
        node.hash = myHash(key.hashCode(), table.length);
        node.key = key;
        node.value = value;
        node.next = null;
        Node3 temp = table[node.hash];
        Node3 lastOne = null;
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

    public V get(K key) {
        V value = null;
        int hash = myHash(key.hashCode(), table.length);
        Node3 temp = table[hash];
        while (temp != null) {
            if (temp.key.equals(key)) {
                value = (V) temp.value;
                break;
            } else {
                temp = temp.next;
            }
        }

        return value;
    }

    public V remove(K key) {
        V value = null;
        int hash = myHash(key.hashCode(), table.length);
        Node3 temp = table[hash];
        Node3 tempPre = temp;
        while (temp != null) {
            if (temp.key.equals(key)) {
                tempPre.next = temp.next;
                value = (V)temp.value;
                temp.key = null;
                temp.value = null;
                size--;
                break;
            } else {
                tempPre = temp;
                temp = temp.next;

            }
        }
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < table.length; i++) {
            Node3 temp = table[i];
            while (temp != null) {
                sb.append("(" + temp.key + ":" + temp.value + ")" + ",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length() - 1, '}');

        return sb.toString();
    }

    private static int myHash(int k, int length) {
        return k & length - 1;
    }

    public static void main(String[] args) {
        HashMap04<Integer, String> m1 = new HashMap04<>();

        m1.put(10, "aa");
        m1.put(20, "bb");
        m1.put(20, "ee");
        m1.put(30, "cc");
        m1.put(36, "dd");
        m1.put(52, "ff");

        HashMap<Integer, String> ha = new HashMap<>();
        ha.put(11,"11");
        ha.put(22,"22");
        ha.put(33,"33");
        System.out.println(ha);
        ha.remove(22);
        System.out.println(ha);

        System.out.println(m1.size);
        System.out.println(m1);

        System.out.println(m1.remove(30));
        System.out.println(m1.size);
        System.out.println(m1);
    }
}
