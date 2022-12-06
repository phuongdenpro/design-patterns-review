public class HighEndDeviceFactory extends ElectronicDeviceAbstractFactory{
    @Override
    Phone createPhone() {
        return new HighEndPhone();
    }

    @Override
    Laptop createLaptop() {
        return new HighEndLaptop();
    }
}
