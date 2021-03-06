/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class SampleSubsystem extends Subsystem {

  public boolean isSampleSolenoidExtended = false;

  @Override
  public void initDefaultCommand() {
    // setDefaultCommand(new MySpecialCommand());
  }

  public boolean isSampleSolenoidExtended() {
    return isSampleSolenoidExtended;
  }

  public void setSampleSolenoidExtended(boolean isSampleSolenoidExtended) {
    this.isSampleSolenoidExtended = isSampleSolenoidExtended;
  }
}
