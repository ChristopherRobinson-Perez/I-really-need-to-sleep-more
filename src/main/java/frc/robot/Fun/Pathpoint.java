// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Fun;

/** Add your docs here. */
public class Pathpoint {

    private double xCoord; 
    private double yCoord; 

    private String collisionOut = "";

    public Pathpoint(double x, double y) {

        xCoord = x; 
        yCoord = y;   
    }

    private String PrintCollisionReadable() {

        for (int q = 0; q < PathConstants.OBSTACLE_COUNT; q++) {

            if (Path.getFieldArray().get(q).isInObstacle(xCoord, yCoord) == true) {

                collisionOut += "t"; 
            } else {

                collisionOut += "f"; 
            }

        }

        return collisionOut;         
    }

    private boolean checkCollisions() {

        for (int w =0; w < PathConstants.OBSTACLE_COUNT; w++) {

            if (Path.getFieldArray().get(w).isInObstacle(xCoord, yCoord) == true) {

                return true; 
            }
        }

        return false; 
    }


}
