package org.Template;

public class Truck extends VehicleTemplate {
    @Override
    protected void installGearBox() {
        System.out.println("installing a gearbox for trucks");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("Adding extra truck container");
    }
}
