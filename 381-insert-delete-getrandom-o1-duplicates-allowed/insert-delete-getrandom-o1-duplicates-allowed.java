
import java.util.*;

class RandomizedCollection {

    ArrayList<Integer> list;
    HashMap<Integer, HashSet<Integer>> map;
    Random random;

    public RandomizedCollection() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {

        boolean result = !map.containsKey(val);

        map.putIfAbsent(val, new HashSet<>());

        map.get(val).add(list.size());

        list.add(val);

        return result;
    }

    public boolean remove(int val) {

        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val).iterator().next();

        int lastIndex = list.size() - 1;
        int lastValue = list.get(lastIndex);

        map.get(val).remove(index);

        if (index != lastIndex) {

            list.set(index, lastValue);

            map.get(lastValue).remove(lastIndex);
            map.get(lastValue).add(index);
        }

        list.remove(lastIndex);

        if (map.get(val).isEmpty()) {
            map.remove(val);
        }

        return true;
    }

    public int getRandom() {

        int index = random.nextInt(list.size());

        return list.get(index);
    }
}
