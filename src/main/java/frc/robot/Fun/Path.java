// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Fun;

import java.util.ArrayList;

/** Add your docs here. */
public class Path {

    private static ArrayList<FieldElement> obstacles; 

    public static ArrayList<FieldElement> getFieldArray() {

        if (obstacles == null) {

            obstacles = new ArrayList<FieldElement>();

            obstacles.add(new FieldElement(0, 1, 0, 1));
        }

        return obstacles; 
    }

    private static ArrayList<Pathpoint> path;

    public static ArrayList<Pathpoint> getPath() {

        if (path == null) {

            path = new ArrayList<Pathpoint>();
        }

        return path;
    }

}
