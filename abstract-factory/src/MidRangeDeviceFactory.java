public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory{
    @Override
    Phone createPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop createLaptop() {
        return new MidRangeLaptop();
    }
}
