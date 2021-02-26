// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(0.55, 17, drivetrain),
        new TurnDegrees(-0.35, 90, drivetrain),
        new DriveDistance(0.55, 18.5, drivetrain),
        new TurnDegrees(-0.35, 117.5, drivetrain),
        new DriveDistance(0.55, 29, drivetrain),
        new TurnDegrees(0.35, 117.5, drivetrain),
        new DriveDistance(0.55, 17.25, drivetrain),
        new TurnDegrees(0.35, 88, drivetrain),
        new DriveDistance(0.55, 15, drivetrain)
        
        
        );
  }
}
