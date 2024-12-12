public class Main {
    public static void main(String[] args) throws Exception {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+79022449309",11, "Apple");
        Phone phone3 = new Phone();
        phone1.print();
        phone2.print();
        phone3.print();

        phone1.receiveCall("Nikita");
        phone2.receiveCall("Nina");
        phone3.receiveCall("Dekan");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("V.V.Putin", "+7(999)888-77-66");

        int count = 10;
        Reader[] readers = new Reader[count];


    }
}
