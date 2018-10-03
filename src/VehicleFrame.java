

public class VehicleFrame implements Chassis{

  private String vehicleFrameType;

  @Override
  public Chassis getChassisType() {
    return null;
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  @Override
  public void getChassisType(String vehicleChassis) {

  }
}
