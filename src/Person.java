public class Person {
    String name;
    int age;
    char gender;
    int phonenumber;

    public void getInfo(Person[] array) {
        int counterm = 0;
        int countf = 0;
        for (Person p : array) {
            if (p.gender == 'm') {
                counterm++;
            } else {
                countf++;
            }
        }
        System.out.println(" men = " + counterm);
        System.out.println("women = " + countf);

    }
}
