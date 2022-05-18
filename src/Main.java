public class Main {
    public static void main(String[] args) {

     Voennaya voennaya = new Voennaya();
     voennaya.getPerimeter();
        System.out.println(voennaya.getPerimeter());

        System.out.println();

        Medical medical = new Medical();
        medical.getPerimeter();
        System.out.println(medical.getPerimeter());

        System.out.println();

        Pojarnaia pojarnaia = new Pojarnaia();
        pojarnaia.getPerimeter();
        System.out.println(pojarnaia.getPerimeter());

        System.out.println();

        Futbolnaia futbolnaia = new Futbolnaia();
        futbolnaia.getPerimeter();
        System.out.println(futbolnaia.getPerimeter());

        System.out.println();

        Basketbolnaia basketbolnaia = new Basketbolnaia();
        basketbolnaia.getPerimeter();
        System.out.println(basketbolnaia.getPerimeter());
    }
}