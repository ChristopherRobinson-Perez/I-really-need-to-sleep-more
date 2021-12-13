// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.Subsystem;

/** Add your docs here. */
public class AutonomousSys implements Subsystem {


    private static AutonomousSys mAutonomousSys; 

    public AutonomousSys getInstance() {

        if (mAutonomousSys == null) {

            mAutonomousSys = new AutonomousSys(); 
        }

        return mAutonomousSys; 
    }

    
}
