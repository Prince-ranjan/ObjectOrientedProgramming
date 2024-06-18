public class Flat {
    int numberOfRooms;
    Boolean isBalconyAvalaviable;
    Boolean parking;
    Boolean personalLift;

    public Flat() {
        numberOfRooms = 3;
        isBalconyAvalaviable = true;
        parking = true;
        personalLift= false;
    }
    public Flat(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        isBalconyAvalaviable = true;
        parking = true;
        personalLift= false;
    }

    public Flat(int numberOfRooms, Boolean isBalconyAvalaviable, Boolean parking) {
        this.numberOfRooms = numberOfRooms;
        this.isBalconyAvalaviable = isBalconyAvalaviable;
        this.parking = parking;
        personalLift= false;
    }

    public Flat(int numberOfRooms, Boolean isBalconyAvalaviable, Boolean parking, Boolean personalLift) {
        this.numberOfRooms = numberOfRooms;
        this.isBalconyAvalaviable = isBalconyAvalaviable;
        this.parking = parking;
        this.personalLift = personalLift;
    }

    public static void main(String[] args) {
        Flat flat1 = new Flat();
        System.out.println(flat1.numberOfRooms);
        System.out.println(flat1.personalLift);

        Flat flat2 = new Flat(7);

        System.out.println(flat2.numberOfRooms);
        System.out.println(flat2.personalLift);

        Flat flat3 = new Flat(1,false,true,true);
        System.out.println(flat3.numberOfRooms);
        System.out.println(flat3.isBalconyAvalaviable);
        System.out.println(flat3.parking);
        System.out.println(flat3.personalLift);
    }
}
