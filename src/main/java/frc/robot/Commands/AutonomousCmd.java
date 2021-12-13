// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;
import java.util.HashSet;
import java.util.Set;

import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Subsystems.AutonomousSys;
import edu.wpi.first.wpilibj2.command.Command;

public class AutonomousCmd implements Command{

    private AutonomousSys mAutonomousSys;

    public AutonomousCmd() {

        mAutonomousSys.getInstance();
    }
    public Set<Subsystem> getRequirements() {

        HashSet<Subsystem> requirements = new HashSet<Subsystem>();
        requirements.add(mAutonomousSys);
        return requirements;
      }

}
