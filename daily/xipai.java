import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class xipai {
    public static void main(String[] args) {
        String[] colors = {"黑桃","方块","梅花","红桃"};
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List<poke> pokes = new ArrayList<>();
        for(int i = 0;i<colors.length;i++){
            for(int j = 0;j<nums.length;j++){
                pokes.add(new poke(colors[i],nums[j]));
            }
        }

        List<poke> stuff = new ArrayList<>();
        while (stuff.size()<pokes.size()){
            Random x = new Random();
            poke pppp = pokes.get(x.nextInt(pokes.size()));
            if(!stuff.contains(pppp)){
                stuff.add(pppp);
            }
        }

        System.out.println("洗牌前："+pokes);
        System.out.println("洗牌后："+stuff);
    }
}
