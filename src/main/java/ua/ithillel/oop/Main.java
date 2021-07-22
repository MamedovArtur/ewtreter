package ua.ithillel.oop;

public class Main {
    public static void main(String[] args) {
        PList<String> pointList = new PList<>();
        pointList.add("dsfdsgadsgf");
        pointList.add("new Point(3,4)");

        for (int i = 0; i < pointList.size(); i++) {
            System.out.println(pointList.get(i));
        }

    }
}
