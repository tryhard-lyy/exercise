
private static class Node<E> {

    volatile E item;

    volatile Node<E> next;

 

    Node(E item) {

        UNSAFE.putObject(this, itemOffset, item);

    }

 

    boolean casItem(E cmp, E val) {

        return UNSAFE.compareAndSwapObject(this, itemOffset, cmp, val);

    }

 

    void lazySetNext(Node<E> val) {

        UNSAFE.putOrderedObject(this, nextOffset, val);

    }

 

    boolean casNext(Node<E> cmp, Node<E> val) {

        return UNSAFE.compareAndSwapObject(this, nextOffset, cmp, val);

    }

 

    private static final sun.misc.Unsafe UNSAFE;

    private static final long itemOffset;

    private static final long nextOffset;

 

    static {

        try {

            UNSAFE = sun.misc.Unsafe.getUnsafe();

            Class<?> k = Node.class;

            itemOffset = UNSAFE.objectFieldOffset

                (k.getDeclaredField("item"));

            nextOffset = UNSAFE.objectFieldOffset

                (k.getDeclaredField("next"));

        } catch (Exception e) {

            throw new Error(e);

        }

    }

}
