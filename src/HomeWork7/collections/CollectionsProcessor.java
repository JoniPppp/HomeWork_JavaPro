package HomeWork7.collections;

import java.util.*;

public class CollectionsProcessor {

    public int countOccurance(List<String> list, String string) {
        int occuranceCount = 0;

        for (String k : list) {
            if (k.equals(string)) occuranceCount++;
        }

//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().equals(string)) occuranceCount++;
//        }

        return occuranceCount;
    }

    public List<Integer> toList(int[] array) {
        List<Integer> linkedList = new LinkedList<>();
        for (int k : array) linkedList.add(k);
        return linkedList;
    }


    public ArrayList<Integer> findUnique(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        ArrayList<Integer> notUniqueList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (notUniqueList.contains(list.get(i))) {
                continue;
            }
            ArrayList<Integer> clone = (ArrayList<Integer>) list.clone();
            clone.remove(i);
            if (clone.contains(list.get(i))) {
                notUniqueList.add(list.get(i));
            } else
                uniqueList.add(list.get(i));
        }
        return uniqueList;
    }

    public void calcOccurance(ArrayList<String> list) {
        Map<String, Integer> calcMap = new HashMap<>();
        for (String element : list) {
            if (calcMap.containsKey(element)) calcMap.put(element, calcMap.get(element).intValue() + 1);
            else calcMap.put(element, 1);
        }
        calcMap.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }

    public void findOccurance(ArrayList<String> list) {
        Map<String, Integer> findMap = new HashMap<>();
        for (String element : list) {
            if (findMap.containsKey(element)) findMap.put(element, findMap.get(element).intValue() + 1);
            else findMap.put(element, 1);
        }
        System.out.println("[");
        findMap.forEach((k, v) -> {
            System.out.println("{name: " + "\"" + k + "\"" + ", occurrence: " + v);
        });
        System.out.println("]");
    }
}
