public ListNode mergeKLists(ListNode[] lists) {

        ListNode res = new ListNode(-1);
        if (lists == null || lists.length == 0) {
            return res.next;
        }
        //表示此链表是否已经全加上去
        boolean[] tmp = new boolean[lists.length];
        int min = Integer.MAX_VALUE;
        //记录本轮的最小值在哪个地方
        int minPos = -1;
        //已经遍历完成的链表的数量
        int cntTmp = 0;

        ListNode head = res;

        while (cntTmp < lists.length) {
            for (int i = 0; i < lists.length; i++) {
                //第i条链表还未全部加上去
                if (!tmp[i]) {
                    //第i条链表已经到了null，说明已经全部加上去了
                    if (lists[i] == null) {
                        tmp[i] = true;
                        cntTmp++;
                        continue;
                    }
                    if (min > lists[i].val) {
                        min = lists[i].val;
                        minPos = i;
                    }

                }
            }
            if (min != Integer.MAX_VALUE) {
                res.next = lists[minPos];
                res = res.next;
                lists[minPos] = lists[minPos].next;
                min = Integer.MAX_VALUE;

            }


        }
        return head.next;
    }

