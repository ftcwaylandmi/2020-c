package org.firstinspires.ftc.teamcode;

import  com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {
    public DcMotor leftfrontdrive = null;
    public DcMotor rightfrontdrive = null;
    public DcMotor leftbackdrive = null;
    public DcMotor rightbackdrive = null;
    public DcMotor test = null;

    HardwareMap hwMap = null;

    public RobotHardware() {

    }

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;

        leftfrontdrive = hwMap.get(DcMotor.class, "lfd");
        rightfrontdrive = hwMap.get(DcMotor.class, "rfd");
        leftbackdrive = hwMap.get(DcMotor.class, "lbd");
        rightbackdrive = hwMap.get(DcMotor.class, "rbd");

        leftfrontdrive.setDirection(DcMotor.Direction.FORWARD);
        rightfrontdrive.setDirection(DcMotor.Direction.FORWARD);
        leftbackdrive.setDirection(DcMotor.Direction.REVERSE);
        rightbackdrive.setDirection(DcMotor.Direction.REVERSE);

    leftfrontdrive.setPower(0);
    rightfrontdrive.setPower(0);
    leftbackdrive.setPower(0);
    rightbackdrive.setPower(0);

    leftfrontdrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    rightfrontdrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    leftbackdrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    rightbackdrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
