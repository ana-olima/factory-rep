package model;

public class IPhone11Pro extends IPhone {

    @Override
    public void getHardware() {

        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- 4.5 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512 Gb Memory");
    }
}
