package com.backend.ufc.core;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Legos {
    public static void main(String[] args) {
//              var sb = new StringBuilder();
//              sb.append("redd");
//              sb.deleteCharAt(0);
//              sb.delete(1, 2);
//              System.out.println(sb);

        //
//        bool b = null;
//        Boolean bl = null;
//        int i = null;
//        Integer in = null;
//        String s = null;

//       var line = new StringBuilder("-");
//       var anotherLine = line.append("-");
//         System.out.print(line == anotherLine);
//         System.out.print(" ");
//         System.out.print(line.length());

//        String fn = "icecream.txt";
//        try (var w = new BufferedWriter(new FileOutputStream(fn));
//             var s = System.out) {
//            w.write("ALERT!");
//            w.flush();
//            w.write('!');
//            System.out.print("1");
//        } catch (IOException e) {
//            System.out.print("2");
//        } finally {
//            System.out.print("3");
//        }


//        var oldHardDrivePath = Path.get("c://rodent/mouse.txt");
//        var newHardDrivePath = Path.get("d://rodent/rat.txt");
//        Files.move(oldHardDrivePath,newHardDrivePath,
//                StandardCopyOption.REPLACE_EXISTING);


//        var original = List.of(1,2,3,4,5);
//        var copy1 = new CopyOnWriteArrayList<Integer>(original);
//        for(Integer w : copy1)
//            copy1.remove(w);
//        System.out.println(copy1);
//        System.out.println(original);
//        var copy2 = Collections.synchronizedList(original);
//        for(Integer w : copy2)
//            copy2.remove(w);
//        var copy3 = new ArrayList<Integer>(original);
//        for(Integer w : copy3)
//            copy3.remove(w);
//
//        var copy4 = new ConcurrentLinkedQueue<Integer>(original);
//        for(Integer w : copy4)
//            copy4.remove(w);
//        System.out.println(copy4);
//        System.out.println(original);

//        List<Integer> arl = new ArrayList<Integer>();
//        arl.add(2);
//        arl.add(1);
//        arl.add(3);
//        Collections.sort(arl,Comparator.comparingInt(i -> i));
//        System.out.println(arl);
//        Comparator<Integer> comparator = Comparator.comparingInt(i -> i);
//        Collections.sort(arl, comparator.reversed());
//        System.out.println(arl);
//        Comparator<Integer> descendingComparator = (i1, i2) -> Integer.compare(i2, i1);
//        Collections.sort(arl, descendingComparator);
//        System.out.println(arl);

//        boolean carrot = true;
//        Boolean potato = false;
//        var broccoli = true;
//        carrot = carrot & potato;
//        broccoli = broccoli ? !carrot : potato;
//        potato = !broccoli ^ carrot;
//        System.out.println(carrot + "," + potato + "," + broccoli);


//        var sb = new StringBuilder("radical")
//                .insert(sb.length(), "robots");
//        System.out.println(sb);


//        double num1 = 2.718;
//        double num2 = 2._718;
//        double num3 = 2.7_1_8;
//        double num4 = _2.718;
//        double num5 = 23_4.84_4;


//        var teams = new StringBuilder("999");
//        teams.append(" 007");
//        teams.append(" 1901");
//        System.out.print(teams);


//        var dice = new TreeSet<Integer>();
//        dice.add(6);
//        dice.add(6);
//        dice.add(4);
//
//        dice.stream()
//                .filter(n -> n != 4)
//                .forEach(System.out::println);
////                .count();


//        char[][] letters = new char[][] {
//                new char[] { 'a', 'e', 'i', 'o', 'u'},
//                new char[] { 'a', 'e', 'o', 'u'} };
//
//        var x = Arrays.compare(letters[0], letters[0]);
//        var y = Arrays.mismatch(letters[0], letters[0]);
//        var z = Arrays.compare(letters[0], letters[1]);
//        var l = Arrays.mismatch(letters[0], letters[1]);
//
//        System.out.print(x + " " + y + " " + z+" "+l);

//       List<String> strings = new ArrayList<?>();
//        var ints = new HashSet<Integer>();
//        Double dbl = 5.0;
//        ints.add(2);
//        ints.add(null);



//        sortAndSearch("seed", "flower");


//        var ints = new int[] {3,1,4};
//        var others = new int[] {2,7,1,8};
//        System.out.println(Arrays.compare(ints, others));


//         var list = List.of('a', 'c', 'e');
//         Char letter1 = list.get(0);
//         char letter2 = list.get(0);
//         int letter3 = list.get(0);
//         Integer letter4 = list.get(0);
//         Object letter5 = list.get(0);


//        Comparator<Integer> c = (x, y) -> y - x;
//        var ints = Arrays.asList(3, 1, 4);
//        Collections.sort(ints, c);
//        System.out.println(Collections.binarySearch(ints, 1));

//         List<Character> chars = new ArrayList<>();
//         chars.add('a');
//         chars.add('b');
//         chars.clear();
//         chars.remove(0);
//         System.out.print(chars.isEmpty() + " " + chars.length());


//        String[] os = new String[] { "Mac", "Linux", "Windows" };
//        System.out.println(Arrays.binarySearch(os, "Linux"));



//        var list = new ArrayList<String>();
//        list.add("Austin");
//        list.add("Boston");
//        list.add("San Francisco");
//
//        list.removeIf(a -> a.length()> 10);
////        list.removeIf(a -> a.length()< 10);
//        System.out.println(list.size());
//        System.out.println(list);

        var q = new ArrayDeque<String>();
        q.offerFirst("snowball");
        q.offer("sugar");
        q.offerLast("minnie");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.removeFirst());
//        System.out.println(q.re)
        System.out.println(q.size());
    }

    private static void sortAndSearch(String... args) {
        var one = args[0];
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, one);
        System.out.println(result);
        result = Arrays.binarySearch(args, "flower");
        System.out.println(result);
    }

    public static void mains(String... original) {
//              String ... copy = original;
//           Arrays.linearSort(original);
//          Arrays.search(original, "");
//           System.out.println(original.size()
//             + " " + original[0]);
//        }

    }
}
// class Magnet {
//    // line 2
//    var color;
//    public void attach() {
//        // line 3
//        var colors;
//    }
//    // line 4
//    var colors1;
//}

//public class ParkRanger {
//  int birds = 10;
//   public static void main(String[] data) {
//        var trees = 5;
//       System.out.print(trees+birds);
//       }
//}




