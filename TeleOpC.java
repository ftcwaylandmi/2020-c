package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import  com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import  com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="Teleop C", group="11846")
public class TeleOpC extends OpMode {
    Robot myrobot = new Robot();
    int c = 1;
    double left = 0.00;
    double right = 0.00;

    @Override
    public void init() {
        myrobot.initHW(hardwareMap);

    }
   @Override
    public void loop() {
        left = -gamepad1.left_stick_y;
        right = -gamepad2.right_stick_y;

        if (gamepad1.right_bumper) {
            myrobot.LeftDrive(left);
            myrobot.RightDrive(right);
        }else{
            myrobot.RightDrive(right/2);
            myrobot.LeftDrive(left/2);
        }
   }
}