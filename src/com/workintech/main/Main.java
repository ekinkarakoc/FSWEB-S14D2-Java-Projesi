package com.workintech.main;

import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(LampType.NEON, true, 100);
        lamp1.turnOn();

        Wall northWall = new Wall(Direction.NORTH);
        Wall soughtWall = new Wall(Direction.SOUTH);
        Wall westWall = new Wall(Direction.WEST);
        Wall eastWall = new Wall(Direction.EAST);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);

        Bedroom bedroom = new Bedroom(northWall, soughtWall, westWall, eastWall, ceiling,
                new Lamp(LampType.LAVA, true, 120),
                "ebeveyn", new Bed("double", 2, 2, 2, 2),
                new Wardrobe(1, 3, 20),
                new Carpet(1, 3, PaintColor.BLUE));

        System.out.println(bedroom);
    }



}