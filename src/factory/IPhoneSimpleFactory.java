package factory;

import model.*;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level) {

        IPhone device = null;

        if ("X".equals(generation)) {

            if ("standard".equals(level)) {
                device = new IPhoneX();
            } else if ("high End".equals(level)) {
                device = new IPhoneXSMax();
            }
            if ("11".equals(generation)) {
                if ("standard".equals(level)) {
                    device = new IPhone11();
                } else if ("highEnd".equals(level)) {
                    device = new IPhone11Pro();
                }

            }
            if (device != null) {
                device.getHardware();
                device.assemble();
                device.certificates();
                device.pack();
            }
        }
        return device;
    }
}
