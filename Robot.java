package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.RobotHardware;

public class Robot {
    RobotHardware myself = new RobotHardware();

    public void initHW(HardwareMap ahwMap){
        myself.init(ahwMap);
    }
    public void Drive (double s){
     myself.leftbackdrive.setPower(s);
     myself.rightfrontdrive.setPower(s);
     myself.rightbackdrive.setPower(s);
     myself.leftfrontdrive.setPower(s);
    }
    public void StopDrive(){
        myself.leftfrontdrive.setPower(0);
        myself.rightfrontdrive.setPower(0);
        myself.rightbackdrive.setPower(0);
        myself.leftbackdrive.setPower(0);
    }
    public void SpinRight(double s){
        myself.leftbackdrive.setPower(-s);
        myself.leftfrontdrive.setPower(-s);
        myself.rightbackdrive.setPower(s);
        myself.rightfrontdrive.setPower(s);
    }
    public void RightDrive (double s){
        myself.rightfrontdrive.setPower(s);
        myself.rightbackdrive.setPower(s);
    }
    public void LeftDrive (double s){
        myself.leftfrontdrive.setPower(s);
        myself.leftbackdrive.setPower(s);

    }

}