class Stuff {
    public int number=1;
}

class Main {
    public static void do_things(int y) {
        y+=3;
    }

    public static void do_other_things(Stuff y) {
        y.number+=3;
    }

    public static void main(String[] args) {
        int a=3;
        Stuff myStuff = new Stuff();

        do_things(a);
        do_other_things(myStuff);

        System.out.println("a:"+a+" myStuff.number:"+myStuff.number);
    }
}